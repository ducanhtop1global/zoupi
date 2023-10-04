package org.zoupi.interaction;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: user-interaction.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LabelGrpc {

  private LabelGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.zoupi.interaction.Label";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.zoupi.interaction.GetLabelByIdUserReq,
      org.zoupi.interaction.GetLabelByIdUserRes> getGetByIdUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetByIdUser",
      requestType = org.zoupi.interaction.GetLabelByIdUserReq.class,
      responseType = org.zoupi.interaction.GetLabelByIdUserRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.zoupi.interaction.GetLabelByIdUserReq,
      org.zoupi.interaction.GetLabelByIdUserRes> getGetByIdUserMethod() {
    io.grpc.MethodDescriptor<org.zoupi.interaction.GetLabelByIdUserReq, org.zoupi.interaction.GetLabelByIdUserRes> getGetByIdUserMethod;
    if ((getGetByIdUserMethod = LabelGrpc.getGetByIdUserMethod) == null) {
      synchronized (LabelGrpc.class) {
        if ((getGetByIdUserMethod = LabelGrpc.getGetByIdUserMethod) == null) {
          LabelGrpc.getGetByIdUserMethod = getGetByIdUserMethod =
              io.grpc.MethodDescriptor.<org.zoupi.interaction.GetLabelByIdUserReq, org.zoupi.interaction.GetLabelByIdUserRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetByIdUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.interaction.GetLabelByIdUserReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.zoupi.interaction.GetLabelByIdUserRes.getDefaultInstance()))
              .setSchemaDescriptor(new LabelMethodDescriptorSupplier("GetByIdUser"))
              .build();
        }
      }
    }
    return getGetByIdUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LabelStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelStub>() {
        @java.lang.Override
        public LabelStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelStub(channel, callOptions);
        }
      };
    return LabelStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LabelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelBlockingStub>() {
        @java.lang.Override
        public LabelBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelBlockingStub(channel, callOptions);
        }
      };
    return LabelBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LabelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LabelFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LabelFutureStub>() {
        @java.lang.Override
        public LabelFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LabelFutureStub(channel, callOptions);
        }
      };
    return LabelFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getByIdUser(org.zoupi.interaction.GetLabelByIdUserReq request,
        io.grpc.stub.StreamObserver<org.zoupi.interaction.GetLabelByIdUserRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByIdUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Label.
   */
  public static abstract class LabelImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LabelGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Label.
   */
  public static final class LabelStub
      extends io.grpc.stub.AbstractAsyncStub<LabelStub> {
    private LabelStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelStub(channel, callOptions);
    }

    /**
     */
    public void getByIdUser(org.zoupi.interaction.GetLabelByIdUserReq request,
        io.grpc.stub.StreamObserver<org.zoupi.interaction.GetLabelByIdUserRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByIdUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Label.
   */
  public static final class LabelBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LabelBlockingStub> {
    private LabelBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.zoupi.interaction.GetLabelByIdUserRes getByIdUser(org.zoupi.interaction.GetLabelByIdUserReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByIdUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Label.
   */
  public static final class LabelFutureStub
      extends io.grpc.stub.AbstractFutureStub<LabelFutureStub> {
    private LabelFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LabelFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LabelFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.zoupi.interaction.GetLabelByIdUserRes> getByIdUser(
        org.zoupi.interaction.GetLabelByIdUserReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByIdUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BY_ID_USER = 0;

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
        case METHODID_GET_BY_ID_USER:
          serviceImpl.getByIdUser((org.zoupi.interaction.GetLabelByIdUserReq) request,
              (io.grpc.stub.StreamObserver<org.zoupi.interaction.GetLabelByIdUserRes>) responseObserver);
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
          getGetByIdUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.zoupi.interaction.GetLabelByIdUserReq,
              org.zoupi.interaction.GetLabelByIdUserRes>(
                service, METHODID_GET_BY_ID_USER)))
        .build();
  }

  private static abstract class LabelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LabelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.zoupi.interaction.UserInteraction.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Label");
    }
  }

  private static final class LabelFileDescriptorSupplier
      extends LabelBaseDescriptorSupplier {
    LabelFileDescriptorSupplier() {}
  }

  private static final class LabelMethodDescriptorSupplier
      extends LabelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LabelMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LabelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LabelFileDescriptorSupplier())
              .addMethod(getGetByIdUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
