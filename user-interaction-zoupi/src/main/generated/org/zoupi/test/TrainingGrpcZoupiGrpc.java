package org.zoupi.test;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: test.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TrainingGrpcZoupiGrpc {

  private TrainingGrpcZoupiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.test.TrainingGrpcZoupi";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.test.ZoupiRequest,
      org.zoupi.test.ZoupiResponse> getGetZoupiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetZoupi",
      requestType = org.zoupi.test.ZoupiRequest.class,
      responseType = org.zoupi.test.ZoupiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.test.ZoupiRequest,
      org.zoupi.test.ZoupiResponse> getGetZoupiMethod() {
    io.grpc.MethodDescriptor<org.zoupi.test.ZoupiRequest, org.zoupi.test.ZoupiResponse> getGetZoupiMethod;
    if ((getGetZoupiMethod = TrainingGrpcZoupiGrpc.getGetZoupiMethod) == null) {
      synchronized (TrainingGrpcZoupiGrpc.class) {
        if ((getGetZoupiMethod = TrainingGrpcZoupiGrpc.getGetZoupiMethod) == null) {
          TrainingGrpcZoupiGrpc.getGetZoupiMethod = getGetZoupiMethod =
              io.grpc.MethodDescriptor.<org.zoupi.test.ZoupiRequest, org.zoupi.test.ZoupiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetZoupi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.test.ZoupiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.test.ZoupiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrainingGrpcZoupiMethodDescriptorSupplier("GetZoupi"))
              .build();
        }
      }
    }
    return getGetZoupiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrainingGrpcZoupiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiStub>() {
        @java.lang.Override
        public TrainingGrpcZoupiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainingGrpcZoupiStub(channel, callOptions);
        }
      };
    return TrainingGrpcZoupiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrainingGrpcZoupiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiBlockingStub>() {
        @java.lang.Override
        public TrainingGrpcZoupiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainingGrpcZoupiBlockingStub(channel, callOptions);
        }
      };
    return TrainingGrpcZoupiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrainingGrpcZoupiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrainingGrpcZoupiFutureStub>() {
        @java.lang.Override
        public TrainingGrpcZoupiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrainingGrpcZoupiFutureStub(channel, callOptions);
        }
      };
    return TrainingGrpcZoupiFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getZoupi(org.zoupi.test.ZoupiRequest request,
        io.grpc.stub.StreamObserver<org.zoupi.test.ZoupiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetZoupiMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TrainingGrpcZoupi.
   */
  public static abstract class TrainingGrpcZoupiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TrainingGrpcZoupiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TrainingGrpcZoupi.
   */
  public static final class TrainingGrpcZoupiStub
      extends io.grpc.stub.AbstractAsyncStub<TrainingGrpcZoupiStub> {
    private TrainingGrpcZoupiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainingGrpcZoupiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainingGrpcZoupiStub(channel, callOptions);
    }

    /**
     */
    public void getZoupi(org.zoupi.test.ZoupiRequest request,
        io.grpc.stub.StreamObserver<org.zoupi.test.ZoupiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetZoupiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TrainingGrpcZoupi.
   */
  public static final class TrainingGrpcZoupiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TrainingGrpcZoupiBlockingStub> {
    private TrainingGrpcZoupiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainingGrpcZoupiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainingGrpcZoupiBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.test.ZoupiResponse getZoupi(org.zoupi.test.ZoupiRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetZoupiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TrainingGrpcZoupi.
   */
  public static final class TrainingGrpcZoupiFutureStub
      extends io.grpc.stub.AbstractFutureStub<TrainingGrpcZoupiFutureStub> {
    private TrainingGrpcZoupiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainingGrpcZoupiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrainingGrpcZoupiFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.test.ZoupiResponse> getZoupi(
        org.zoupi.test.ZoupiRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetZoupiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZOUPI = 0;

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
        case METHODID_GET_ZOUPI:
          serviceImpl.getZoupi((org.zoupi.test.ZoupiRequest) request,
              (io.grpc.stub.StreamObserver<org.zoupi.test.ZoupiResponse>) responseObserver);
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
          getGetZoupiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zoupi.test.ZoupiRequest,
              org.zoupi.test.ZoupiResponse>(
                service, METHODID_GET_ZOUPI)))
        .build();
  }

  private static abstract class TrainingGrpcZoupiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrainingGrpcZoupiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.test.Test.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrainingGrpcZoupi");
    }
  }

  private static final class TrainingGrpcZoupiFileDescriptorSupplier
      extends TrainingGrpcZoupiBaseDescriptorSupplier {
    TrainingGrpcZoupiFileDescriptorSupplier() {}
  }

  private static final class TrainingGrpcZoupiMethodDescriptorSupplier
      extends TrainingGrpcZoupiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TrainingGrpcZoupiMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TrainingGrpcZoupiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrainingGrpcZoupiFileDescriptorSupplier())
              .addMethod(getGetZoupiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
