// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

package org.zoupi.test;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_zoupi_test_ZoupiRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_zoupi_test_ZoupiRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_zoupi_test_ZoupiResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_zoupi_test_ZoupiResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\022\016org.zoupi.test\"\033\n\014ZoupiReq" +
      "uest\022\013\n\003msg\030\001 \001(\t\"\034\n\rZoupiResponse\022\013\n\003ms" +
      "g\030\001 \001(\t2\\\n\021TrainingGrpcZoupi\022G\n\010GetZoupi" +
      "\022\034.org.zoupi.test.ZoupiRequest\032\035.org.zou" +
      "pi.test.ZoupiResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_zoupi_test_ZoupiRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_zoupi_test_ZoupiRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_zoupi_test_ZoupiRequest_descriptor,
        new java.lang.String[] { "Msg", });
    internal_static_org_zoupi_test_ZoupiResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_zoupi_test_ZoupiResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_zoupi_test_ZoupiResponse_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
