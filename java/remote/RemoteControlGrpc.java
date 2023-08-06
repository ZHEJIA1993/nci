package remote;

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
    comments = "Source: Service3.proto")
public final class RemoteControlGrpc {

  private RemoteControlGrpc() {}

  public static final String SERVICE_NAME = "RemoteControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<remote.Service3.HeatingSystemRequest,
      remote.Service3.ControlResponse> getHeatingSystemControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HeatingSystemControl",
      requestType = remote.Service3.HeatingSystemRequest.class,
      responseType = remote.Service3.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<remote.Service3.HeatingSystemRequest,
      remote.Service3.ControlResponse> getHeatingSystemControlMethod() {
    io.grpc.MethodDescriptor<remote.Service3.HeatingSystemRequest, remote.Service3.ControlResponse> getHeatingSystemControlMethod;
    if ((getHeatingSystemControlMethod = RemoteControlGrpc.getHeatingSystemControlMethod) == null) {
      synchronized (RemoteControlGrpc.class) {
        if ((getHeatingSystemControlMethod = RemoteControlGrpc.getHeatingSystemControlMethod) == null) {
          RemoteControlGrpc.getHeatingSystemControlMethod = getHeatingSystemControlMethod = 
              io.grpc.MethodDescriptor.<remote.Service3.HeatingSystemRequest, remote.Service3.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RemoteControl", "HeatingSystemControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  remote.Service3.HeatingSystemRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  remote.Service3.ControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RemoteControlMethodDescriptorSupplier("HeatingSystemControl"))
                  .build();
          }
        }
     }
     return getHeatingSystemControlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<remote.Service3.AirflowRateRequest,
      remote.Service3.ControlResponse> getAirflowRateControlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirflowRateControl",
      requestType = remote.Service3.AirflowRateRequest.class,
      responseType = remote.Service3.ControlResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<remote.Service3.AirflowRateRequest,
      remote.Service3.ControlResponse> getAirflowRateControlMethod() {
    io.grpc.MethodDescriptor<remote.Service3.AirflowRateRequest, remote.Service3.ControlResponse> getAirflowRateControlMethod;
    if ((getAirflowRateControlMethod = RemoteControlGrpc.getAirflowRateControlMethod) == null) {
      synchronized (RemoteControlGrpc.class) {
        if ((getAirflowRateControlMethod = RemoteControlGrpc.getAirflowRateControlMethod) == null) {
          RemoteControlGrpc.getAirflowRateControlMethod = getAirflowRateControlMethod = 
              io.grpc.MethodDescriptor.<remote.Service3.AirflowRateRequest, remote.Service3.ControlResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RemoteControl", "AirflowRateControl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  remote.Service3.AirflowRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  remote.Service3.ControlResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RemoteControlMethodDescriptorSupplier("AirflowRateControl"))
                  .build();
          }
        }
     }
     return getAirflowRateControlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RemoteControlStub newStub(io.grpc.Channel channel) {
    return new RemoteControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RemoteControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RemoteControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RemoteControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RemoteControlFutureStub(channel);
  }

  /**
   */
  public static abstract class RemoteControlImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<remote.Service3.HeatingSystemRequest> heatingSystemControl(
        io.grpc.stub.StreamObserver<remote.Service3.ControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getHeatingSystemControlMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<remote.Service3.AirflowRateRequest> airflowRateControl(
        io.grpc.stub.StreamObserver<remote.Service3.ControlResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAirflowRateControlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHeatingSystemControlMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                remote.Service3.HeatingSystemRequest,
                remote.Service3.ControlResponse>(
                  this, METHODID_HEATING_SYSTEM_CONTROL)))
          .addMethod(
            getAirflowRateControlMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                remote.Service3.AirflowRateRequest,
                remote.Service3.ControlResponse>(
                  this, METHODID_AIRFLOW_RATE_CONTROL)))
          .build();
    }
  }

  /**
   */
  public static final class RemoteControlStub extends io.grpc.stub.AbstractStub<RemoteControlStub> {
    private RemoteControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemoteControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemoteControlStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<remote.Service3.HeatingSystemRequest> heatingSystemControl(
        io.grpc.stub.StreamObserver<remote.Service3.ControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getHeatingSystemControlMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<remote.Service3.AirflowRateRequest> airflowRateControl(
        io.grpc.stub.StreamObserver<remote.Service3.ControlResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAirflowRateControlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RemoteControlBlockingStub extends io.grpc.stub.AbstractStub<RemoteControlBlockingStub> {
    private RemoteControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemoteControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemoteControlBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RemoteControlFutureStub extends io.grpc.stub.AbstractStub<RemoteControlFutureStub> {
    private RemoteControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RemoteControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RemoteControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RemoteControlFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_HEATING_SYSTEM_CONTROL = 0;
  private static final int METHODID_AIRFLOW_RATE_CONTROL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RemoteControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RemoteControlImplBase serviceImpl, int methodId) {
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
        case METHODID_HEATING_SYSTEM_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.heatingSystemControl(
              (io.grpc.stub.StreamObserver<remote.Service3.ControlResponse>) responseObserver);
        case METHODID_AIRFLOW_RATE_CONTROL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.airflowRateControl(
              (io.grpc.stub.StreamObserver<remote.Service3.ControlResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RemoteControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RemoteControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return remote.Service3.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RemoteControl");
    }
  }

  private static final class RemoteControlFileDescriptorSupplier
      extends RemoteControlBaseDescriptorSupplier {
    RemoteControlFileDescriptorSupplier() {}
  }

  private static final class RemoteControlMethodDescriptorSupplier
      extends RemoteControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RemoteControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (RemoteControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RemoteControlFileDescriptorSupplier())
              .addMethod(getHeatingSystemControlMethod())
              .addMethod(getAirflowRateControlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
