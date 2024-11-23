/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** * Ordering instructions for records, as specified in search requests.
	 *
	 * ADDED IN 2.0 */
@org.apache.avro.specific.AvroGenerated
public class FL_OrderBy extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_OrderBy\",\"namespace\":\"influent.idl\",\"doc\":\"* Ordering instructions for records, as specified in search requests.\\n\\t *\\n\\t * ADDED IN 2.0\",\"fields\":[{\"name\":\"propertyKey\",\"type\":\"string\",\"doc\":\"The key of the property value to order by\"},{\"name\":\"ascending\",\"type\":\"boolean\",\"doc\":\"ascending? (or descending)\",\"default\":false}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** The key of the property value to order by */
  @Deprecated public java.lang.CharSequence propertyKey;
  /** ascending? (or descending) */
  @Deprecated public boolean ascending;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FL_OrderBy() {}

  /**
   * All-args constructor.
   */
  public FL_OrderBy(java.lang.CharSequence propertyKey, java.lang.Boolean ascending) {
    this.propertyKey = propertyKey;
    this.ascending = ascending;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return propertyKey;
    case 1: return ascending;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: propertyKey = (java.lang.CharSequence)value$; break;
    case 1: ascending = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'propertyKey' field.
   * The key of the property value to order by   */
  public java.lang.CharSequence getPropertyKey() {
    return propertyKey;
  }

  /**
   * Sets the value of the 'propertyKey' field.
   * The key of the property value to order by   * @param value the value to set.
   */
  public void setPropertyKey(java.lang.CharSequence value) {
    this.propertyKey = value;
  }

  /**
   * Gets the value of the 'ascending' field.
   * ascending? (or descending)   */
  public java.lang.Boolean getAscending() {
    return ascending;
  }

  /**
   * Sets the value of the 'ascending' field.
   * ascending? (or descending)   * @param value the value to set.
   */
  public void setAscending(java.lang.Boolean value) {
    this.ascending = value;
  }

  /** Creates a new FL_OrderBy RecordBuilder */
  public static influent.idl.FL_OrderBy.Builder newBuilder() {
    return new influent.idl.FL_OrderBy.Builder();
  }
  
  /** Creates a new FL_OrderBy RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_OrderBy.Builder newBuilder(influent.idl.FL_OrderBy.Builder other) {
    return new influent.idl.FL_OrderBy.Builder(other);
  }
  
  /** Creates a new FL_OrderBy RecordBuilder by copying an existing FL_OrderBy instance */
  public static influent.idl.FL_OrderBy.Builder newBuilder(influent.idl.FL_OrderBy other) {
    return new influent.idl.FL_OrderBy.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_OrderBy instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_OrderBy>
    implements org.apache.avro.data.RecordBuilder<FL_OrderBy> {

    private java.lang.CharSequence propertyKey;
    private boolean ascending;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_OrderBy.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_OrderBy.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.propertyKey)) {
        this.propertyKey = data().deepCopy(fields()[0].schema(), other.propertyKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ascending)) {
        this.ascending = data().deepCopy(fields()[1].schema(), other.ascending);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FL_OrderBy instance */
    private Builder(influent.idl.FL_OrderBy other) {
            super(influent.idl.FL_OrderBy.SCHEMA$);
      if (isValidValue(fields()[0], other.propertyKey)) {
        this.propertyKey = data().deepCopy(fields()[0].schema(), other.propertyKey);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ascending)) {
        this.ascending = data().deepCopy(fields()[1].schema(), other.ascending);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'propertyKey' field */
    public java.lang.CharSequence getPropertyKey() {
      return propertyKey;
    }
    
    /** Sets the value of the 'propertyKey' field */
    public influent.idl.FL_OrderBy.Builder setPropertyKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.propertyKey = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'propertyKey' field has been set */
    public boolean hasPropertyKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'propertyKey' field */
    public influent.idl.FL_OrderBy.Builder clearPropertyKey() {
      propertyKey = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'ascending' field */
    public java.lang.Boolean getAscending() {
      return ascending;
    }
    
    /** Sets the value of the 'ascending' field */
    public influent.idl.FL_OrderBy.Builder setAscending(boolean value) {
      validate(fields()[1], value);
      this.ascending = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'ascending' field has been set */
    public boolean hasAscending() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'ascending' field */
    public influent.idl.FL_OrderBy.Builder clearAscending() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FL_OrderBy build() {
      try {
        FL_OrderBy record = new FL_OrderBy();
        record.propertyKey = fieldSetFlags()[0] ? this.propertyKey : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ascending = fieldSetFlags()[1] ? this.ascending : (java.lang.Boolean) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
