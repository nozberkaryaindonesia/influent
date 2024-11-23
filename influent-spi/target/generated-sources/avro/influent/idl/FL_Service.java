/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Selectable services, returned by getServices() in various APIs */
@org.apache.avro.specific.AvroGenerated
public class FL_Service extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_Service\",\"namespace\":\"influent.idl\",\"doc\":\"Selectable services, returned by getServices() in various APIs\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\",\"doc\":\"unique id of this service\"},{\"name\":\"label\",\"type\":\"string\",\"doc\":\"short human-readable description of service for display\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** unique id of this service */
  @Deprecated public java.lang.CharSequence uid;
  /** short human-readable description of service for display */
  @Deprecated public java.lang.CharSequence label;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FL_Service() {}

  /**
   * All-args constructor.
   */
  public FL_Service(java.lang.CharSequence uid, java.lang.CharSequence label) {
    this.uid = uid;
    this.label = label;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return label;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (java.lang.CharSequence)value$; break;
    case 1: label = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * unique id of this service   */
  public java.lang.CharSequence getUid() {
    return uid;
  }

  /**
   * Sets the value of the 'uid' field.
   * unique id of this service   * @param value the value to set.
   */
  public void setUid(java.lang.CharSequence value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'label' field.
   * short human-readable description of service for display   */
  public java.lang.CharSequence getLabel() {
    return label;
  }

  /**
   * Sets the value of the 'label' field.
   * short human-readable description of service for display   * @param value the value to set.
   */
  public void setLabel(java.lang.CharSequence value) {
    this.label = value;
  }

  /** Creates a new FL_Service RecordBuilder */
  public static influent.idl.FL_Service.Builder newBuilder() {
    return new influent.idl.FL_Service.Builder();
  }
  
  /** Creates a new FL_Service RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_Service.Builder newBuilder(influent.idl.FL_Service.Builder other) {
    return new influent.idl.FL_Service.Builder(other);
  }
  
  /** Creates a new FL_Service RecordBuilder by copying an existing FL_Service instance */
  public static influent.idl.FL_Service.Builder newBuilder(influent.idl.FL_Service other) {
    return new influent.idl.FL_Service.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_Service instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_Service>
    implements org.apache.avro.data.RecordBuilder<FL_Service> {

    private java.lang.CharSequence uid;
    private java.lang.CharSequence label;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_Service.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_Service.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FL_Service instance */
    private Builder(influent.idl.FL_Service other) {
            super(influent.idl.FL_Service.SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.label)) {
        this.label = data().deepCopy(fields()[1].schema(), other.label);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'uid' field */
    public java.lang.CharSequence getUid() {
      return uid;
    }
    
    /** Sets the value of the 'uid' field */
    public influent.idl.FL_Service.Builder setUid(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uid = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'uid' field has been set */
    public boolean hasUid() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'uid' field */
    public influent.idl.FL_Service.Builder clearUid() {
      uid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'label' field */
    public java.lang.CharSequence getLabel() {
      return label;
    }
    
    /** Sets the value of the 'label' field */
    public influent.idl.FL_Service.Builder setLabel(java.lang.CharSequence value) {
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
    public influent.idl.FL_Service.Builder clearLabel() {
      label = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public FL_Service build() {
      try {
        FL_Service record = new FL_Service();
        record.uid = fieldSetFlags()[0] ? this.uid : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.label = fieldSetFlags()[1] ? this.label : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
