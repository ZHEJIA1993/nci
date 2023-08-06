package Entrance;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service1.proto")
public final class EntranceControlGrpc {

  private EntranceControlGrpc() {}

  public static final String SERVICE_NAME = "EntranceControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Entrance.Service1.FacialRequest,
      Entrance.Service1.AccessResponse> getFacialRecognitionAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FacialRecognitionAccess",
      requestType = Entrance.Service1.FacialRequest.class,
      responseType = Entrance.Service1.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Entrance.Service1.FacialRequest,
      Entrance.Service1.AccessResponse> getFacialRecognitionAccessMethod() {
    io.grpc.MethodDescriptor<Entrance.Service1.FacialRequest, Entrance.Service1.AccessResponse> getFacialRecognitionAccessMethod;
    if ((getFacialRecognitionAccessMethod = EntranceControlGrpc.getFacialRecognitionAccessMethod) == null) {
      synchronized (EntranceControlGrpc.class) {
        if ((getFacialRecognitionAccessMethod = EntranceControlGrpc.getFacialRecognitionAccessMethod) == null) {
          EntranceControlGrpc.getFacialRecognitionAccessMethod = getFacialRecognitionAccessMethod = 
              io.grpc.MethodDescriptor.<Entrance.Service1.FacialRequest, Entrance.Service1.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EntranceControl", "FacialRecognitionAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Entrance.Service1.FacialRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Entrance.Service1.AccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EntranceControlMethodDescriptorSupplier("FacialRecognitionAccess"))
                  .build();
          }
        }
     }
     return getFacialRecognitionAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Entrance.Service1.PasswordRequest,
      Entrance.Service1.AccessResponse> getPasswordInputMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordInput",
      requestType = Entrance.Service1.PasswordRequest.class,
      responseType = Entrance.Service1.AccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<Entrance.Service1.PasswordRequest,
      Entrance.Service1.AccessResponse> getPasswordInputMethod() {
    io.grpc.MethodDescriptor<Entrance.Service1.PasswordRequest, Entrance.Service1.AccessResponse> getPasswordInputMethod;
    if ((getPasswordInputMethod = EntranceControlGrpc.getPasswordInputMethod) == null) {
      synchronized (EntranceControlGrpc.class) {
        if ((getPasswordInputMethod = EntranceControlGrpc.getPasswordInputMethod) == null) {
          EntranceControlGrpc.getPasswordInputMethod = getPasswordInputMethod = 
              io.grpc.MethodDescriptor.<Entrance.Service1.PasswordRequest, Entrance.Service1.AccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "EntranceControl", "PasswordInput"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Entrance.Service1.PasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Entrance.Service1.AccessResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EntranceControlMethodDescriptorSupplier("PasswordInput"))
                  .build();
          }
        }
     }
     return getPasswordInputMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EntranceControlStub newStub(io.grpc.Channel channel) {
    return new EntranceControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EntranceControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EntranceControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EntranceControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EntranceControlFutureStub(channel);
  }

  /**
   */
  public static abstract class EntranceControlImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<Entrance.Service1.FacialRequest> facialRecognitionAccess(
        io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFacialRecognitionAccessMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Entrance.Service1.PasswordRequest> passwordInput(
        io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPasswordInputMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFacialRecognitionAccessMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Entrance.Service1.FacialRequest,
                Entrance.Service1.AccessResponse>(
                  this, METHODID_FACIAL_RECOGNITION_ACCESS)))
          .addMethod(
            getPasswordInputMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                Entrance.Service1.PasswordRequest,
                Entrance.Service1.AccessResponse>(
                  this, METHODID_PASSWORD_INPUT)))
          .build();
    }
  }

  /**
   */
  public static final class EntranceControlStub extends io.grpc.stub.AbstractStub<EntranceControlStub> {
    private EntranceControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntranceControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntranceControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntranceControlStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Entrance.Service1.FacialRequest> facialRecognitionAccess(
        io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getFacialRecognitionAccessMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<Entrance.Service1.PasswordRequest> passwordInput(
        io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPasswordInputMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EntranceControlBlockingStub extends io.grpc.stub.AbstractStub<EntranceControlBlockingStub> {
    private EntranceControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntranceControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntranceControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntranceControlBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class EntranceControlFutureStub extends io.grpc.stub.AbstractStub<EntranceControlFutureStub> {
    private EntranceControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EntranceControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EntranceControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EntranceControlFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FACIAL_RECOGNITION_ACCESS = 0;
  private static final int METHODID_PASSWORD_INPUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EntranceControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EntranceControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FACIAL_RECOGNITION_ACCESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.facialRecognitionAccess(
              (io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse>) responseObserver);
        case METHODID_PASSWORD_INPUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.passwordInput(
              (io.grpc.stub.StreamObserver<Entrance.Service1.AccessResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EntranceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EntranceControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Entrance.Service1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EntranceControl");
    }
  }

  private static final class EntranceControlFileDescriptorSupplier
      extends EntranceControlBaseDescriptorSupplier {
    EntranceControlFileDescriptorSupplier() {}
  }

  private static final class EntranceControlMethodDescriptorSupplier
      extends EntranceControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EntranceControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (EntranceControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EntranceControlFileDescriptorSupplier())
              .addMethod(getFacialRecognitionAccessMethod())
              .addMethod(getPasswordInputMethod())
              .build();
        }
      }
    }
    return result;
  }
}
