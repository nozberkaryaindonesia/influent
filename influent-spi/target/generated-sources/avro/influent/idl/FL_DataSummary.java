/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** * Data summary information
	 *
	 * Added in 1.8 */
@org.apache.avro.specific.AvroGenerated
public class FL_DataSummary extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_DataSummary\",\"namespace\":\"influent.idl\",\"doc\":\"* Data summary information\\n\\t *\\n\\t * Added in 1.8\",\"fields\":[{\"name\":\"key\",\"type\":[\"string\",\"null\"]},{\"name\":\"label\",\"type\":[\"string\",\"null\"]},{\"name\":\"value\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence key;
  @Deprecated public java.lang.CharSequence label;
  @Deprecated public java.lang.CharSequence value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FL_DataSummary() {}

  /**
   * All-args constructor.
   */
  public FL_DataSummary(java.lang.CharSequence key, java.lang.CharSequence label, java.lang.CharSequence value) {
    this.key = key;
    this.label = label;
    this.value = value;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return key;
    case 1: return label;
    case 2: return value;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: key = (java.lang.CharSequence)value$; break;
    case 1: label = (java.lang.CharSequence)value$; break;
    case 2: value = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'key' field.
   */
  public java.lang.CharSequence getKey() {
    return key;
  }

  /**
   * Sets the value of the 'key' field.
   * @param value the value to set.
   */
  public void setKey(java.lang.CharSequence value) {
    this.key = value;
  }

  /**
   * Gets the value of the 'label' field.
   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /**
   * Gets the value of the 'value' field.
   */
  public java.lang.CharSequence getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.CharSequence value) {
    this.value = value;
  }

  /** Creates a new FL_DataSummary RecordBuilder */
  public static influent.idl.FL_DataSummary.Builder newBuilder() {
    return new influent.idl.FL_DataSummary.Builder();
  }
  
  /** Creates a new FL_DataSummary RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_DataSummary.Builder newBuilder(influent.idl.FL_DataSummary.Builder other) {
    return new influent.idl.FL_DataSummary.Builder(other);
  }
  
  /** Creates a new FL_DataSummary RecordBuilder by copying an existing FL_DataSummary instance */
  public static influent.idl.FL_DataSummary.Builder newBuilder(influent.idl.FL_DataSummary other) {
    return new influent.idl.FL_DataSummary.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_DataSummary instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_DataSummary>
    implements org.apache.avro.data.RecordBuilder<FL_DataSummary> {

    private java.lang.CharSequence key;
    private java.lang.CharSequence label;
    private java.lang.CharSequence value;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_DataSummary.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_DataSummary.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FL_DataSummary instance */
    private Builder(influent.idl.FL_DataSummary other) {
            super(influent.idl.FL_DataSummary.SCHEMA$);
      if (isValidValue(fields()[0], other.key)) {
        this.key = data().deepCopy(fields()[0].schema(), other.key);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'key' field */
    public java.lang.CharSequence getKey() {
      return key;
    }
    
    /** Sets the value of the 'key' field */
    public influent.idl.FL_DataSummary.Builder setKey(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.key = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'key' field has been set */
    public boolean hasKey() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'key' field */
    public influent.idl.FL_DataSummary.Builder clearKey() {
      key = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public influent.idl.FL_DataSummary.Builder setLabel(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.label = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'label' field has been set */
    public boolean hasLabel() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'label' field */
    public influent.idl.FL_DataSummary.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'value' field */
    public java.lang.CharSequence getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public influent.idl.FL_DataSummary.Builder setValue(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.value = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'value' field */
    public influent.idl.FL_DataSummary.Builder clearValue() {
      value = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FL_DataSummary build() {
      try {
        FL_DataSummary record = new FL_DataSummary();
        record.key = fieldSetFlags()[0] ? this.key : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.value = fieldSetFlags()[2] ? this.value : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
