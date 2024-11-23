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
package influent.entity.clustering.kiva.batchjob;

import influent.server.utilities.BoneCPConnectionPool;
import influent.server.utilities.SQLConnectionPool;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerateClusterDataSet {
	
	private static Logger s_logger = LoggerFactory.getLogger(GenerateClusterDataSet.class);
	
	public static void writeEntitiesToFile(ResultSet rs, String outputPath) throws SQLException, FileNotFoundException, UnsupportedEncodingException {
		int filenum = 1;
		int i = 1;
		PrintWriter writer = new PrintWriter(outputPath + filenum, "UTF-8");
		
		while (rs.next()) {
			String type = rs.getString("type");
			String id = rs.getString("id");
			String label = rs.getString("label");
			String countrycode = rs.getString("countrycode");
			double lat = rs.getDouble("lat");
			double lon = rs.getDouble("lon");
			
			writer.println(type + "," + id + "," + countrycode + "," + lat + "," + lon + "," + label.replaceAll(",", " "));
			
			if ((i % 100000) == 0) {   // store 100000 entities per file
				filenum++;
				writer.flush();
				writer.close();
				writer = new PrintWriter(outputPath + filenum, "UTF-8");
			}
			i++;  // increment the entity count
		}
		writer.flush();
		writer.close();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			String serverName = "azure";
			int portNumber = 1433;
			String databaseName = "Kiva";
			String username = "kiva";
			String password = "kiva";
			

			SQLConnectionPool connection = new BoneCPConnectionPool(serverName, portNumber, databaseName, username, password, null);
			
			// Create Borrowers Dataset
			String sql = "SELECT 'borrower' as type, 'b' + CONVERT(nvarchar, loans_id) as id, loans_name as label, loans_location_countryCode as countrycode, lat, lon FROM loanMetaData";
			Statement stmt = connection.getConnection().createStatement();
			
			s_logger.trace("execute: " + sql);
			if (stmt.execute(sql))  {
				ResultSet rs = stmt.getResultSet();
				writeEntitiesToFile(rs, "dataset/borrowers");
			}
			
			// Create Lender Dataset
			sql = "SELECT 'lender' as type, 'l' + lenders_lenderid as id, lenders_name as label, lenders_countryCode as countrycode, lat, lon FROM lenders";
			stmt = connection.getConnection().createStatement();
			
			s_logger.trace("execute: " + sql);
			if (stmt.execute(sql))  {
				ResultSet rs = stmt.getResultSet();
				writeEntitiesToFile(rs, "dataset/lenders");
			}
			
			// Create Broker Dataset
			sql = "SELECT 'broker' as type, b.entityId as id, partners_name as label, partners_countries_isoCode as countryCode, lat, lon ";
			sql += " FROM partnersMetaData p ";
			sql += " JOIN PartnerBroker b ";
			sql += "   ON b.rawEntityId = 'p' + CONVERT(nvarchar, p.partners_id) ";
			sql += " JOIN partnerCountries c ON (p.partners_id = c.partners_id)";
			stmt = connection.getConnection().createStatement();
			
			s_logger.trace("execute: " + sql);
			if (stmt.execute(sql))  {
				ResultSet rs = stmt.getResultSet();
				writeEntitiesToFile(rs, "dataset/partners");
			}
			
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
