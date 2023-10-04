package org.zoupi.tag;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: tag.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetIdsByTagGrpc {

  private GetIdsByTagGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.tag.GetIdsByTag";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.tag.GetIdsByTagReq,
      org.zoupi.tag.GetIdsByTagRes> getGetIdsByTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIdsByTag",
      requestType = org.zoupi.tag.GetIdsByTagReq.class,
      responseType = org.zoupi.tag.GetIdsByTagRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.tag.GetIdsByTagReq,
      org.zoupi.tag.GetIdsByTagRes> getGetIdsByTagMethod() {
    io.grpc.MethodDescriptor<org.zoupi.tag.GetIdsByTagReq, org.zoupi.tag.GetIdsByTagRes> getGetIdsByTagMethod;
    if ((getGetIdsByTagMethod = GetIdsByTagGrpc.getGetIdsByTagMethod) == null) {
      synchronized (GetIdsByTagGrpc.class) {
        if ((getGetIdsByTagMethod = GetIdsByTagGrpc.getGetIdsByTagMethod) == null) {
          GetIdsByTagGrpc.getGetIdsByTagMethod = getGetIdsByTagMethod =
              io.grpc.MethodDescriptor.<org.zoupi.tag.GetIdsByTagReq, org.zoupi.tag.GetIdsByTagRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIdsByTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.tag.GetIdsByTagReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.tag.GetIdsByTagRes.getDefaultInstance()))
              .setSchemaDescriptor(new GetIdsByTagMethodDescriptorSupplier("GetIdsByTag"))
              .build();
        }
      }
    }
    return getGetIdsByTagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetIdsByTagStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagStub>() {
        @java.lang.Override
        public GetIdsByTagStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetIdsByTagStub(channel, callOptions);
        }
      };
    return GetIdsByTagStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetIdsByTagBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagBlockingStub>() {
        @java.lang.Override
        public GetIdsByTagBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetIdsByTagBlockingStub(channel, callOptions);
        }
      };
    return GetIdsByTagBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetIdsByTagFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetIdsByTagFutureStub>() {
        @java.lang.Override
        public GetIdsByTagFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetIdsByTagFutureStub(channel, callOptions);
        }
      };
    return GetIdsByTagFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getIdsByTag(org.zoupi.tag.GetIdsByTagReq request,
        io.grpc.stub.StreamObserver<org.zoupi.tag.GetIdsByTagRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIdsByTagMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service GetIdsByTag.
   */
  public static abstract class GetIdsByTagImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return GetIdsByTagGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service GetIdsByTag.
   */
  public static final class GetIdsByTagStub
      extends io.grpc.stub.AbstractAsyncStub<GetIdsByTagStub> {
    private GetIdsByTagStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetIdsByTagStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetIdsByTagStub(channel, callOptions);
    }

    /**
     */
    public void getIdsByTag(org.zoupi.tag.GetIdsByTagReq request,
        io.grpc.stub.StreamObserver<org.zoupi.tag.GetIdsByTagRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIdsByTagMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service GetIdsByTag.
   */
  public static final class GetIdsByTagBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<GetIdsByTagBlockingStub> {
    private GetIdsByTagBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetIdsByTagBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetIdsByTagBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.tag.GetIdsByTagRes getIdsByTag(org.zoupi.tag.GetIdsByTagReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIdsByTagMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service GetIdsByTag.
   */
  public static final class GetIdsByTagFutureStub
      extends io.grpc.stub.AbstractFutureStub<GetIdsByTagFutureStub> {
    private GetIdsByTagFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetIdsByTagFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetIdsByTagFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.tag.GetIdsByTagRes> getIdsByTag(
        org.zoupi.tag.GetIdsByTagReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIdsByTagMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_IDS_BY_TAG = 0;

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
        case METHODID_GET_IDS_BY_TAG:
          serviceImpl.getIdsByTag((org.zoupi.tag.GetIdsByTagReq) request,
              (io.grpc.stub.StreamObserver<org.zoupi.tag.GetIdsByTagRes>) responseObserver);
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
          getGetIdsByTagMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zoupi.tag.GetIdsByTagReq,
              org.zoupi.tag.GetIdsByTagRes>(
                service, METHODID_GET_IDS_BY_TAG)))
        .build();
  }

  private static abstract class GetIdsByTagBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetIdsByTagBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.tag.Tag.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetIdsByTag");
    }
  }

  private static final class GetIdsByTagFileDescriptorSupplier
      extends GetIdsByTagBaseDescriptorSupplier {
    GetIdsByTagFileDescriptorSupplier() {}
  }

  private static final class GetIdsByTagMethodDescriptorSupplier
      extends GetIdsByTagBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    GetIdsByTagMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (GetIdsByTagGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetIdsByTagFileDescriptorSupplier())
              .addMethod(getGetIdsByTagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
