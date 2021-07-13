// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sum.proto

package com.proto.sum;

/**
 * Protobuf type {@code sum.InputValues}
 */
public  final class InputValues extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sum.InputValues)
    InputValuesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InputValues.newBuilder() to construct.
  private InputValues(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InputValues() {
    num1_ = 0;
    num2_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InputValues(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            num1_ = input.readInt32();
            break;
          }
          case 16: {

            num2_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.sum.Sum.internal_static_sum_InputValues_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.sum.Sum.internal_static_sum_InputValues_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.sum.InputValues.class, com.proto.sum.InputValues.Builder.class);
  }

  public static final int NUM1_FIELD_NUMBER = 1;
  private int num1_;
  /**
   * <code>int32 num1 = 1;</code>
   */
  public int getNum1() {
    return num1_;
  }

  public static final int NUM2_FIELD_NUMBER = 2;
  private int num2_;
  /**
   * <code>int32 num2 = 2;</code>
   */
  public int getNum2() {
    return num2_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (num1_ != 0) {
      output.writeInt32(1, num1_);
    }
    if (num2_ != 0) {
      output.writeInt32(2, num2_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (num1_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, num1_);
    }
    if (num2_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, num2_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.sum.InputValues)) {
      return super.equals(obj);
    }
    com.proto.sum.InputValues other = (com.proto.sum.InputValues) obj;

    boolean result = true;
    result = result && (getNum1()
        == other.getNum1());
    result = result && (getNum2()
        == other.getNum2());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NUM1_FIELD_NUMBER;
    hash = (53 * hash) + getNum1();
    hash = (37 * hash) + NUM2_FIELD_NUMBER;
    hash = (53 * hash) + getNum2();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.sum.InputValues parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.InputValues parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.InputValues parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.InputValues parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.InputValues parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.sum.InputValues parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.sum.InputValues parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.InputValues parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.InputValues parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.sum.InputValues parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.sum.InputValues parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.sum.InputValues parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.sum.InputValues prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code sum.InputValues}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sum.InputValues)
      com.proto.sum.InputValuesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.sum.Sum.internal_static_sum_InputValues_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.sum.Sum.internal_static_sum_InputValues_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.sum.InputValues.class, com.proto.sum.InputValues.Builder.class);
    }

    // Construct using com.proto.sum.InputValues.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      num1_ = 0;

      num2_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.sum.Sum.internal_static_sum_InputValues_descriptor;
    }

    @java.lang.Override
    public com.proto.sum.InputValues getDefaultInstanceForType() {
      return com.proto.sum.InputValues.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.sum.InputValues build() {
      com.proto.sum.InputValues result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.sum.InputValues buildPartial() {
      com.proto.sum.InputValues result = new com.proto.sum.InputValues(this);
      result.num1_ = num1_;
      result.num2_ = num2_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.sum.InputValues) {
        return mergeFrom((com.proto.sum.InputValues)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.sum.InputValues other) {
      if (other == com.proto.sum.InputValues.getDefaultInstance()) return this;
      if (other.getNum1() != 0) {
        setNum1(other.getNum1());
      }
      if (other.getNum2() != 0) {
        setNum2(other.getNum2());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.proto.sum.InputValues parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.sum.InputValues) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int num1_ ;
    /**
     * <code>int32 num1 = 1;</code>
     */
    public int getNum1() {
      return num1_;
    }
    /**
     * <code>int32 num1 = 1;</code>
     */
    public Builder setNum1(int value) {
      
      num1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num1 = 1;</code>
     */
    public Builder clearNum1() {
      
      num1_ = 0;
      onChanged();
      return this;
    }

    private int num2_ ;
    /**
     * <code>int32 num2 = 2;</code>
     */
    public int getNum2() {
      return num2_;
    }
    /**
     * <code>int32 num2 = 2;</code>
     */
    public Builder setNum2(int value) {
      
      num2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 num2 = 2;</code>
     */
    public Builder clearNum2() {
      
      num2_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sum.InputValues)
  }

  // @@protoc_insertion_point(class_scope:sum.InputValues)
  private static final com.proto.sum.InputValues DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.sum.InputValues();
  }

  public static com.proto.sum.InputValues getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InputValues>
      PARSER = new com.google.protobuf.AbstractParser<InputValues>() {
    @java.lang.Override
    public InputValues parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InputValues(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InputValues> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InputValues> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.sum.InputValues getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

