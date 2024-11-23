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
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package influent.server.spi.impl.anb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Entity
{
    private String attrEntityId;
    private String attrIdentity;
    private Icon icon;
    private CardCollection cardCollection;
    
    //------------------------------------------------------------------------------------------------------------------
    
    public Entity() {}
    
    //------------------------------------------------------------------------------------------------------------------

  	@XmlAttribute
    public void setAttrEntityId(String attrEntityId) {
  		this.attrEntityId = attrEntityId;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	public String getAttrEntityId() {
  		return this.attrEntityId;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	@XmlAttribute
    public void setAttrIdentity(String attrIdentity) {
  		this.attrIdentity = attrIdentity;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	public String getAttrIdentity() {
  		return this.attrIdentity;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	@XmlElement
  	public void setIcon(Icon icon) {
  		this.icon = icon;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	public Icon getIcon() {
  		return this.icon;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	@XmlElement
  	public void setCardCollection(CardCollection cardCollection) {
  		this.cardCollection = cardCollection;
  	}
  	
  	//------------------------------------------------------------------------------------------------------------------

  	public CardCollection getCardCollection() {
  		return this.cardCollection;
  	}
}
