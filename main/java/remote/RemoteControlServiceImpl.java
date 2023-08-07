package remote;

import io.grpc.stub.StreamObserver;
import remote.Service3.AirflowRateRequest;
import remote.Service3.ControlResponse;
import remote.Service3.HeatingSystemRequest;

public class RemoteControlServiceImpl extends RemoteControlGrpc.RemoteControlImplBase {

    public StreamObserver<HeatingSystemRequest> heatingSystemControl(StreamObserver<ControlResponse> responseObserver) {
        return new StreamObserver<HeatingSystemRequest>() {

            @Override
            public void onNext(HeatingSystemRequest request) {
                // You can set your required temperature 
                // After setting you can receive the current temperature
            	//It is bidirectional communication
                
                float currentTemperature = 28;
                ControlResponse response = ControlResponse.newBuilder()
                    .setStatus("Success")
                    .setCurrentValue(currentTemperature)
                    .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                // Handle any error gracefully here
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<AirflowRateRequest> airflowRateControl(StreamObserver<ControlResponse> responseObserver) {
        return new StreamObserver<AirflowRateRequest>() {

            @Override
            public void onNext(AirflowRateRequest request) {
                //Same as above method
                
                float currentAirflowRate = 1;
                ControlResponse response = ControlResponse.newBuilder()
                    .setStatus("Success")
                    .setCurrentValue(currentAirflowRate)
                    .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {
                
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}