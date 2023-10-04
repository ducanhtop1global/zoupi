package org.zoupi.coordinator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: coordinator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoViewGrpc {

  private VideoViewGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.coordinator.VideoView";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.coordinator.GetVideoViewReq,
      org.zoupi.coordinator.GetVideoViewRes> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = org.zoupi.coordinator.GetVideoViewReq.class,
      responseType = org.zoupi.coordinator.GetVideoViewRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.coordinator.GetVideoViewReq,
      org.zoupi.coordinator.GetVideoViewRes> getGetMethod() {
    io.grpc.MethodDescriptor<org.zoupi.coordinator.GetVideoViewReq, org.zoupi.coordinator.GetVideoViewRes> getGetMethod;
    if ((getGetMethod = VideoViewGrpc.getGetMethod) == null) {
      synchronized (VideoViewGrpc.class) {
        if ((getGetMethod = VideoViewGrpc.getGetMethod) == null) {
          VideoViewGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<org.zoupi.coordinator.GetVideoViewReq, org.zoupi.coordinator.GetVideoViewRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.coordinator.GetVideoViewReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.coordinator.GetVideoViewRes.getDefaultInstance()))
              .setSchemaDescriptor(new VideoViewMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoViewStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoViewStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoViewStub>() {
        @java.lang.Override
        public VideoViewStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoViewStub(channel, callOptions);
        }
      };
    return VideoViewStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoViewBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoViewBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoViewBlockingStub>() {
        @java.lang.Override
        public VideoViewBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoViewBlockingStub(channel, callOptions);
        }
      };
    return VideoViewBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoViewFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoViewFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoViewFutureStub>() {
        @java.lang.Override
        public VideoViewFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoViewFutureStub(channel, callOptions);
        }
      };
    return VideoViewFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(org.zoupi.coordinator.GetVideoViewReq request,
        io.grpc.stub.StreamObserver<org.zoupi.coordinator.GetVideoViewRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VideoView.
   */
  public static abstract class VideoViewImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VideoViewGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VideoView.
   */
  public static final class VideoViewStub
      extends io.grpc.stub.AbstractAsyncStub<VideoViewStub> {
    private VideoViewStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoViewStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoViewStub(channel, callOptions);
    }

    /**
     */
    public void get(org.zoupi.coordinator.GetVideoViewReq request,
        io.grpc.stub.StreamObserver<org.zoupi.coordinator.GetVideoViewRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VideoView.
   */
  public static final class VideoViewBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VideoViewBlockingStub> {
    private VideoViewBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoViewBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoViewBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.coordinator.GetVideoViewRes get(org.zoupi.coordinator.GetVideoViewReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VideoView.
   */
  public static final class VideoViewFutureStub
      extends io.grpc.stub.AbstractFutureStub<VideoViewFutureStub> {
    private VideoViewFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoViewFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoViewFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.coordinator.GetVideoViewRes> get(
        org.zoupi.coordinator.GetVideoViewReq request) {
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
          serviceImpl.get((org.zoupi.coordinator.GetVideoViewReq) request,
              (io.grpc.stub.StreamObserver<org.zoupi.coordinator.GetVideoViewRes>) responseObserver);
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
              org.zoupi.coordinator.GetVideoViewReq,
              org.zoupi.coordinator.GetVideoViewRes>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class VideoViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoViewBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.coordinator.Coordinator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoView");
    }
  }

  private static final class VideoViewFileDescriptorSupplier
      extends VideoViewBaseDescriptorSupplier {
    VideoViewFileDescriptorSupplier() {}
  }

  private static final class VideoViewMethodDescriptorSupplier
      extends VideoViewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VideoViewMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VideoViewGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoViewFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
