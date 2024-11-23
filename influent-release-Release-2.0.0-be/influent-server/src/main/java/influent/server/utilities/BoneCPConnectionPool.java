/**
 * Copyright (c) 2013-2014 Oculus Info Inc.
 * http://www.oculusinfo.com/
 *
 * Released under the MIT License.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package influent.server.utilities;

import influent.server.spi.SQLConnectionUrl;
import influent.server.spi.SQLServerConnectionUrl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.constructs.blocking.CacheEntryFactory;
import net.sf.ehcache.constructs.blocking.SelfPopulatingCache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;


public class BoneCPConnectionPool implements SQLConnectionPool {
	
	private static final Logger s_logger = LoggerFactory.getLogger(SQLConnectionPool.class);

	private BoneCP connectionPool = null;
	private final SelfPopulatingCache cache;
	
    private final SQLConnectionUrl url;
	private final String username;
	private final String password;
	
	public BoneCPConnectionPool(
			String serverName,
			Integer portNumber,
			String databaseName,
			String username,
			String password,
			String ehCacheConfig
	) {
		this(new SQLServerConnectionUrl(serverName, portNumber, databaseName), username, password, ehCacheConfig);
	}
	
	public BoneCPConnectionPool(
		SQLConnectionUrl url,
		String username,
		String password,
		String ehCacheConfig
	) {
		this.url = url;
		this.username = username;
		this.password = password;
		
		try {
			getConnection().close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CacheManager cacheManager = null;
		
		if (ehCacheConfig != null) {
			cacheManager = CacheManager.create(ehCacheConfig);
		} else {
			s_logger.warn("midtier ehcache property not set, queries won't be cached");
			cache=null;
			return;
			//cacheManager = CacheManager.getInstance();
		}
		
		Cache queryCache = cacheManager.getCache("QueryCache");

		// push the added cache behavior on, which allows gets to wait on the
		// same createEntry call if multiple clients ask for it at once.
		cache = new SelfPopulatingCache(queryCache, new CacheEntryFactory() {
			@Override
			public Object createEntry(Object sql) throws Exception {
				return doQueryDatabase((String)sql);
			}
		});
		
		cacheManager.replaceCacheWithDecoratedCache(queryCache, cache);
	}
	
	
	
	
	@Override
	public void finalize() throws Throwable {
		shutdownConnectionPool();
		super.finalize();
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		if (connectionPool == null) {
			Class.forName(url.getDriver()); 
			
			BoneCPConfig config = new BoneCPConfig();
			config.setJdbcUrl(url.getUrl());
			config.setUsername(username);
			config.setPassword(password);
			connectionPool = new BoneCP(config);
			
//			connectionPool = DriverManager.getConnection(getConnectionUrl(), username, password);
			s_logger.info("Connected to " + url);
		}
		
		return connectionPool.getConnection();
    }
	
	
	
	
	public void shutdownConnectionPool() throws SQLException {
		if (connectionPool != null) {
			connectionPool.shutdown();
		}
		connectionPool = null;
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public List<List<String>> queryDatabase(String selection) throws Exception{
		if (cache == null) {
			s_logger.warn("Query caching is disabled!");
			return doQueryDatabase(selection);
		}
		return (List<List<String>>) cache.get(selection).getObjectValue();
	}
	
	
	
	
	private List<List<String>> doQueryDatabase(String selection) throws ClassNotFoundException, SQLException {
		List<List<String>> returnList = new ArrayList<List<String>>();
		
    	Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		
		s_logger.trace(selection);
		ResultSet rs = stmt.executeQuery(selection);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columns = rsmd.getColumnCount();
		
		while (rs.next()) {
			
			List<String> row = new ArrayList<String>();
			for (int i = 1; i <= columns; i++) {
				row.add(rs.getString(i));
			}
			returnList.add(row);
		}
		
		rs.close();
		stmt.close();
		connection.close();
		
		return returnList;
	}
	
	
	
	
	public int updateDatabase(String update) throws ClassNotFoundException, SQLException {
		
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		
		s_logger.trace(update);
		int result = stmt.executeUpdate(update);
		stmt.close();
		connection.close();
		return result;
	}	
}
