// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tag.proto

package org.zoupi.tag;

/**
 * Protobuf type {@code org.zoupi.tag.GetIdsByTagRes}
 */
public  final class GetIdsByTagRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.zoupi.tag.GetIdsByTagRes)
    GetIdsByTagResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetIdsByTagRes.newBuilder() to construct.
  private GetIdsByTagRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetIdsByTagRes() {
    ids_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetIdsByTagRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetIdsByTagRes(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            ids_ = s;
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
    return org.zoupi.tag.Tag.internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.zoupi.tag.Tag.internal_static_org_zoupi_tag_GetIdsByTagRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.zoupi.tag.GetIdsByTagRes.class, org.zoupi.tag.GetIdsByTagRes.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  private volatile java.lang.Object ids_;
  /**
   * <code>string ids = 1;</code>
   * @return The ids.
   */
  public java.lang.String getIds() {
    java.lang.Object ref = ids_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ids_ = s;
      return s;
    }
  }
  /**
   * <code>string ids = 1;</code>
   * @return The bytes for ids.
   */
  public com.google.protobuf.ByteString
      getIdsBytes() {
    java.lang.Object ref = ids_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ids_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getIdsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ids_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ids_);
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
    if (!(obj instanceof org.zoupi.tag.GetIdsByTagRes)) {
      return super.equals(obj);
    }
    org.zoupi.tag.GetIdsByTagRes other = (org.zoupi.tag.GetIdsByTagRes) obj;

    if (!getIds()
        .equals(other.getIds())) return false;
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
    hash = (37 * hash) + IDS_FIELD_NUMBER;
    hash = (53 * hash) + getIds().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.zoupi.tag.GetIdsByTagRes parseFrom(
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
  public static Builder newBuilder(org.zoupi.tag.GetIdsByTagRes prototype) {
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
   * Protobuf type {@code org.zoupi.tag.GetIdsByTagRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.zoupi.tag.GetIdsByTagRes)
      org.zoupi.tag.GetIdsByTagResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.zoupi.tag.Tag.internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.zoupi.tag.Tag.internal_static_org_zoupi_tag_GetIdsByTagRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.zoupi.tag.GetIdsByTagRes.class, org.zoupi.tag.GetIdsByTagRes.Builder.class);
    }

    // Construct using org.zoupi.tag.GetIdsByTagRes.newBuilder()
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
      ids_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.zoupi.tag.Tag.internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor;
    }

    @java.lang.Override
    public org.zoupi.tag.GetIdsByTagRes getDefaultInstanceForType() {
      return org.zoupi.tag.GetIdsByTagRes.getDefaultInstance();
    }

    @java.lang.Override
    public org.zoupi.tag.GetIdsByTagRes build() {
      org.zoupi.tag.GetIdsByTagRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.zoupi.tag.GetIdsByTagRes buildPartial() {
      org.zoupi.tag.GetIdsByTagRes result = new org.zoupi.tag.GetIdsByTagRes(this);
      result.ids_ = ids_;
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
      if (other instanceof org.zoupi.tag.GetIdsByTagRes) {
        return mergeFrom((org.zoupi.tag.GetIdsByTagRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.zoupi.tag.GetIdsByTagRes other) {
      if (other == org.zoupi.tag.GetIdsByTagRes.getDefaultInstance()) return this;
      if (!other.getIds().isEmpty()) {
        ids_ = other.ids_;
        onChanged();
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
      org.zoupi.tag.GetIdsByTagRes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.zoupi.tag.GetIdsByTagRes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ids_ = "";
    /**
     * <code>string ids = 1;</code>
     * @return The ids.
     */
    public java.lang.String getIds() {
      java.lang.Object ref = ids_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ids_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ids = 1;</code>
     * @return The bytes for ids.
     */
    public com.google.protobuf.ByteString
        getIdsBytes() {
      java.lang.Object ref = ids_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ids_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ids = 1;</code>
     * @param value The ids to set.
     * @return This builder for chaining.
     */
    public Builder setIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ids_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ids = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIds() {
      
      ids_ = getDefaultInstance().getIds();
      onChanged();
      return this;
    }
    /**
     * <code>string ids = 1;</code>
     * @param value The bytes for ids to set.
     * @return This builder for chaining.
     */
    public Builder setIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ids_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.zoupi.tag.GetIdsByTagRes)
  }

  // @@protoc_insertion_point(class_scope:org.zoupi.tag.GetIdsByTagRes)
  private static final org.zoupi.tag.GetIdsByTagRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.zoupi.tag.GetIdsByTagRes();
  }

  public static org.zoupi.tag.GetIdsByTagRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetIdsByTagRes>
      PARSER = new com.google.protobuf.AbstractParser<GetIdsByTagRes>() {
    @java.lang.Override
    public GetIdsByTagRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetIdsByTagRes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetIdsByTagRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetIdsByTagRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.zoupi.tag.GetIdsByTagRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

