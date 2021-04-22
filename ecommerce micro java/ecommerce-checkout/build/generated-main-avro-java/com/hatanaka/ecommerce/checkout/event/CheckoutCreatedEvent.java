/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.hatanaka.ecommerce.checkout.event;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CheckoutCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -557020486703905685L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CheckoutCreatedEvent\",\"namespace\":\"com.hatanaka.ecommerce.checkout.event\",\"fields\":[{\"name\":\"checkoutCode\",\"type\":[{\"type\":\"string\",\"avro.java.string\":\"String\"},\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CheckoutCreatedEvent> ENCODER =
      new BinaryMessageEncoder<CheckoutCreatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CheckoutCreatedEvent> DECODER =
      new BinaryMessageDecoder<CheckoutCreatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CheckoutCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CheckoutCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CheckoutCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CheckoutCreatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CheckoutCreatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CheckoutCreatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CheckoutCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CheckoutCreatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String checkoutCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CheckoutCreatedEvent() {}

  /**
   * All-args constructor.
   * @param checkoutCode The new value for checkoutCode
   */
  public CheckoutCreatedEvent(java.lang.String checkoutCode) {
    this.checkoutCode = checkoutCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return checkoutCode;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: checkoutCode = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'checkoutCode' field.
   * @return The value of the 'checkoutCode' field.
   */
  public java.lang.String getCheckoutCode() {
    return checkoutCode;
  }


  /**
   * Sets the value of the 'checkoutCode' field.
   * @param value the value to set.
   */
  public void setCheckoutCode(java.lang.String value) {
    this.checkoutCode = value;
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder() {
    return new com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder();
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder(com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder other) {
    if (other == null) {
      return new com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder();
    } else {
      return new com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new CheckoutCreatedEvent RecordBuilder by copying an existing CheckoutCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new CheckoutCreatedEvent RecordBuilder
   */
  public static com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder newBuilder(com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent other) {
    if (other == null) {
      return new com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder();
    } else {
      return new com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for CheckoutCreatedEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CheckoutCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<CheckoutCreatedEvent> {

    private java.lang.String checkoutCode;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CheckoutCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.checkoutCode)) {
        this.checkoutCode = data().deepCopy(fields()[0].schema(), other.checkoutCode);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'checkoutCode' field.
      * @return The value.
      */
    public java.lang.String getCheckoutCode() {
      return checkoutCode;
    }


    /**
      * Sets the value of the 'checkoutCode' field.
      * @param value The value of 'checkoutCode'.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder setCheckoutCode(java.lang.String value) {
      validate(fields()[0], value);
      this.checkoutCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'checkoutCode' field has been set.
      * @return True if the 'checkoutCode' field has been set, false otherwise.
      */
    public boolean hasCheckoutCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'checkoutCode' field.
      * @return This builder.
      */
    public com.hatanaka.ecommerce.checkout.event.CheckoutCreatedEvent.Builder clearCheckoutCode() {
      checkoutCode = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CheckoutCreatedEvent build() {
      try {
        CheckoutCreatedEvent record = new CheckoutCreatedEvent();
        record.checkoutCode = fieldSetFlags()[0] ? this.checkoutCode : (java.lang.String) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CheckoutCreatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<CheckoutCreatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CheckoutCreatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<CheckoutCreatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.checkoutCode == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeString(this.checkoutCode);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 0) {
        in.readNull();
        this.checkoutCode = null;
      } else {
        this.checkoutCode = in.readString();
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 0) {
            in.readNull();
            this.checkoutCode = null;
          } else {
            this.checkoutCode = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










