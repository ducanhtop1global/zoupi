package org.zoupi.coordinator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: coordinator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ShardsGrpc {

  private ShardsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.coordinator.Shards";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.coordinator.InsertCategoryIfEmptyReq,
      org.zoupi.coordinator.InsertCategoryIfEmptyRes> getInsertCategoryIfEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertCategoryIfEmpty",
      requestType = org.zoupi.coordinator.InsertCategoryIfEmptyReq.class,
      responseType = org.zoupi.coordinator.InsertCategoryIfEmptyRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.coordinator.InsertCategoryIfEmptyReq,
      org.zoupi.coordinator.InsertCategoryIfEmptyRes> getInsertCategoryIfEmptyMethod() {
    io.grpc.MethodDescriptor<org.zoupi.coordinator.InsertCategoryIfEmptyReq, org.zoupi.coordinator.InsertCategoryIfEmptyRes> getInsertCategoryIfEmptyMethod;
    if ((getInsertCategoryIfEmptyMethod = ShardsGrpc.getInsertCategoryIfEmptyMethod) == null) {
      synchronized (ShardsGrpc.class) {
        if ((getInsertCategoryIfEmptyMethod = ShardsGrpc.getInsertCategoryIfEmptyMethod) == null) {
          ShardsGrpc.getInsertCategoryIfEmptyMethod = getInsertCategoryIfEmptyMethod =
              io.grpc.MethodDescriptor.<org.zoupi.coordinator.InsertCategoryIfEmptyReq, org.zoupi.coordinator.InsertCategoryIfEmptyRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InsertCategoryIfEmpty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.coordinator.InsertCategoryIfEmptyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.coordinator.InsertCategoryIfEmptyRes.getDefaultInstance()))
              .setSchemaDescriptor(new ShardsMethodDescriptorSupplier("InsertCategoryIfEmpty"))
              .build();
        }
      }
    }
    return getInsertCategoryIfEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShardsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardsStub>() {
        @java.lang.Override
        public ShardsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardsStub(channel, callOptions);
        }
      };
    return ShardsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShardsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardsBlockingStub>() {
        @java.lang.Override
        public ShardsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardsBlockingStub(channel, callOptions);
        }
      };
    return ShardsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShardsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ShardsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ShardsFutureStub>() {
        @java.lang.Override
        public ShardsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ShardsFutureStub(channel, callOptions);
        }
      };
    return ShardsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void insertCategoryIfEmpty(org.zoupi.coordinator.InsertCategoryIfEmptyReq request,
        io.grpc.stub.StreamObserver<org.zoupi.coordinator.InsertCategoryIfEmptyRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInsertCategoryIfEmptyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Shards.
   */
  public static abstract class ShardsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ShardsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Shards.
   */
  public static final class ShardsStub
      extends io.grpc.stub.AbstractAsyncStub<ShardsStub> {
    private ShardsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardsStub(channel, callOptions);
    }

    /**
     */
    public void insertCategoryIfEmpty(org.zoupi.coordinator.InsertCategoryIfEmptyReq request,
        io.grpc.stub.StreamObserver<org.zoupi.coordinator.InsertCategoryIfEmptyRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInsertCategoryIfEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Shards.
   */
  public static final class ShardsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ShardsBlockingStub> {
    private ShardsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardsBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.coordinator.InsertCategoryIfEmptyRes insertCategoryIfEmpty(org.zoupi.coordinator.InsertCategoryIfEmptyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInsertCategoryIfEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Shards.
   */
  public static final class ShardsFutureStub
      extends io.grpc.stub.AbstractFutureStub<ShardsFutureStub> {
    private ShardsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShardsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ShardsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.coordinator.InsertCategoryIfEmptyRes> insertCategoryIfEmpty(
        org.zoupi.coordinator.InsertCategoryIfEmptyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInsertCategoryIfEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT_CATEGORY_IF_EMPTY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT_CATEGORY_IF_EMPTY:
          serviceImpl.insertCategoryIfEmpty((org.zoupi.coordinator.InsertCategoryIfEmptyReq) request,
              (io.grpc.stub.StreamObserver<org.zoupi.coordinator.InsertCategoryIfEmptyRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getInsertCategoryIfEmptyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zoupi.coordinator.InsertCategoryIfEmptyReq,
              org.zoupi.coordinator.InsertCategoryIfEmptyRes>(
                service, METHODID_INSERT_CATEGORY_IF_EMPTY)))
        .build();
  }

  private static abstract class ShardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShardsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.coordinator.Coordinator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Shards");
    }
  }

  private static final class ShardsFileDescriptorSupplier
      extends ShardsBaseDescriptorSupplier {
    ShardsFileDescriptorSupplier() {}
  }

  private static final class ShardsMethodDescriptorSupplier
      extends ShardsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ShardsMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShardsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShardsFileDescriptorSupplier())
              .addMethod(getInsertCategoryIfEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
