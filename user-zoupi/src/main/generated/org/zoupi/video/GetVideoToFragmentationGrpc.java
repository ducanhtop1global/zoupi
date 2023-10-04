package org.zoupi.video;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: video.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetVideoToFragmentationGrpc {

  private GetVideoToFragmentationGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.video.GetVideoToFragmentation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.video.GetVideoToFragmentationRequest,
      org.zoupi.video.GetVideoToFragmentationResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = org.zoupi.video.GetVideoToFragmentationRequest.class,
      responseType = org.zoupi.video.GetVideoToFragmentationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.video.GetVideoToFragmentationRequest,
      org.zoupi.video.GetVideoToFragmentationResponse> getGetMethod() {
    io.grpc.MethodDescriptor<org.zoupi.video.GetVideoToFragmentationRequest, org.zoupi.video.GetVideoToFragmentationResponse> getGetMethod;
    if ((getGetMethod = GetVideoToFragmentationGrpc.getGetMethod) == null) {
      synchronized (GetVideoToFragmentationGrpc.class) {
        if ((getGetMethod = GetVideoToFragmentationGrpc.getGetMethod) == null) {
          GetVideoToFragmentationGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<org.zoupi.video.GetVideoToFragmentationRequest, org.zoupi.video.GetVideoToFragmentationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.video.GetVideoToFragmentationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.video.GetVideoToFragmentationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GetVideoToFragmentationMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetVideoToFragmentationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationStub>() {
        @java.lang.Override
        public GetVideoToFragmentationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetVideoToFragmentationStub(channel, callOptions);
        }
      };
    return GetVideoToFragmentationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetVideoToFragmentationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationBlockingStub>() {
        @java.lang.Override
        public GetVideoToFragmentationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetVideoToFragmentationBlockingStub(channel, callOptions);
        }
      };
    return GetVideoToFragmentationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetVideoToFragmentationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetVideoToFragmentationFutureStub>() {
        @java.lang.Override
        public GetVideoToFragmentationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetVideoToFragmentationFutureStub(channel, callOptions);
        }
      };
    return GetVideoToFragmentationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(org.zoupi.video.GetVideoToFragmentationRequest request,
        io.grpc.stub.StreamObserver<org.zoupi.video.GetVideoToFragmentationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GetVideoToFragmentation.
   */
  public static abstract class GetVideoToFragmentationImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetVideoToFragmentationGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GetVideoToFragmentation.
   */
  public static final class GetVideoToFragmentationStub
      extends io.grpc.stub.AbstractAsyncStub<GetVideoToFragmentationStub> {
    private GetVideoToFragmentationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetVideoToFragmentationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetVideoToFragmentationStub(channel, callOptions);
    }

    /**
     */
    public void get(org.zoupi.video.GetVideoToFragmentationRequest request,
        io.grpc.stub.StreamObserver<org.zoupi.video.GetVideoToFragmentationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GetVideoToFragmentation.
   */
  public static final class GetVideoToFragmentationBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetVideoToFragmentationBlockingStub> {
    private GetVideoToFragmentationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetVideoToFragmentationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetVideoToFragmentationBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.video.GetVideoToFragmentationResponse get(org.zoupi.video.GetVideoToFragmentationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GetVideoToFragmentation.
   */
  public static final class GetVideoToFragmentationFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetVideoToFragmentationFutureStub> {
    private GetVideoToFragmentationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetVideoToFragmentationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetVideoToFragmentationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.video.GetVideoToFragmentationResponse> get(
        org.zoupi.video.GetVideoToFragmentationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

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
        case METHODID_GET:
          serviceImpl.get((org.zoupi.video.GetVideoToFragmentationRequest) request,
              (io.grpc.stub.StreamObserver<org.zoupi.video.GetVideoToFragmentationResponse>) responseObserver);
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
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zoupi.video.GetVideoToFragmentationRequest,
              org.zoupi.video.GetVideoToFragmentationResponse>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class GetVideoToFragmentationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetVideoToFragmentationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.video.Video.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetVideoToFragmentation");
    }
  }

  private static final class GetVideoToFragmentationFileDescriptorSupplier
      extends GetVideoToFragmentationBaseDescriptorSupplier {
    GetVideoToFragmentationFileDescriptorSupplier() {}
  }

  private static final class GetVideoToFragmentationMethodDescriptorSupplier
      extends GetVideoToFragmentationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GetVideoToFragmentationMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GetVideoToFragmentationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetVideoToFragmentationFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
