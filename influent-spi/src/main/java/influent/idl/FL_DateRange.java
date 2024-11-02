/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package influent.idl;  
@SuppressWarnings("all")
/** Describes a date range at a specific resolution.
	 
	 CHANGED IN 1.5 */
@org.apache.avro.specific.AvroGenerated
public class FL_DateRange extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FL_DateRange\",\"namespace\":\"influent.idl\",\"doc\":\"Describes a date range at a specific resolution.\\n\\t \\n\\t CHANGED IN 1.5\",\"fields\":[{\"name\":\"startDate\",\"type\":\"long\"},{\"name\":\"numBins\",\"type\":\"long\",\"doc\":\"number of bins to return, e.g. 12 monthly bins for 1 year of data\"},{\"name\":\"durationPerBin\",\"type\":{\"type\":\"record\",\"name\":\"FL_Duration\",\"doc\":\"A temporal duration\\n\\t \\n\\t ADDED IN 1.5\",\"fields\":[{\"name\":\"interval\",\"type\":{\"type\":\"enum\",\"name\":\"FL_DateInterval\",\"doc\":\"Temporal resolution of a duration\\n\\t \\n\\t CHANGED IN 1.5\",\"symbols\":[\"SECONDS\",\"HOURS\",\"DAYS\",\"WEEKS\",\"MONTHS\",\"QUARTERS\",\"YEARS\"]},\"doc\":\"time aggregation level, e.g. use monthly data\"},{\"name\":\"numIntervals\",\"type\":\"long\",\"doc\":\"number of intervals, e.g. 12 monthly intervals is a 1 year duration\"}]},\"doc\":\"number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
   private long startDate;
  /** number of bins to return, e.g. 12 monthly bins for 1 year of data */
   private long numBins;
  /** number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data */
   private influent.idl.FL_Duration durationPerBin;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use {@link \#newBuilder()}. 
   */
  public FL_DateRange() {}

  /**
   * All-args constructor.
   */
  public FL_DateRange(java.lang.Long startDate, java.lang.Long numBins, influent.idl.FL_Duration durationPerBin) {
    this.startDate = startDate;
    this.numBins = numBins;
    this.durationPerBin = durationPerBin;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return startDate;
    case 1: return numBins;
    case 2: return durationPerBin;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: startDate = (java.lang.Long)value$; break;
    case 1: numBins = (java.lang.Long)value$; break;
    case 2: durationPerBin = (influent.idl.FL_Duration)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'startDate' field.
   */
  public java.lang.Long getStartDate() {
    return startDate;
  }

  /**
   * Sets the value of the 'startDate' field.
   * @param value the value to set.
   */
  public void setStartDate(java.lang.Long value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the 'numBins' field.
   * number of bins to return, e.g. 12 monthly bins for 1 year of data   */
  public java.lang.Long getNumBins() {
    return numBins;
  }

  /**
   * Sets the value of the 'numBins' field.
   * number of bins to return, e.g. 12 monthly bins for 1 year of data   * @param value the value to set.
   */
  public void setNumBins(java.lang.Long value) {
    this.numBins = value;
  }

  /**
   * Gets the value of the 'durationPerBin' field.
   * number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data   */
  public influent.idl.FL_Duration getDurationPerBin() {
    return durationPerBin;
  }

  /**
   * Sets the value of the 'durationPerBin' field.
   * number of intervals in a bin, e.g. 2 months/bin in 12 bins for 2 years of data   * @param value the value to set.
   */
  public void setDurationPerBin(influent.idl.FL_Duration value) {
    this.durationPerBin = value;
  }

  /** Creates a new FL_DateRange RecordBuilder */
  public static influent.idl.FL_DateRange.Builder newBuilder() {
    return new influent.idl.FL_DateRange.Builder();
  }
  
  /** Creates a new FL_DateRange RecordBuilder by copying an existing Builder */
  public static influent.idl.FL_DateRange.Builder newBuilder(influent.idl.FL_DateRange.Builder other) {
    return new influent.idl.FL_DateRange.Builder(other);
  }
  
  /** Creates a new FL_DateRange RecordBuilder by copying an existing FL_DateRange instance */
  public static influent.idl.FL_DateRange.Builder newBuilder(influent.idl.FL_DateRange other) {
    return new influent.idl.FL_DateRange.Builder(other);
  }
  
  /**
   * RecordBuilder for FL_DateRange instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FL_DateRange>
    implements org.apache.avro.data.RecordBuilder<FL_DateRange> {

    private long startDate;
    private long numBins;
    private influent.idl.FL_Duration durationPerBin;

    /** Creates a new Builder */
    private Builder() {
      super(influent.idl.FL_DateRange.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(influent.idl.FL_DateRange.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.startDate)) {
        this.startDate = data().deepCopy(fields()[0].schema(), other.startDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numBins)) {
        this.numBins = data().deepCopy(fields()[1].schema(), other.numBins);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.durationPerBin)) {
        this.durationPerBin = data().deepCopy(fields()[2].schema(), other.durationPerBin);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing FL_DateRange instance */
    private Builder(influent.idl.FL_DateRange other) {
            super(influent.idl.FL_DateRange.SCHEMA$);
      if (isValidValue(fields()[0], other.startDate)) {
        this.startDate = data().deepCopy(fields()[0].schema(), other.startDate);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.numBins)) {
        this.numBins = data().deepCopy(fields()[1].schema(), other.numBins);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.durationPerBin)) {
        this.durationPerBin = data().deepCopy(fields()[2].schema(), other.durationPerBin);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'startDate' field */
    public java.lang.Long getStartDate() {
      return startDate;
    }
    
    /** Sets the value of the 'startDate' field */
    public influent.idl.FL_DateRange.Builder setStartDate(long value) {
      validate(fields()[0], value);
      this.startDate = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'startDate' field has been set */
    public boolean hasStartDate() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'startDate' field */
    public influent.idl.FL_DateRange.Builder clearStartDate() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'numBins' field */
    public java.lang.Long getNumBins() {
      return numBins;
    }
    
    /** Sets the value of the 'numBins' field */
    public influent.idl.FL_DateRange.Builder setNumBins(long value) {
      validate(fields()[1], value);
      this.numBins = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'numBins' field has been set */
    public boolean hasNumBins() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'numBins' field */
    public influent.idl.FL_DateRange.Builder clearNumBins() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'durationPerBin' field */
    public influent.idl.FL_Duration getDurationPerBin() {
      return durationPerBin;
    }
    
    /** Sets the value of the 'durationPerBin' field */
    public influent.idl.FL_DateRange.Builder setDurationPerBin(influent.idl.FL_Duration value) {
      validate(fields()[2], value);
      this.durationPerBin = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'durationPerBin' field has been set */
    public boolean hasDurationPerBin() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'durationPerBin' field */
    public influent.idl.FL_DateRange.Builder clearDurationPerBin() {
      durationPerBin = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public FL_DateRange build() {
      try {
        FL_DateRange record = new FL_DateRange();
        record.startDate = fieldSetFlags()[0] ? this.startDate : (java.lang.Long) defaultValue(fields()[0]);
        record.numBins = fieldSetFlags()[1] ? this.numBins : (java.lang.Long) defaultValue(fields()[1]);
        record.durationPerBin = fieldSetFlags()[2] ? this.durationPerBin : (influent.idl.FL_Duration) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}