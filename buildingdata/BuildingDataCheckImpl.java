package buildingdata;

import buildingdata.Service2.AirQualityRequest;
import buildingdata.Service2.AirQualityResponse;
import buildingdata.Service2.PeopleCountRequest;
import buildingdata.Service2.PeopleCountResponse;
import buildingdata.Service2.SmokeAlarmRequest;
import buildingdata.Service2.SmokeAlarmResponse;
import io.grpc.stub.StreamObserver;

public class BuildingDataCheckImpl extends BuildingDataCheckGrpc.BuildingDataCheckImplBase {

    public void checkPeopleCount(PeopleCountRequest request, StreamObserver<PeopleCountResponse> responseObserver) {
        // Assume the building names A, we have random people for simulate the real scenario .
        PeopleCountResponse response = PeopleCountResponse.newBuilder()
                .setBuildingName("A")
                .setCurrentPeopleNumber((int)(Math.random() * 10))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void checkAirQuality(AirQualityRequest request, StreamObserver<AirQualityResponse> responseObserver) {
        // random index for air quality (1-100) higher means better quality.
        AirQualityResponse response = AirQualityResponse.newBuilder()
                .setAirQualityIndex((int)(Math.random() * 100))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void smokeAlarm(SmokeAlarmRequest request, StreamObserver<SmokeAlarmResponse> responseObserver) {
        // We check it every 5 seconds for 3 times
    	//It is a server streaming RPC
        for (int i = 0; i < 3; i++) {
            boolean isSmokeDetected = Math.random() > 0.95;
            
            SmokeAlarmResponse response = SmokeAlarmResponse.newBuilder()
                    .setStatus(isSmokeDetected ? "smoke detected" : "no smoke")
                    .build();

            responseObserver.onNext(response);
            
            try {
                Thread.sleep(5000);  // detect smoke every 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        responseObserver.onCompleted();
    }
}