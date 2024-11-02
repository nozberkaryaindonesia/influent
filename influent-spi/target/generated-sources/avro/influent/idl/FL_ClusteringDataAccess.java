/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;

@SuppressWarnings("all")
/** * Data Access for clusters */
@org.apache.avro.specific.AvroGenerated
public interface FL_ClusteringDataAccess {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"FL_ClusteringDataAccess\",\"namespace\":\"influent.idl\",\"doc\":\"* Data Access for clusters\",\"types\":[{\"type\":\"enum\",\"name\":\"FL_RequiredPropertyKey\",\"doc\":\"* A list of the required property keys that are reserved by the system and should be included as\\n\\t * the keys in FL_PropertyMatchDescriptors. Keys are case sensitive.\\n\\t *\\n\\t * ADDED IN 2.0\",\"symbols\":[\"NAME\",\"ID\",\"FROM\",\"TO\",\"DATE\",\"AMOUNT\",\"ENTITY\",\"LINKED\",\"TYPE\"]},{\"type\":\"enum\",\"name\":\"FL_ReservedPropertyKey\",\"doc\":\"* A list of case sensitive keys which are reserved keywords in search.\\n\\t *\\n\\t * ADDED IN 2.0\",\"symbols\":[\"TYPE\",\"ORDER\",\"MATCH\"]},{\"type\":\"enum\",\"name\":\"FL_PropertyTag\",\"doc\":\"* Tags are defined by the application layer as a taxonomy of user and application concepts,\\n\\t * independent of the data sources. This allows application semantics to be re-used with new\\n\\t * data, with a minimum of new software design and development. Data layer entity types, link\\n\\t * types and properties should be mapped into the list of tags. The application layer must be\\n\\t * able to search by native field name or by tag interchangeably, and properties returned must\\n\\t * contain both native field names as well as tags.\\n\\t *\\n\\t * The list of tags may change as application features evolve, though that will require\\n\\t * collaboration with the data layer providers. Evolving the tag list should not change the\\n\\t * Data Access or Search APIs.\\n\\t *\\n\\t * This is the current list of tags for Properties:\\n\\t *\\n\\t * CHANGED in 1.5:\\n\\t * - CREDIT/DEBIT changed to INFLOWING/OUTFLOWING\\n\\t * - added USD\\n\\t * - added DURATION\\n\\t *\\n\\t * CHANGED in 1.6:\\n\\t * - added ENTITY_TYPE\\n\\t * - added ACCOUNT_OWNER, CLUSTER_SUMMARY, COUNTRY_CODE\\n\\t *\\n\\t * CHANGED in 1.7:\\n\\t * - added CLUSTER\\n\\t *\\n\\t * CHANGED in 1.8:\\n\\t * - added TOPIC\\n\\t *\\n\\t * CHANGED in 1.9:\\n\\t * - added HTML\\n\\t *\\n\\t * CHANGED in 2.0:\\n\\t * - added UNITS\\n\\t * - added FROM_LABEL\\n\\t * - added TO_LABEL\",\"symbols\":[\"ID\",\"TYPE\",\"ENTITY_TYPE\",\"ACCOUNT_OWNER\",\"CLUSTER_SUMMARY\",\"CLUSTER\",\"NAME\",\"LABEL\",\"STAT\",\"TEXT\",\"HTML\",\"TOPIC\",\"STATUS\",\"ANNOTATION\",\"WARNING\",\"LINKED_DATA\",\"GEO\",\"COUNTRY_CODE\",\"DATE\",\"AMOUNT\",\"INFLOWING\",\"OUTFLOWING\",\"COUNT\",\"SERIES\",\"CONSTRUCTED\",\"RAW\",\"UNITS\",\"USD\",\"DURATION\",\"ENTITY\",\"SHARED_IDENTIFIER\",\"FROM_LABEL\",\"TO_LABEL\"]},{\"type\":\"enum\",\"name\":\"FL_EntityTag\",\"doc\":\"* This is the current list of tags for Entities:\\n\\t *\\n\\t * CHANGED in 1.6:\\n\\t * - added ACCOUNT_OWNER, CLUSTER_SUMMARY\\n\\t *\\n\\t * CHANGED in 1.7:\\n\\t * - added PROMPT_FOR_DETAILS\\n\\t *\\n\\t * CHANGED in 1.8:\\n\\t * - added UNBRANCHABLE\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"GROUP\",\"CLUSTER\",\"CLUSTER_SUMMARY\",\"FILE\",\"ANONYMOUS\",\"UNBRANCHABLE\",\"PROMPT_FOR_DETAILS\",\"OTHER\"]},{\"type\":\"enum\",\"name\":\"FL_PropertyType\",\"doc\":\"* Allowed types for Property values.\\n\\t *\\n\\t * CHANGED in 1.9\",\"symbols\":[\"FLOAT\",\"DOUBLE\",\"INTEGER\",\"LONG\",\"BOOLEAN\",\"STRING\",\"IMAGE\",\"DATE\",\"GEO\"]},{\"type\":\"enum\",\"name\":\"FL_LevelOfDetail\",\"doc\":\"* Amount of detail requested\\n\\t *\\n\\t * ADDED IN 1.6\\n\\t *\\n\\t * CHANGED in 2.0:\\n\\t * - added KEY\",\"symbols\":[\"KEY\",\"SUMMARY\",\"FULL\",\"HIDDEN\"]},{\"type\":\"enum\",\"name\":\"FL_ContinentCode\",\"doc\":\"* Standard two letter continent code\\n\\t *\\n\\t * ADDED IN 1.6\",\"symbols\":[\"AF\",\"AS\",\"EU\",\"NA\",\"SA\",\"OC\",\"AN\"]},{\"type\":\"enum\",\"name\":\"FL_DateInterval\",\"doc\":\"* Temporal resolution of a duration\\n\\t *\\n\\t * CHANGED IN 1.5\",\"symbols\":[\"SECONDS\",\"HOURS\",\"DAYS\",\"WEEKS\",\"MONTHS\",\"QUARTERS\",\"YEARS\"]},{\"type\":\"enum\",\"name\":\"FL_RangeType\",\"doc\":\"* Allowed types for Ranges of values.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"symbols\":[\"SINGLETON\",\"LIST\",\"BOUNDED\",\"DISTRIBUTION\"]},{\"type\":\"enum\",\"name\":\"FL_Constraint\",\"doc\":\"* Property value matching constraints\\n\\t *\\n\\t * ADDED IN 1.5\\n\\t * MOVED IN 2.0\",\"symbols\":[\"REQUIRED_EQUALS\",\"FUZZY_PARTIAL_OPTIONAL\",\"NOT\",\"OPTIONAL_EQUALS\",\"FUZZY_REQUIRED\"]},{\"type\":\"enum\",\"name\":\"FL_SearchableBy\",\"doc\":\"* Used to describe in which contexts a term can (or should) be searched. Free text searches\\n\\t * do not describe properties to which they apply, and are often best restricted to\\n\\t * identity fields like names.\\n\\t *\\n\\t * ADDED IN 1.8\\n\\t * MOVED IN 2.0\",\"symbols\":[\"FREE_TEXT\",\"DESCRIPTOR\",\"NONE\"]},{\"type\":\"enum\",\"name\":\"FL_DirectionFilter\",\"doc\":\"* Direction of desired links\",\"symbols\":[\"SOURCE\",\"DESTINATION\",\"BOTH\"]},{\"type\":\"enum\",\"name\":\"FL_LinkEntityTypeFilter\",\"doc\":\"* Type of entity associated with desired links\\n\\t *\\n\\t * ADDED IN 1.6\",\"symbols\":[\"ACCOUNT_OWNER\",\"ACCOUNT\",\"CLUSTER_SUMMARY\",\"ANY\"]},{\"type\":\"enum\",\"name\":\"FL_PathMatchTag\",\"doc\":\"* In addition to PropertyTags, a PropertyMatchDescriptor might also be one of these.\\n\\t *\\n\\t * ADDED IN 1.5\",\"symbols\":[\"PATH_LENGTH\",\"PATH_TIME\",\"PATH_SOURCES\",\"PATH_DESTS\"]},{\"type\":\"enum\",\"name\":\"FL_PersistenceState\",\"doc\":\"* Persistence save state\",\"symbols\":[\"NEW\",\"MODIFIED\",\"NONE\",\"ERROR\"]},{\"type\":\"record\",\"name\":\"FL_Provenance\",\"doc\":\"* This is a placeholder for future modeling of provenance. It is not a required field in any service calls.\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\",\"doc\":\"Placeholder for now. Express provenance as a single URI.\"}]},{\"type\":\"record\",\"name\":\"FL_Uncertainty\",\"doc\":\"* This is a placeholder for future modeling of uncertainty. It is not a required field in any service calls.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"fields\":[{\"name\":\"confidence\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express original source confidence as a single number from 0 to 1.\",\"default\":1},{\"name\":\"currency\",\"type\":\"double\",\"doc\":\"Placeholder for now. Express confidence in currency of data as a single number from 0 to 1.\",\"default\":1}]},{\"type\":\"record\",\"name\":\"FL_LinkedData\",\"doc\":\"* A URL and MIME type representing a pointer to text, image or other external resource.\",\"fields\":[{\"name\":\"url\",\"type\":\"string\",\"doc\":\"URL of the resource\"},{\"name\":\"mimeType\",\"type\":[\"null\",\"string\"],\"doc\":\"MIME type of the resource\",\"default\":null},{\"name\":\"title\",\"type\":[\"null\",\"string\"],\"doc\":\"description of the linked resource (suitable for display to the user in an hypertext link)\",\"default\":null}]},{\"type\":\"record\",\"name\":\"FL_GeoData\",\"doc\":\"* Structured representation of geo-spatial data.\",\"fields\":[{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"doc\":\"an address or other place reference; unstructured text field\",\"default\":null},{\"name\":\"lat\",\"type\":[\"double\",\"null\"],\"doc\":\"latitude\",\"default\":null},{\"name\":\"lon\",\"type\":[\"double\",\"null\"],\"doc\":\"longitude\",\"default\":null},{\"name\":\"cc\",\"type\":[\"null\",\"string\"],\"doc\":\"ISO 3 digit country code\",\"default\":null}]},{\"type\":\"record\",\"name\":\"FL_Country\",\"doc\":\"* Structured representation of country data, which includes geo-spatial data.\\n\\t *\\n\\t * ADDED IN 1.6\",\"fields\":[{\"name\":\"country\",\"type\":\"FL_GeoData\",\"doc\":\"country geo data, including the name as text\"},{\"name\":\"region\",\"type\":\"string\",\"doc\":\"the name of the global region to which the country belongs; any common classification here is acceptable\"},{\"name\":\"continent\",\"type\":\"FL_ContinentCode\",\"doc\":\"continent\"}]},{\"type\":\"record\",\"name\":\"FL_Duration\",\"doc\":\"* A temporal duration\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"interval\",\"type\":\"FL_DateInterval\",\"doc\":\"time aggregation level, e.g. use monthly data\"},{\"name\":\"numIntervals\",\"type\":\"long\",\"doc\":\"number of intervals, e.g. 12 monthly intervals is a 1 year duration\"}]},{\"type\":\"record\",\"name\":\"FL_DateRange\",\"doc\":\"* Describes a date range at a specific resolution.\\n\\t *\\n\\t * CHANGED IN 1.5\",\"fields\":[{\"name\":\"startDate\",\"type\":\"long\"},{\"name\":\"numBins\",\"type\":\"long\",\"doc\":\"number of bins to return, e.g. 12 monthly bins for 1 year of data\"},{\"name\":\"durationPerBin\",\"type\":\"FL_Duration\",\"doc\":\"number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data\"}]},{\"type\":\"record\",\"name\":\"FL_SingletonRange\",\"doc\":\"* Single value\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"value\",\"type\":[\"string\",\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\"]},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO, IMAGE\"}]},{\"type\":\"record\",\"name\":\"FL_ListRange\",\"doc\":\"* List of values\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":","\"array\",\"items\":[\"string\",\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\"]}},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"}]},{\"type\":\"record\",\"name\":\"FL_BoundedRange\",\"doc\":\"* Bounded or unbounded range values\\n\\t *\\n\\t * ADDED IN 1.5\",\"fields\":[{\"name\":\"start\",\"type\":[\"string\",\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"null\"],\"doc\":\"start of range, or null if unbounded start\"},{\"name\":\"end\",\"type\":[\"string\",\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"null\"],\"doc\":\"end of range, or null if unbounded start\"},{\"name\":\"inclusive\",\"type\":\"boolean\",\"doc\":\"If true, range includes specified endpoint. If false, range is exclusive.\"},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"}]},{\"type\":\"record\",\"name\":\"FL_Frequency\",\"doc\":\"* A frequency or probability element of a distribution.\\n\\t *\\n\\t * ADDED IN 1.6\",\"fields\":[{\"name\":\"range\",\"type\":[\"string\",\"int\",\"float\",\"double\",\"long\",\"boolean\",\"FL_GeoData\",\"FL_ListRange\",\"FL_BoundedRange\"],\"doc\":\"the value range which occurs with some specified frequency\"},{\"name\":\"frequency\",\"type\":\"double\",\"doc\":\"frequency as a count, or probability as a value from 0-1.\"}]},{\"type\":\"record\",\"name\":\"FL_DistributionRange\",\"doc\":\"* Describes a distribution of values.\\n\\t *\\n\\t * ADDED IN 1.6\",\"fields\":[{\"name\":\"distribution\",\"type\":{\"type\":\"array\",\"items\":\"FL_Frequency\"}},{\"name\":\"rangeType\",\"type\":\"FL_RangeType\",\"doc\":\"Describes how the values in the distribution are summarised\"},{\"name\":\"type\",\"type\":\"FL_PropertyType\",\"doc\":\"The type of value that the distribution describes. One of STRING, INTEGER, FLOAT, DOUBLE, LONG, BOOLEAN, DATE, GEO\"},{\"name\":\"isProbability\",\"type\":\"boolean\",\"doc\":\"True if a probability distribution, false if a frequency distribution\",\"default\":false}]},{\"type\":\"record\",\"name\":\"FL_Property\",\"doc\":\"* Each property on an Entity or Link is a name-value pair, with data type information, as well as optional\\n\\t * provenance. Tags provide a way for the data provider to associate semantic annotations to each property\\n\\t * in terms of the semantics of the application.\\n\\t *\\n\\t * CHANGED IN 1.6\",\"fields\":[{\"name\":\"key\",\"type\":\"string\",\"doc\":\"the field name in the underlying data source\"},{\"name\":\"friendlyText\",\"type\":[\"null\",\"string\"],\"doc\":\"user-friendly short-text for key (displayable)\",\"default\":null},{\"name\":\"range\",\"type\":[\"FL_SingletonRange\",\"FL_ListRange\",\"FL_BoundedRange\",\"FL_DistributionRange\"],\"doc\":\"range of values\",\"default\":null},{\"name\":\"provenance\",\"type\":[\"null\",\"FL_Provenance\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"null\",\"FL_Uncertainty\"],\"default\":null},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"FL_PropertyTag\"},\"doc\":\"one or more tags from the Tag list, used to map this source-specific field into the semantics of applications\"},{\"name\":\"isHidden\",\"type\":\"boolean\",\"doc\":\"true if this property is hidden from the client\",\"default\":false}]},{\"type\":\"record\",\"name\":\"FL_Entity\",\"doc\":\"* The nodes in the social, financial, communications or other graphs. May represent concrete individuals or organizations,\\n\\t * specific proxies such as accounts, or the implicit individuals or groups behind those other entities.\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"This uid must represent either (1) a globally unique identifier that can be used to retrieve data for an\\n\\t\\t\\texplicit entity, or (2) encoded query information that can be used to find a set of associated record\\n\\t\\t\\tnotionally representing an implicit entity (e.g. Loans&FirstName&LastName&Gender). Must not be used for\\n\\t\\t\\tIDs that aren't globally unique.  For example, in Kiva, \\\"Lenders\\\" has a UID (\\\"L12345\\\") while \\\"Borrowers\\\"\\n\\t\\t\\thave an encoded search in the Loans table for uid (\\\"B{loan:23456;name=Daniel}\\\").  The encoded information\\n\\t\\t\\tis data layer-specific, may be different from entity to entity or data set to data set, and should be\\n\\t\\t\\tconsidered opaque to the consumers of the entities.  Entities of type 2 should always have the Entity Tag\\n\\t\\t\\tANONYMOUS to help distinguish them when required.\"},{\"name\":\"type\",\"type\":[\"string\",\"null\"],\"doc\":\"type\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"FL_EntityTag\"},\"doc\":\"Entity Tags (see above, e.g. \\\"ACCOUNT\\\")\"},{\"name\":\"provenance\",\"type\":[\"FL_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"FL_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"FL_Property\"}}]},{\"type\":\"record\",\"name\":\"FL_Link\",\"doc\":\"* The links in the social, financial, communications or other graphs. May represent communication\\n\\t * events, financial transactions or social connections.\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"This uid must represent either (1) a globally unique identifier that can be used to retrieve data for an\\n\\t\\t\\texplicit link, or (2) encoded query information that can be used to find a set of associated record\\n\\t\\t\\tnotionally representing an implicit link (e.g. Source&Target&Date&Amount). Must not be used for\\n\\t\\t\\tIDs that aren't globally unique.\"},{\"name\":\"linkTypes\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"],\"doc\":\"link types\",\"default\":null},{\"name\":\"source\",\"type\":[\"null\",\"string\"],\"doc\":\"source entity uid\",\"default\":null},{\"name\":\"target\",\"type\":[\"null\",\"string\"],\"doc\":\"target entity uid\",\"default\":null},{\"name\":\"type\",\"type\":[\"string\",\"null\"],\"doc\":\"type\"},{\"name\":\"directed\",\"type\":\"boolean\",\"doc\":\"true if directed, false if undirected\",\"default\":true},{\"name\":\"provenance\",\"type\":[\"FL_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"FL_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"FL_Property\"}}]},{\"type\":\"record\",\"name\":\"FL_Cluster\",\"doc\":\"* Cluster of nodes in the social, financial, communications or other graphs.\\n\\t *\\n\\t * CHANGED in 1.7:\\n\\t * \\t- added version\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"A unique identifier use to retrieve data about this cluster. Should not be used for non-global identifiers.\"},{\"name\":\"tags\",\"type\":{\"type\":\"array\",\"items\":\"FL_EntityTag\"},\"doc\":\"Entity Tags (see DataTypes, e.g. \\\"CLUSTER\\\")\"},{\"name\":\"provenance\",\"type\":[\"FL_Provenance\",\"null\"],\"default\":null},{\"name\":\"uncertainty\",\"type\":[\"FL_Uncertainty\",\"null\"],\"default\":null},{\"name\":\"properties\",\"type\":{\"type\":\"array\",\"items\":\"FL_Property\"}},{\"name\":\"members\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"List of id's of the members of this cluster\"},{\"name\":\"subclusters\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"doc\":\"List of id's of the subclusters of this cluster - empty if this is a leaf cluster in cluster hierarchy\"},{\"name\":\"parent\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the parent cluster if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"root\",\"type\":[\"null\",\"string\"],\"doc\":\"The id of the root cluster (top level cluster) if this is a cluster in a hierarchy - Can be null if this is a root cluster *\",\"default\":null},{\"name\":\"level\",\"type\":\"int\",\"doc\":\"The degree from the root this cluster is in the hierarchy - level = 0 if this is a root cluster *\",\"default\":0},{\"name\":\"version\",\"type\":\"int\",\"doc\":\"The version number of the cluster - each time the cluster contents is modified the version should be incremented *\",\"default\":1}]},{\"type\":\"record\",\"name\":\"FL_Future\",\"doc\":\"* Represents the future results of an asynchronous task.\\n\\t * Can be passed into the FutureResults service API\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"unique id of this task\"},{\"name\":\"label\",\"type\":\"string\",\"doc\":\"short human-readable description of task for display\"},{\"name\":\"service\",\"type\":[\"null\",\"string\"],\"doc\":\"uid of the service task is running on\",\"default\":null},{\"name\":\"started\",\"type\":\"long\",\"doc\":\"date/time task was started\"},{\"name\":\"completed\",\"type\":\"long\",\"doc\":\"date/time task was completed (negative if not completed yet)\",\"default\":-1}]},{\"type\":\"record\",\"name\":\"FL_Service\",\"doc\":\"* Selectable services, returned by getServices() in various APIs\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"unique i","d of this service\"},{\"name\":\"label\",\"type\":\"string\",\"doc\":\"short human-readable description of service for display\"}]},{\"type\":\"record\",\"name\":\"FL_OrderBy\",\"doc\":\"* Ordering instructions for records, as specified in search requests.\\n\\t *\\n\\t * ADDED IN 2.0\",\"fields\":[{\"name\":\"propertyKey\",\"type\":\"string\",\"doc\":\"The key of the property value to order by\"},{\"name\":\"ascending\",\"type\":\"boolean\",\"doc\":\"ascending? (or descending)\",\"default\":false}]},{\"type\":\"record\",\"name\":\"FL_TypeMapping\",\"doc\":\"* Used to describe how an FL_PropertyDescriptor maps to given a type.\\n\\t *\\n\\t * ADDED IN 1.8\",\"fields\":[{\"name\":\"type\",\"type\":\"string\",\"doc\":\"The type that the mapping applies to *\"},{\"name\":\"memberKey\",\"type\":\"string\",\"doc\":\"field that the FL_Property maps to in the type *\"}]},{\"type\":\"record\",\"name\":\"FL_DataSummary\",\"doc\":\"* Data summary information\\n\\t *\\n\\t * Added in 1.8\",\"fields\":[{\"name\":\"key\",\"type\":[\"string\",\"null\"]},{\"name\":\"label\",\"type\":[\"string\",\"null\"]},{\"name\":\"value\",\"type\":[\"string\",\"null\"]}]}],\"messages\":{\"getClusters\":{\"doc\":\"* Returns a set of clusters by uid.\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * Service URL: /cluster/list\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param entities \\tuids of clusters to retrieve\\n\\t * @param contextId the context to retrieve the clusters from\\n\\t * @return \\t\\t\\tcluster entities\",\"request\":[{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"contextId\",\"type\":\"string\"}],\"response\":{\"type\":\"array\",\"items\":\"FL_Cluster\"}},\"getClusterSummary\":{\"doc\":\"* Returns a set of cluster summaries by uid.\\n\\t *\\n\\t * Service URL: /clustersummary/list\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param entities \\tuids of clusters to retrieve\\n\\t * @return \\t\\t\\tcluster entities\",\"request\":[{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"response\":{\"type\":\"array\",\"items\":\"FL_Cluster\"}},\"getAccountOwners\":{\"doc\":\"* Returns a set of account owners by uid.\\n\\t *\\n\\t * ADDED in 1.7\\n\\t *\\n\\t * Service URL: /accountowners/list\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param owners \\tuids of account owners to retrieve\\n\\t * @return \\t\\t    entity clusters representing account owners\",\"request\":[{\"name\":\"owners\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"response\":{\"type\":\"array\",\"items\":\"FL_Cluster\"}},\"removeMembers\":{\"doc\":\"* Removes entities from a cluster\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * Service URL: /cluster/remove\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param entities \\tuids of entities to remove\\n\\t * @param contextId\\tthe context of the cluster to remove entities from\\n\\t * @return \\t\\t\\tnumber of entities removed\",\"request\":[{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"contextId\",\"type\":\"string\"}],\"response\":\"long\"},\"getContext\":{\"doc\":\"* Returns all clusters in a context.\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t * - Removed unused computeSummaries\\n\\t *\\n\\t * Service URL: /cluster/context\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param contextId the context to retrieve the clusters fr\\tom\\n\\t * @return \\t\\t\\tcluster entities\",\"request\":[{\"name\":\"contextId\",\"type\":\"string\"}],\"response\":{\"type\":\"array\",\"items\":\"FL_Cluster\"}},\"clearContext\":{\"doc\":\"* Deletes all clusters in a context.\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * Service URL: /cluster/context/remove\\n\\t * HTTP Method: POST or GET\\n\\t *\\n\\t * @param contextId\\tthe context to retrieve the clusters from\\n\\t * @return \\t\\t\\tboolean indicating if any clusters were deleted\",\"request\":[{\"name\":\"contextId\",\"type\":\"string\"}],\"response\":\"boolean\"},\"getFlowAggregation\":{\"doc\":\"* Returns links to other entities related to specify entities. Each Link returned should\\n\\t * represent multiple records, used for displaying flow.\\n\\t *\\n\\t * See the specification for the Flow Data View.\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * @param entities \\t\\t\\tuids of entities to retrieve links for\\n\\t * @param focusEntities \\tuids of focus entities (may be null)\\n\\t * @param direction \\t\\tone of: SOURCE, DESTINATION, BOTH\\n\\t * @param date \\t\\t\\t\\tin the given date range\\n\\t * @param entitiesContextId the context to compute flow from entities\\n\\t * @param focusContextId\\tthe context to compute flow from focus entities (if null a new context is created for dst)\\n\\t * @return \\t\\t\\t\\t\\tmap of input entity IDs to an array of the links for that cluster entity\",\"request\":[{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"focusEntities\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"direction\",\"type\":\"FL_DirectionFilter\"},{\"name\":\"date\",\"type\":[\"FL_DateRange\",\"null\"]},{\"name\":\"entitiesContextId\",\"type\":\"string\"},{\"name\":\"focusContextId\",\"type\":[\"null\",\"string\"]}],\"response\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"FL_Link\"}}},\"getTimeSeriesAggregation\":{\"doc\":\"* Returns links to other entities related to specify entities.  Each Link returned should\\n\\t * represent multiple records, used for displaying time series.\\n\\t *\\n\\t * See the specification for the Time Series Data View.\\n\\t *\\n\\t * CHANGED IN 1.7\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * Service URL: /cluster/link/series\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param entities \\t\\t\\tuids of entities to retrieve links for\\n\\t * @param focusEntities \\tuids of focus entities (may be null)\\n\\t * @param date \\t\\t\\t\\tin the given date range\\n\\t * @param entitiesContextId\\tthe context to compute flow between clusters from\\n\\t * @param focusContextId\\tthe context to compute flow between clusters from (if null a new context is created for dst)\\n\\t * @return \\t\\t\\t\\t\\tmap of input entity IDs to an array of the links for that cluster entity\",\"request\":[{\"name\":\"entities\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"focusEntities\",\"type\":[{\"type\":\"array\",\"items\":\"string\"},\"null\"]},{\"name\":\"date\",\"type\":\"FL_DateRange\"},{\"name\":\"entitiesContextId\",\"type\":\"string\"},{\"name\":\"focusContextId\",\"type\":[\"null\",\"string\"]}],\"response\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"FL_Link\"}}},\"getLeafIds\":{\"doc\":\"* Returns the leaf ids for the given ids and context.\\n\\t *\\n\\t * CHANGED IN 1.9\\n\\t * - Removed unused sessionId\\n\\t *\\n\\t * Service URL: /cluster/leaves/list\\n\\t * HTTP Method: POST and GET\\n\\t *\\n\\t * @param ids\\t\\t\\t\\t\\t\\tuids of entities to get leaf ids from\\n\\t * @param context\\t\\t\\t\\t\\tthe context to retrieve the clusters from\\n\\t * @param searchImmutableClusters   whether to search immutable clusters (owners + cluster summaries) for leaves,\\n\\t *                                  if false then returns immutable cluster ids as leaves\\n\\t * @return\",\"request\":[{\"name\":\"ids\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"context\",\"type\":\"string\"},{\"name\":\"searchImmutableClusters\",\"type\":\"boolean\"}],\"response\":{\"type\":\"array\",\"items\":\"string\"}}}}");
  /** * Returns a set of clusters by uid.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/list
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of clusters to retrieve
	 * @param contextId the context to retrieve the clusters from
	 * @return 			cluster entities */
  java.util.List<influent.idl.FL_Cluster> getClusters(java.util.List<java.lang.CharSequence> entities, java.lang.CharSequence contextId) throws org.apache.avro.AvroRemoteException;
  /** * Returns a set of cluster summaries by uid.
	 *
	 * Service URL: /clustersummary/list
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of clusters to retrieve
	 * @return 			cluster entities */
  java.util.List<influent.idl.FL_Cluster> getClusterSummary(java.util.List<java.lang.CharSequence> entities) throws org.apache.avro.AvroRemoteException;
  /** * Returns a set of account owners by uid.
	 *
	 * ADDED in 1.7
	 *
	 * Service URL: /accountowners/list
	 * HTTP Method: POST and GET
	 *
	 * @param owners 	uids of account owners to retrieve
	 * @return 		    entity clusters representing account owners */
  java.util.List<influent.idl.FL_Cluster> getAccountOwners(java.util.List<java.lang.CharSequence> owners) throws org.apache.avro.AvroRemoteException;
  /** * Removes entities from a cluster
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/remove
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of entities to remove
	 * @param contextId	the context of the cluster to remove entities from
	 * @return 			number of entities removed */
  long removeMembers(java.util.List<java.lang.CharSequence> entities, java.lang.CharSequence contextId) throws org.apache.avro.AvroRemoteException;
  /** * Returns all clusters in a context.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 * - Removed unused computeSummaries
	 *
	 * Service URL: /cluster/context
	 * HTTP Method: POST and GET
	 *
	 * @param contextId the context to retrieve the clusters fr	om
	 * @return 			cluster entities */
  java.util.List<influent.idl.FL_Cluster> getContext(java.lang.CharSequence contextId) throws org.apache.avro.AvroRemoteException;
  /** * Deletes all clusters in a context.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/context/remove
	 * HTTP Method: POST or GET
	 *
	 * @param contextId	the context to retrieve the clusters from
	 * @return 			boolean indicating if any clusters were deleted */
  boolean clearContext(java.lang.CharSequence contextId) throws org.apache.avro.AvroRemoteException;
  /** * Returns links to other entities related to specify entities. Each Link returned should
	 * represent multiple records, used for displaying flow.
	 *
	 * See the specification for the Flow Data View.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * @param entities 			uids of entities to retrieve links for
	 * @param focusEntities 	uids of focus entities (may be null)
	 * @param direction 		one of: SOURCE, DESTINATION, BOTH
	 * @param date 				in the given date range
	 * @param entitiesContextId the context to compute flow from entities
	 * @param focusContextId	the context to compute flow from focus entities (if null a new context is created for dst)
	 * @return 					map of input entity IDs to an array of the links for that cluster entity */
  java.util.Map<java.lang.CharSequence,java.util.List<influent.idl.FL_Link>> getFlowAggregation(java.util.List<java.lang.CharSequence> entities, java.util.List<java.lang.CharSequence> focusEntities, influent.idl.FL_DirectionFilter direction, influent.idl.FL_DateRange date, java.lang.CharSequence entitiesContextId, java.lang.CharSequence focusContextId) throws org.apache.avro.AvroRemoteException;
  /** * Returns links to other entities related to specify entities.  Each Link returned should
	 * represent multiple records, used for displaying time series.
	 *
	 * See the specification for the Time Series Data View.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/link/series
	 * HTTP Method: POST and GET
	 *
	 * @param entities 			uids of entities to retrieve links for
	 * @param focusEntities 	uids of focus entities (may be null)
	 * @param date 				in the given date range
	 * @param entitiesContextId	the context to compute flow between clusters from
	 * @param focusContextId	the context to compute flow between clusters from (if null a new context is created for dst)
	 * @return 					map of input entity IDs to an array of the links for that cluster entity */
  java.util.Map<java.lang.CharSequence,java.util.List<influent.idl.FL_Link>> getTimeSeriesAggregation(java.util.List<java.lang.CharSequence> entities, java.util.List<java.lang.CharSequence> focusEntities, influent.idl.FL_DateRange date, java.lang.CharSequence entitiesContextId, java.lang.CharSequence focusContextId) throws org.apache.avro.AvroRemoteException;
  /** * Returns the leaf ids for the given ids and context.
	 *
	 * CHANGED IN 1.9
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/leaves/list
	 * HTTP Method: POST and GET
	 *
	 * @param ids						uids of entities to get leaf ids from
	 * @param context					the context to retrieve the clusters from
	 * @param searchImmutableClusters   whether to search immutable clusters (owners + cluster summaries) for leaves,
	 *                                  if false then returns immutable cluster ids as leaves
	 * @return */
  java.util.List<java.lang.CharSequence> getLeafIds(java.util.List<java.lang.CharSequence> ids, java.lang.CharSequence context, boolean searchImmutableClusters) throws org.apache.avro.AvroRemoteException;

  @SuppressWarnings("all")
  /** * Data Access for clusters */
  public interface Callback extends FL_ClusteringDataAccess {
    public static final org.apache.avro.Protocol PROTOCOL = influent.idl.FL_ClusteringDataAccess.PROTOCOL;
    /** * Returns a set of clusters by uid.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/list
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of clusters to retrieve
	 * @param contextId the context to retrieve the clusters from
	 * @return 			cluster entities */
    void getClusters(java.util.List<java.lang.CharSequence> entities, java.lang.CharSequence contextId, org.apache.avro.ipc.Callback<java.util.List<influent.idl.FL_Cluster>> callback) throws java.io.IOException;
    /** * Returns a set of cluster summaries by uid.
	 *
	 * Service URL: /clustersummary/list
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of clusters to retrieve
	 * @return 			cluster entities */
    void getClusterSummary(java.util.List<java.lang.CharSequence> entities, org.apache.avro.ipc.Callback<java.util.List<influent.idl.FL_Cluster>> callback) throws java.io.IOException;
    /** * Returns a set of account owners by uid.
	 *
	 * ADDED in 1.7
	 *
	 * Service URL: /accountowners/list
	 * HTTP Method: POST and GET
	 *
	 * @param owners 	uids of account owners to retrieve
	 * @return 		    entity clusters representing account owners */
    void getAccountOwners(java.util.List<java.lang.CharSequence> owners, org.apache.avro.ipc.Callback<java.util.List<influent.idl.FL_Cluster>> callback) throws java.io.IOException;
    /** * Removes entities from a cluster
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/remove
	 * HTTP Method: POST and GET
	 *
	 * @param entities 	uids of entities to remove
	 * @param contextId	the context of the cluster to remove entities from
	 * @return 			number of entities removed */
    void removeMembers(java.util.List<java.lang.CharSequence> entities, java.lang.CharSequence contextId, org.apache.avro.ipc.Callback<java.lang.Long> callback) throws java.io.IOException;
    /** * Returns all clusters in a context.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 * - Removed unused computeSummaries
	 *
	 * Service URL: /cluster/context
	 * HTTP Method: POST and GET
	 *
	 * @param contextId the context to retrieve the clusters fr	om
	 * @return 			cluster entities */
    void getContext(java.lang.CharSequence contextId, org.apache.avro.ipc.Callback<java.util.List<influent.idl.FL_Cluster>> callback) throws java.io.IOException;
    /** * Deletes all clusters in a context.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/context/remove
	 * HTTP Method: POST or GET
	 *
	 * @param contextId	the context to retrieve the clusters from
	 * @return 			boolean indicating if any clusters were deleted */
    void clearContext(java.lang.CharSequence contextId, org.apache.avro.ipc.Callback<java.lang.Boolean> callback) throws java.io.IOException;
    /** * Returns links to other entities related to specify entities. Each Link returned should
	 * represent multiple records, used for displaying flow.
	 *
	 * See the specification for the Flow Data View.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * @param entities 			uids of entities to retrieve links for
	 * @param focusEntities 	uids of focus entities (may be null)
	 * @param direction 		one of: SOURCE, DESTINATION, BOTH
	 * @param date 				in the given date range
	 * @param entitiesContextId the context to compute flow from entities
	 * @param focusContextId	the context to compute flow from focus entities (if null a new context is created for dst)
	 * @return 					map of input entity IDs to an array of the links for that cluster entity */
    void getFlowAggregation(java.util.List<java.lang.CharSequence> entities, java.util.List<java.lang.CharSequence> focusEntities, influent.idl.FL_DirectionFilter direction, influent.idl.FL_DateRange date, java.lang.CharSequence entitiesContextId, java.lang.CharSequence focusContextId, org.apache.avro.ipc.Callback<java.util.Map<java.lang.CharSequence,java.util.List<influent.idl.FL_Link>>> callback) throws java.io.IOException;
    /** * Returns links to other entities related to specify entities.  Each Link returned should
	 * represent multiple records, used for displaying time series.
	 *
	 * See the specification for the Time Series Data View.
	 *
	 * CHANGED IN 1.7
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/link/series
	 * HTTP Method: POST and GET
	 *
	 * @param entities 			uids of entities to retrieve links for
	 * @param focusEntities 	uids of focus entities (may be null)
	 * @param date 				in the given date range
	 * @param entitiesContextId	the context to compute flow between clusters from
	 * @param focusContextId	the context to compute flow between clusters from (if null a new context is created for dst)
	 * @return 					map of input entity IDs to an array of the links for that cluster entity */
    void getTimeSeriesAggregation(java.util.List<java.lang.CharSequence> entities, java.util.List<java.lang.CharSequence> focusEntities, influent.idl.FL_DateRange date, java.lang.CharSequence entitiesContextId, java.lang.CharSequence focusContextId, org.apache.avro.ipc.Callback<java.util.Map<java.lang.CharSequence,java.util.List<influent.idl.FL_Link>>> callback) throws java.io.IOException;
    /** * Returns the leaf ids for the given ids and context.
	 *
	 * CHANGED IN 1.9
	 * - Removed unused sessionId
	 *
	 * Service URL: /cluster/leaves/list
	 * HTTP Method: POST and GET
	 *
	 * @param ids						uids of entities to get leaf ids from
	 * @param context					the context to retrieve the clusters from
	 * @param searchImmutableClusters   whether to search immutable clusters (owners + cluster summaries) for leaves,
	 *                                  if false then returns immutable cluster ids as leaves
	 * @return */
    void getLeafIds(java.util.List<java.lang.CharSequence> ids, java.lang.CharSequence context, boolean searchImmutableClusters, org.apache.avro.ipc.Callback<java.util.List<java.lang.CharSequence>> callback) throws java.io.IOException;
  }
}