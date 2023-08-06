package buildingdata;

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
    comments = "Source: Service2.proto")
public final class BuildingDataCheckGrpc {

  private BuildingDataCheckGrpc() {}

  public static final String SERVICE_NAME = "BuildingDataCheck";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<buildingdata.Service2.PeopleCountRequest,
      buildingdata.Service2.PeopleCountResponse> getCheckPeopleCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPeopleCount",
      requestType = buildingdata.Service2.PeopleCountRequest.class,
      responseType = buildingdata.Service2.PeopleCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<buildingdata.Service2.PeopleCountRequest,
      buildingdata.Service2.PeopleCountResponse> getCheckPeopleCountMethod() {
    io.grpc.MethodDescriptor<buildingdata.Service2.PeopleCountRequest, buildingdata.Service2.PeopleCountResponse> getCheckPeopleCountMethod;
    if ((getCheckPeopleCountMethod = BuildingDataCheckGrpc.getCheckPeopleCountMethod) == null) {
      synchronized (BuildingDataCheckGrpc.class) {
        if ((getCheckPeopleCountMethod = BuildingDataCheckGrpc.getCheckPeopleCountMethod) == null) {
          BuildingDataCheckGrpc.getCheckPeopleCountMethod = getCheckPeopleCountMethod = 
              io.grpc.MethodDescriptor.<buildingdata.Service2.PeopleCountRequest, buildingdata.Service2.PeopleCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BuildingDataCheck", "CheckPeopleCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.PeopleCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.PeopleCountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingDataCheckMethodDescriptorSupplier("CheckPeopleCount"))
                  .build();
          }
        }
     }
     return getCheckPeopleCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<buildingdata.Service2.AirQualityRequest,
      buildingdata.Service2.AirQualityResponse> getCheckAirQualityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckAirQuality",
      requestType = buildingdata.Service2.AirQualityRequest.class,
      responseType = buildingdata.Service2.AirQualityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<buildingdata.Service2.AirQualityRequest,
      buildingdata.Service2.AirQualityResponse> getCheckAirQualityMethod() {
    io.grpc.MethodDescriptor<buildingdata.Service2.AirQualityRequest, buildingdata.Service2.AirQualityResponse> getCheckAirQualityMethod;
    if ((getCheckAirQualityMethod = BuildingDataCheckGrpc.getCheckAirQualityMethod) == null) {
      synchronized (BuildingDataCheckGrpc.class) {
        if ((getCheckAirQualityMethod = BuildingDataCheckGrpc.getCheckAirQualityMethod) == null) {
          BuildingDataCheckGrpc.getCheckAirQualityMethod = getCheckAirQualityMethod = 
              io.grpc.MethodDescriptor.<buildingdata.Service2.AirQualityRequest, buildingdata.Service2.AirQualityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BuildingDataCheck", "CheckAirQuality"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.AirQualityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.AirQualityResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingDataCheckMethodDescriptorSupplier("CheckAirQuality"))
                  .build();
          }
        }
     }
     return getCheckAirQualityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<buildingdata.Service2.SmokeAlarmRequest,
      buildingdata.Service2.SmokeAlarmResponse> getSmokeAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SmokeAlarm",
      requestType = buildingdata.Service2.SmokeAlarmRequest.class,
      responseType = buildingdata.Service2.SmokeAlarmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<buildingdata.Service2.SmokeAlarmRequest,
      buildingdata.Service2.SmokeAlarmResponse> getSmokeAlarmMethod() {
    io.grpc.MethodDescriptor<buildingdata.Service2.SmokeAlarmRequest, buildingdata.Service2.SmokeAlarmResponse> getSmokeAlarmMethod;
    if ((getSmokeAlarmMethod = BuildingDataCheckGrpc.getSmokeAlarmMethod) == null) {
      synchronized (BuildingDataCheckGrpc.class) {
        if ((getSmokeAlarmMethod = BuildingDataCheckGrpc.getSmokeAlarmMethod) == null) {
          BuildingDataCheckGrpc.getSmokeAlarmMethod = getSmokeAlarmMethod = 
              io.grpc.MethodDescriptor.<buildingdata.Service2.SmokeAlarmRequest, buildingdata.Service2.SmokeAlarmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BuildingDataCheck", "SmokeAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.SmokeAlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  buildingdata.Service2.SmokeAlarmResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BuildingDataCheckMethodDescriptorSupplier("SmokeAlarm"))
                  .build();
          }
        }
     }
     return getSmokeAlarmMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BuildingDataCheckStub newStub(io.grpc.Channel channel) {
    return new BuildingDataCheckStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BuildingDataCheckBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BuildingDataCheckBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BuildingDataCheckFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BuildingDataCheckFutureStub(channel);
  }

  /**
   */
  public static abstract class BuildingDataCheckImplBase implements io.grpc.BindableService {

    /**
     */
    public void checkPeopleCount(buildingdata.Service2.PeopleCountRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.PeopleCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckPeopleCountMethod(), responseObserver);
    }

    /**
     */
    public void checkAirQuality(buildingdata.Service2.AirQualityRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.AirQualityResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckAirQualityMethod(), responseObserver);
    }

    /**
     */
    public void smokeAlarm(buildingdata.Service2.SmokeAlarmRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.SmokeAlarmResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSmokeAlarmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckPeopleCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                buildingdata.Service2.PeopleCountRequest,
                buildingdata.Service2.PeopleCountResponse>(
                  this, METHODID_CHECK_PEOPLE_COUNT)))
          .addMethod(
            getCheckAirQualityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                buildingdata.Service2.AirQualityRequest,
                buildingdata.Service2.AirQualityResponse>(
                  this, METHODID_CHECK_AIR_QUALITY)))
          .addMethod(
            getSmokeAlarmMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                buildingdata.Service2.SmokeAlarmRequest,
                buildingdata.Service2.SmokeAlarmResponse>(
                  this, METHODID_SMOKE_ALARM)))
          .build();
    }
  }

  /**
   */
  public static final class BuildingDataCheckStub extends io.grpc.stub.AbstractStub<BuildingDataCheckStub> {
    private BuildingDataCheckStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingDataCheckStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingDataCheckStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingDataCheckStub(channel, callOptions);
    }

    /**
     */
    public void checkPeopleCount(buildingdata.Service2.PeopleCountRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.PeopleCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckPeopleCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkAirQuality(buildingdata.Service2.AirQualityRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.AirQualityResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckAirQualityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void smokeAlarm(buildingdata.Service2.SmokeAlarmRequest request,
        io.grpc.stub.StreamObserver<buildingdata.Service2.SmokeAlarmResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSmokeAlarmMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BuildingDataCheckBlockingStub extends io.grpc.stub.AbstractStub<BuildingDataCheckBlockingStub> {
    private BuildingDataCheckBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingDataCheckBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingDataCheckBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingDataCheckBlockingStub(channel, callOptions);
    }

    /**
     */
    public buildingdata.Service2.PeopleCountResponse checkPeopleCount(buildingdata.Service2.PeopleCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckPeopleCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public buildingdata.Service2.AirQualityResponse checkAirQuality(buildingdata.Service2.AirQualityRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckAirQualityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<buildingdata.Service2.SmokeAlarmResponse> smokeAlarm(
        buildingdata.Service2.SmokeAlarmRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSmokeAlarmMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BuildingDataCheckFutureStub extends io.grpc.stub.AbstractStub<BuildingDataCheckFutureStub> {
    private BuildingDataCheckFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BuildingDataCheckFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BuildingDataCheckFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BuildingDataCheckFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<buildingdata.Service2.PeopleCountResponse> checkPeopleCount(
        buildingdata.Service2.PeopleCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckPeopleCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<buildingdata.Service2.AirQualityResponse> checkAirQuality(
        buildingdata.Service2.AirQualityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckAirQualityMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK_PEOPLE_COUNT = 0;
  private static final int METHODID_CHECK_AIR_QUALITY = 1;
  private static final int METHODID_SMOKE_ALARM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BuildingDataCheckImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BuildingDataCheckImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_PEOPLE_COUNT:
          serviceImpl.checkPeopleCount((buildingdata.Service2.PeopleCountRequest) request,
              (io.grpc.stub.StreamObserver<buildingdata.Service2.PeopleCountResponse>) responseObserver);
          break;
        case METHODID_CHECK_AIR_QUALITY:
          serviceImpl.checkAirQuality((buildingdata.Service2.AirQualityRequest) request,
              (io.grpc.stub.StreamObserver<buildingdata.Service2.AirQualityResponse>) responseObserver);
          break;
        case METHODID_SMOKE_ALARM:
          serviceImpl.smokeAlarm((buildingdata.Service2.SmokeAlarmRequest) request,
              (io.grpc.stub.StreamObserver<buildingdata.Service2.SmokeAlarmResponse>) responseObserver);
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

  private static abstract class BuildingDataCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BuildingDataCheckBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return buildingdata.Service2.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BuildingDataCheck");
    }
  }

  private static final class BuildingDataCheckFileDescriptorSupplier
      extends BuildingDataCheckBaseDescriptorSupplier {
    BuildingDataCheckFileDescriptorSupplier() {}
  }

  private static final class BuildingDataCheckMethodDescriptorSupplier
      extends BuildingDataCheckBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BuildingDataCheckMethodDescriptorSupplier(String methodName) {
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
      synchronized (BuildingDataCheckGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BuildingDataCheckFileDescriptorSupplier())
              .addMethod(getCheckPeopleCountMethod())
              .addMethod(getCheckAirQualityMethod())
              .addMethod(getSmokeAlarmMethod())
              .build();
        }
      }
    }
    return result;
  }
}
