/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** * The set of results from a single search call. Each item also has a match score. */
@org.apache.avro.specific.AvroGenerated
public class FL_SearchResults extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_SearchResults\",\"namespace\":\"influent.idl\",\"doc\":\"* The set of results from a single search call. Each item also has a match score.\",\"fields\":[{\"name\":\"total\",\"type\":\"long\",\"doc\":\"total number of results FOUND, which may be more than the number returned.\",\"default\":0},{\"name\":\"results\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_SearchResult\",\"doc\":\"* A single search result\",\"fields\":[{\"name\":\"matchScore\",\"type\":\"double\",\"doc\":\"search match score\",\"default\":0},{\"name\":\"result\",\"type\":[{\"type\":\"record\",\"name\":\"FL_Entity\",\"doc\":\"* The nodes in the social, financial, communications or other graphs. May represent concrete individuals or organizations,\\n\\t * specific proxies such as accounts, or the implicit individuals or groups behind those other entities.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"This uid must represent either (1) a globally unique identifier that can be used to retrieve data for an\\n\\t\\t\\texplicit entity, or (2) encoded query information that can be used to find a set of associated record\\n\\t\\t\\tnotionally representing an implicit entity (e.g. Loans&FirstName&LastName&Gender). Must not be used for\\n\\t\\t\\tIDs that aren't globally unique.  For example, in Kiva, \\\"Lenders\\\" has a UID (\\\"L12345\\\") while \\\"Borrowers\\\"\\n\\t\\t\\thave an encoded search in the Loans table for uid (\\\"B{loan:23456;name=Daniel}\\\").  The encoded information\\n\\t\\t\\tis data layer-specific, may be different from entity to entity or data set to data set, and should be\\n\\t\\t\\tconsidered opaque to the consumers of the entities.  Entities of type 2 should always have the Entity Tag\\n\\t\\t\\tANONYMOUS to help distinguish them when required.\"},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"type\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"FL_EntityTag\",\"doc\":\"* This is the current list of tags for Entities:\\n\\t *\\n\\t * CHANGED in 1.6:\\n\\t * - added ACCOUNT_OWNER, CLUSTER_SUMMARY\\n\\t *\\n\\t * CHANGED in 1.7:\\n\\t * - added PROMPT_FOR_DETAILS\\n\\t *\\n\\t * CHANGED in 1.8:\\n\\t * - added UNBRANCHABLE\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"CLUSTER_SUMMARY\",\"FILE\",\"ANONYMOUS\",\"UNBRANCHABLE\",\"PROMPT_FOR_DETAILS\",\"OTHER\"]}},\"doc\":\"Entity Tags (see above, e.g. \\\"ACCOUNT\\\")\"},{\"name\":\"provenance\",\"type\":[{\"type\":\"record\",\"name\":\"FL_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[{\"type\":\"record\",\"name\":\"FL_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a required field in any service calls.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express original source confidence as a single number from 0 to 1.\",\"default\":1},{\"name\":\"currency\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express confidence in currency of data as a single number from 0 to 1.\",\"default\":1}]},\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_Property\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type information, as well as optional\\n\\t * provenance. Tags provide a way for the data provider to associate semantic annotations to each property\\n\\t * in terms of the semantics of the application.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[{\"type\":\"record\",\"name\":\"FL_SingletonRange\",\"doc\":\"* Single value\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",{\"type\":\"record\",\"name\":\"FL_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"ISO 3 digit country code\",\"default\":null}]}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"FL_PropertyType\",\"doc\":\"* Allowed types for Property values.\\n\\t *\\n\\t * CHANGED in 1.9\",\"symbols\":[\"FLOAT\",\"DOUBLE\",\"INTEGER\",\"LONG\",\"BOOLEAN\",\"STRING\",\"IMAGE\",\"DATE\",\"GEO\"]},\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO, IMAGE\"}]},{\"type\":\"record\",\"name\":\"FL_ListRange\",\"doc\":\"* List of values\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\"]}},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"}]},{\"type\":\"record\",\"name\":\"FL_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"}]},{\"type\":\"record\",\"name\":\"FL_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\n\\t *\\n\\t * ADDED IN 1.6\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\n\\t *\\n\\t * ADDED IN 1.6\",\"fields\":[{\"name\":\"range\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"FL_ListRange\",\"FL_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]}}},{\"name\":\"rangeType\",\"type\":{\"type\":\"enum\",\"name\":\"FL_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},\"doc\":\"Describes how the values in the distribution are summarised\"},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"The type of value that the distribution describes. One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]}],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"null\",\"FL_Provenance\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"null\",\"FL_Uncertainty\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"enum\",\"name\":\"FL_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and application concepts,\\n\\t * independent of the data sources. This allows application semantics to be re-used with new\\n\\t * data, with a minimum of new software design and development. Data layer entity types, link\\n\\t * types and properties should be mapped into the list of tags. The application layer must be\\n\\t * able to search by native field name or by tag interchangeably, and properties returned must\\n\\t * contain both native field names as well as tags.\\n\\t *\\n\\t * The list of tags may change as application features evolve, though that wi","ll require\\n\\t * collaboration with the data layer providers. Evolving the tag list should not change the\\n\\t * Data Access or Search APIs.\\n\\t *\\n\\t * This is the current list of tags for Properties:\\n\\t *\\n\\t * CHANGED in 1.5:\\n\\t * - CREDIT/DEBIT changed to INFLOWING/OUTFLOWING\\n\\t * - added USD\\n\\t * - added DURATION\\n\\t *\\n\\t * CHANGED in 1.6:\\n\\t * - added ENTITY_TYPE\\n\\t * - added ACCOUNT_OWNER, CLUSTER_SUMMARY, COUNTRY_CODE\\n\\t *\\n\\t * CHANGED in 1.7:\\n\\t * - added CLUSTER\\n\\t *\\n\\t * CHANGED in 1.8:\\n\\t * - added TOPIC\\n\\t *\\n\\t * CHANGED in 1.9:\\n\\t * - added HTML\\n\\t *\\n\\t * CHANGED in 2.0:\\n\\t * - added UNITS\\n\\t * - added FROM_LABEL\\n\\t * - added TO_LABEL\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"CLUSTER\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"HTML\",\"TOPIC\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"UNITS\",\"USD\",\"DURATION\",\"ENTITY\",\"SHARED_IDENTIFIER\",\"FROM_LABEL\",\"TO_LABEL\"]}},\"doc\":\"one or more tags from the Tag list, used to map this source-specific field into the semantics of applications\"},{\"name\":\"isHidden\",\"type\":\"boolean\",\"doc\":\"true if this property is hidden from the client\",\"default\":false}]}}}]},{\"type\":\"record\",\"name\":\"FL_Link\",\"doc\":\"* The links in the social, financial, communications or other graphs. May represent communication\\n\\t * events, financial transactions or social connections.\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"This uid must represent either (1) a globally unique identifier that can be used to retrieve data for an\\n\\t\\t\\texplicit link, or (2) encoded query information that can be used to find a set of associated record\\n\\t\\t\\tnotionally representing an implicit link (e.g. Source&Target&Date&Amount). Must not be used for\\n\\t\\t\\tIDs that aren't globally unique.\"},{\"name\":\"linkTypes\",\"type\":[{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},\"null\"],\"doc\":\"link types\",\"default\":null},{\"name\":\"source\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"type\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"],\"doc\":\"type\"},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[\"FL_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"FL_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"FL_Property\"}}]}],\"doc\":\"search result\"}]}},\"doc\":\"array of Items (Entities or Links) with match scores\"},{\"name\":\"keyProperties\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"FL_PropertyDescriptors\",\"doc\":\"* An instance of PropertyDescriptors is used to contain the dataset-specific type and property descriptions returned\\n\\t * by getDescriptors()\\n\\t *\\n\\t * ADDED IN 1.8\",\"fields\":[{\"name\":\"searchHint\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_PropertyDescriptor\",\"doc\":\"* Used to describe data properties and their constraints\\n\\t *\\n\\t * The 'memberOf' parameter is a list of FL_TypeMapping that describes the property in the given types.\\n\\t *\\n\\t * ADDED IN 1.8\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"property descriptor unique key\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"a human readable property name to display if the key isn't friendly (optional)\",\"default\":null},{\"name\":\"propertyType\",\"type\":\"FL_PropertyType\",\"doc\":\"data type of the property\"},{\"name\":\"range\",\"type\":[\"FL_RangeType\",\"null\"],\"doc\":\"range of the Property to search on\"},{\"name\":\"memberOf\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_TypeMapping\",\"doc\":\"* Used to describe how an FL_PropertyDescriptor maps to given a type.\\n\\t *\\n\\t * ADDED IN 1.8\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The type that the mapping applies to *\"},{\"name\":\"memberKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"field that the FL_Property maps to in the type *\"}]}},\"doc\":\"List of mappings against types to which this property belongs,  *\"},{\"name\":\"constraint\",\"type\":[{\"type\":\"enum\",\"name\":\"FL_Constraint\",\"doc\":\"* Property value matching constraints\\n\\t *\\n\\t * ADDED IN 1.5\\n\\t * MOVED IN 2.0\",\"symbols\":[\"REQUIRED_EQUALS\",\"FUZZY_PARTIAL_OPTIONAL\",\"NOT\",\"OPTIONAL_EQUALS\",\"FUZZY_REQUIRED\"]},\"null\"],\"doc\":\"REQUIRED_EQUALS, FUZZY_PARTIAL_OPTIONAL, NOT, OPTIONAL_EQUALS, FUZZY_REQUIRED\"},{\"name\":\"searchableBy\",\"type\":{\"type\":\"enum\",\"name\":\"FL_SearchableBy\",\"doc\":\"* Used to describe in which contexts a term can (or should) be searched. Free text searches\\n\\t * do not describe properties to which they apply, and are often best restricted to\\n\\t * identity fields like names.\\n\\t *\\n\\t * ADDED IN 1.8\\n\\t * MOVED IN 2.0\",\"symbols\":[\"FREE_TEXT\",\"DESCRIPTOR\",\"NONE\"]},\"doc\":\"indicates whether this property is indexed for free text queries, or not at all *\",\"default\":\"DESCRIPTOR\"},{\"name\":\"levelOfDetail\",\"type\":{\"type\":\"enum\",\"name\":\"FL_LevelOfDetail\",\"doc\":\"* Amount of detail requested\\n\\t *\\n\\t * ADDED IN 1.6\\n\\t *\\n\\t * CHANGED in 2.0:\\n\\t * - added KEY\",\"symbols\":[\"KEY\",\"SUMMARY\",\"FULL\",\"HIDDEN\"]},\"doc\":\"Minimum amount of detail that this property is included in *\",\"default\":\"FULL\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"FL_PropertyTag\"},\"doc\":\"List of tags that belong to this property *\"},{\"name\":\"sortable\",\"type\":\"boolean\",\"doc\":\"indicates whether this property can be used to sort *\",\"default\":true},{\"name\":\"multiValue\",\"type\":\"boolean\",\"doc\":\"indicates whether this property can have multiple values *\",\"default\":false}]}},\"default\":null},{\"name\":\"types\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_TypeDescriptor\",\"doc\":\"* Used to describe applicable types for a searchable property. Types may be grouped with the 'group' parameter.\\n\\t *\\n\\t * ADDED IN 1.8\",\"fields\":[{\"name\":\"key\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"unique key of the type descriptor applicable to a property *\"},{\"name\":\"friendlyText\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"a human readable type name to display if the key isn't friendly (optional)\",\"default\":null},{\"name\":\"group\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Group name (optional) *\",\"default\":null},{\"name\":\"exclusive\",\"type\":\"boolean\",\"doc\":\"Indicates whether searching within the defined group is exclusive *\",\"default\":true},{\"name\":\"namespace\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"the namespace the type is linked to *\"}]}},\"default\":null},{\"name\":\"orderBy\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FL_OrderBy\",\"doc\":\"* Ordering instructions for records, as specified in search requests.\\n\\t *\\n\\t * ADDED IN 2.0\",\"fields\":[{\"name\":\"propertyKey\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"The key of the property value to order by\"},{\"name\":\"ascending\",\"type\":\"boolean\",\"doc\":\"ascending? (or descending)\",\"default\":false}]}}],\"default\":null},{\"name\":\"groupField\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}],\"doc\":\"descriptions of key properties, or null to accept defaults.\",\"default\":null},{\"name\":\"levelOfDetail\",\"type\":\"FL_LevelOfDetail\",\"doc\":\"level of detail of the contained results\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** total number of results FOUND, which may be more than the number returned. */
   private long total;
  /** array of Items (Entities or Links) with match scores */
   private java.util.List<influent.idl.FL_SearchResult> results;
  /** descriptions of key properties, or null to accept defaults. */
   private influent.idl.FL_PropertyDescriptors keyProperties;
  /** level of detail of the contained results */
   private influent.idl.FL_LevelOfDetail levelOfDetail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FL_SearchResults() {}

  /**
   * All-args constructor.
   */
  public FL_SearchResults(java.lang.Long total, java.util.List<influent.idl.FL_SearchResult> results, influent.idl.FL_PropertyDescriptors keyProperties, influent.idl.FL_LevelOfDetail levelOfDetail) {
    this.total = total;
    this.results = results;
    this.keyProperties = keyProperties;
    this.levelOfDetail = levelOfDetail;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return total;
    case 1: return results;
    case 2: return keyProperties;
    case 3: return levelOfDetail;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: total = (java.lang.Long)value$; break;
    case 1: results = (java.util.List<influent.idl.FL_SearchResult>)value$; break;
    case 2: keyProperties = (influent.idl.FL_PropertyDescriptors)value$; break;
    case 3: levelOfDetail = (influent.idl.FL_LevelOfDetail)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'total' field.
   * total number of results FOUND, which may be more than the number returned.   */
  public java.lang.Long getTotal() {
    return total;
  }

  /**
   * Sets the value of the 'total' field.
   * total number of results FOUND, which may be more than the number returned.   * @param value the value to set.
   */
  public void setTotal(java.lang.Long value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'results' field.
   * array of Items (Entities or Links) with match scores   */
  public java.util.List<influent.idl.FL_SearchResult> getResults() {
    return results;
  }

  /**
   * Sets the value of the 'results' field.
   * array of Items (Entities or Links) with match scores   * @param value the value to set.
   */
  public void setResults(java.util.List<influent.idl.FL_SearchResult> value) {
    this.results = value;
  }

  /**
   * Gets the value of the 'keyProperties' field.
   * descriptions of key properties, or null to accept defaults.   */
  public influent.idl.FL_PropertyDescriptors getKeyProperties() {
    return keyProperties;
  }

  /**
   * Sets the value of the 'keyProperties' field.
   * descriptions of key properties, or null to accept defaults.   * @param value the value to set.
   */
  public void setKeyProperties(influent.idl.FL_PropertyDescriptors value) {
    this.keyProperties = value;
  }

  /**
   * Gets the value of the 'levelOfDetail' field.
   * level of detail of the contained results   */
  public influent.idl.FL_LevelOfDetail getLevelOfDetail() {
    return levelOfDetail;
  }

  /**
   * Sets the value of the 'levelOfDetail' field.
   * level of detail of the contained results   * @param value the value to set.
   */
  public void setLevelOfDetail(influent.idl.FL_LevelOfDetail value) {
    this.levelOfDetail = value;
  }

  /** Creates a new FL_SearchResults RecordBuilder */
  public static influent.idl.FL_SearchResults.Builder newBuilder() {
    return new influent.idl.FL_SearchResults.Builder();
  }
  
  /** Creates a new FL_SearchResults RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_SearchResults.Builder newBuilder(influent.idl.FL_SearchResults.Builder other) {
    return new influent.idl.FL_SearchResults.Builder(other);
  }
  
  /** Creates a new FL_SearchResults RecordBuilder by copying an existing FL_SearchResults instance */
  public static influent.idl.FL_SearchResults.Builder newBuilder(influent.idl.FL_SearchResults other) {
    return new influent.idl.FL_SearchResults.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_SearchResults instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_SearchResults>
    implements org.apache.avro.data.RecordBuilder<FL_SearchResults> {

    private long total;
    private java.util.List<influent.idl.FL_SearchResult> results;
    private influent.idl.FL_PropertyDescriptors keyProperties;
    private influent.idl.FL_LevelOfDetail levelOfDetail;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_SearchResults.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_SearchResults.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.results)) {
        this.results = data().deepCopy(fields()[1].schema(), other.results);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyProperties)) {
        this.keyProperties = data().deepCopy(fields()[2].schema(), other.keyProperties);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.levelOfDetail)) {
        this.levelOfDetail = data().deepCopy(fields()[3].schema(), other.levelOfDetail);
        fieldSetFlags()[3] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FL_SearchResults instance */
    private Builder(influent.idl.FL_SearchResults other) {
            super(influent.idl.FL_SearchResults.SCHEMA$);
      if (isValidValue(fields()[0], other.total)) {
        this.total = data().deepCopy(fields()[0].schema(), other.total);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.results)) {
        this.results = data().deepCopy(fields()[1].schema(), other.results);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.keyProperties)) {
        this.keyProperties = data().deepCopy(fields()[2].schema(), other.keyProperties);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.levelOfDetail)) {
        this.levelOfDetail = data().deepCopy(fields()[3].schema(), other.levelOfDetail);
        fieldSetFlags()[3] = true;
      }
    }

    /** Gets the value of the 'total' field */
    public java.lang.Long getTotal() {
      return total;
    }
    
    /** Sets the value of the 'total' field */
    public influent.idl.FL_SearchResults.Builder setTotal(long value) {
      validate(fields()[0], value);
      this.total = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'total' field has been set */
    public boolean hasTotal() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'total' field */
    public influent.idl.FL_SearchResults.Builder clearTotal() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'results' field */
    public java.util.List<influent.idl.FL_SearchResult> getResults() {
      return results;
    }
    
    /** Sets the value of the 'results' field */
    public influent.idl.FL_SearchResults.Builder setResults(java.util.List<influent.idl.FL_SearchResult> value) {
      validate(fields()[1], value);
      this.results = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'results' field has been set */
    public boolean hasResults() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'results' field */
    public influent.idl.FL_SearchResults.Builder clearResults() {
      results = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'keyProperties' field */
    public influent.idl.FL_PropertyDescriptors getKeyProperties() {
      return keyProperties;
    }
    
    /** Sets the value of the 'keyProperties' field */
    public influent.idl.FL_SearchResults.Builder setKeyProperties(influent.idl.FL_PropertyDescriptors value) {
      validate(fields()[2], value);
      this.keyProperties = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'keyProperties' field has been set */
    public boolean hasKeyProperties() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'keyProperties' field */
    public influent.idl.FL_SearchResults.Builder clearKeyProperties() {
      keyProperties = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'levelOfDetail' field */
    public influent.idl.FL_LevelOfDetail getLevelOfDetail() {
      return levelOfDetail;
    }
    
    /** Sets the value of the 'levelOfDetail' field */
    public influent.idl.FL_SearchResults.Builder setLevelOfDetail(influent.idl.FL_LevelOfDetail value) {
      validate(fields()[3], value);
      this.levelOfDetail = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'levelOfDetail' field has been set */
    public boolean hasLevelOfDetail() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'levelOfDetail' field */
    public influent.idl.FL_SearchResults.Builder clearLevelOfDetail() {
      levelOfDetail = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public FL_SearchResults build() {
      try {
        FL_SearchResults record = new FL_SearchResults();
        record.total = fieldSetFlags()[0] ? this.total : (java.lang.Long) defaultValue(fields()[0]);
        record.results = fieldSetFlags()[1] ? this.results : (java.util.List<influent.idl.FL_SearchResult>) defaultValue(fields()[1]);
        record.keyProperties = fieldSetFlags()[2] ? this.keyProperties : (influent.idl.FL_PropertyDescriptors) defaultValue(fields()[2]);
        record.levelOfDetail = fieldSetFlags()[3] ? this.levelOfDetail : (influent.idl.FL_LevelOfDetail) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
