// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coordinator.proto

package org.zoupi.coordinator;

/**
 * Protobuf type {@code org.zoupi.coordinator.GetVideoViewRes}
 */
public  final class GetVideoViewRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.zoupi.coordinator.GetVideoViewRes)
    GetVideoViewResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetVideoViewRes.newBuilder() to construct.
  private GetVideoViewRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetVideoViewRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetVideoViewRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetVideoViewRes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            amountView_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
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
    return org.zoupi.coordinator.Coordinator.internal_static_org_zoupi_coordinator_GetVideoViewRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zoupi.coordinator.Coordinator.internal_static_org_zoupi_coordinator_GetVideoViewRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zoupi.coordinator.GetVideoViewRes.class, org.zoupi.coordinator.GetVideoViewRes.Builder.class);
  }

  public static final int AMOUNT_VIEW_FIELD_NUMBER = 1;
  private int amountView_;
  /**
   * <code>int32 amount_view = 1;</code>
   * @return The amountView.
   */
  public int getAmountView() {
    return amountView_;
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
    if (amountView_ != 0) {
      output.writeInt32(1, amountView_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amountView_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, amountView_);
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
    if (!(obj instanceof org.zoupi.coordinator.GetVideoViewRes)) {
      return super.equals(obj);
    }
    org.zoupi.coordinator.GetVideoViewRes other = (org.zoupi.coordinator.GetVideoViewRes) obj;

    if (getAmountView()
        != other.getAmountView()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AMOUNT_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + getAmountView();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zoupi.coordinator.GetVideoViewRes parseFrom(
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
  public static Builder newBuilder(org.zoupi.coordinator.GetVideoViewRes prototype) {
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
   * Protobuf type {@code org.zoupi.coordinator.GetVideoViewRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zoupi.coordinator.GetVideoViewRes)
      org.zoupi.coordinator.GetVideoViewResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zoupi.coordinator.Coordinator.internal_static_org_zoupi_coordinator_GetVideoViewRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zoupi.coordinator.Coordinator.internal_static_org_zoupi_coordinator_GetVideoViewRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zoupi.coordinator.GetVideoViewRes.class, org.zoupi.coordinator.GetVideoViewRes.Builder.class);
    }

    // Construct using org.zoupi.coordinator.GetVideoViewRes.newBuilder()
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
      amountView_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zoupi.coordinator.Coordinator.internal_static_org_zoupi_coordinator_GetVideoViewRes_descriptor;
    }

    @java.lang.Override
    public org.zoupi.coordinator.GetVideoViewRes getDefaultInstanceForType() {
      return org.zoupi.coordinator.GetVideoViewRes.getDefaultInstance();
    }

    @java.lang.Override
    public org.zoupi.coordinator.GetVideoViewRes build() {
      org.zoupi.coordinator.GetVideoViewRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zoupi.coordinator.GetVideoViewRes buildPartial() {
      org.zoupi.coordinator.GetVideoViewRes result = new org.zoupi.coordinator.GetVideoViewRes(this);
      result.amountView_ = amountView_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.zoupi.coordinator.GetVideoViewRes) {
        return mergeFrom((org.zoupi.coordinator.GetVideoViewRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zoupi.coordinator.GetVideoViewRes other) {
      if (other == org.zoupi.coordinator.GetVideoViewRes.getDefaultInstance()) return this;
      if (other.getAmountView() != 0) {
        setAmountView(other.getAmountView());
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
      org.zoupi.coordinator.GetVideoViewRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zoupi.coordinator.GetVideoViewRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int amountView_ ;
    /**
     * <code>int32 amount_view = 1;</code>
     * @return The amountView.
     */
    public int getAmountView() {
      return amountView_;
    }
    /**
     * <code>int32 amount_view = 1;</code>
     * @param value The amountView to set.
     * @return This builder for chaining.
     */
    public Builder setAmountView(int value) {
      
      amountView_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 amount_view = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAmountView() {
      
      amountView_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.zoupi.coordinator.GetVideoViewRes)
  }

  // @@protoc_insertion_point(class_scope:org.zoupi.coordinator.GetVideoViewRes)
  private static final org.zoupi.coordinator.GetVideoViewRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zoupi.coordinator.GetVideoViewRes();
  }

  public static org.zoupi.coordinator.GetVideoViewRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetVideoViewRes>
      PARSER = new com.google.protobuf.AbstractParser<GetVideoViewRes>() {
    @java.lang.Override
    public GetVideoViewRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetVideoViewRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetVideoViewRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetVideoViewRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zoupi.coordinator.GetVideoViewRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

