/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Type of entity associated with desired links
	 
	 ADDED IN 1.6 */
@org.apache.avro.specific.AvroGenerated
public enum FL_LinkEntityTypeFilter { 
  ACCOUNT_OWNER, ACCOUNT, CLUSTER_SUMMARY, ANY  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"FL_LinkEntityTypeFilter\",\"namespace\":\"influent.idl\",\"doc\":\"Type of entity associated with desired links\\n\\t \\n\\t ADDED IN 1.6\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"CLUSTER_SUMMARY\",\"ANY\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
}
