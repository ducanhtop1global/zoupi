// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tag.proto

package org.zoupi.tag;

public final class Tag {
  private Tag() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_zoupi_tag_GetIdsByTagReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_zoupi_tag_GetIdsByTagReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_zoupi_tag_GetIdsByTagRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ttag.proto\022\rorg.zoupi.tag\"\035\n\016GetIdsByTa" +
      "gReq\022\013\n\003tag\030\001 \001(\t\"\035\n\016GetIdsByTagRes\022\013\n\003i" +
      "ds\030\001 \001(\t2Z\n\013GetIdsByTag\022K\n\013GetIdsByTag\022\035" +
      ".org.zoupi.tag.GetIdsByTagReq\032\035.org.zoup" +
      "i.tag.GetIdsByTagResB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_zoupi_tag_GetIdsByTagReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_zoupi_tag_GetIdsByTagReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_zoupi_tag_GetIdsByTagReq_descriptor,
        new java.lang.String[] { "Tag", });
    internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_zoupi_tag_GetIdsByTagRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_zoupi_tag_GetIdsByTagRes_descriptor,
        new java.lang.String[] { "Ids", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}