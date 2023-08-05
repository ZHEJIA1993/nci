package Entrance;



import Entrance.Service1.AccessResponse;
import Entrance.Service1.FacialRequest;
import Entrance.Service1.PasswordRequest;
import io.grpc.stub.StreamObserver;

public class EntranceControlImpl extends EntranceControlGrpc.EntranceControlImplBase {
    
    public StreamObserver<FacialRequest> facialRecognitionAccess(StreamObserver<AccessResponse> responseObserver) {
        return new StreamObserver<FacialRequest>() {
            String status = "access denied";
            //My idea is here should be a Client RPC, but in my program, it is very hard to check facial videos, so it is just a simple version
            //So here I assume the facial check is pass to continue next step. 
            @Override
            public void onNext(FacialRequest request) {
               // assume ID is 1234
                if ("1234".equals(request.getStudentID()) ) {
                    status = "access granted";
                }
            }

            @Override
            public void onError(Throwable t) {
                
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(AccessResponse.newBuilder().setStatus(status).build());
                responseObserver.onCompleted();
            }
        };
    }

    public StreamObserver<PasswordRequest> passwordInput(StreamObserver<AccessResponse> responseObserver) {
        return new StreamObserver<PasswordRequest>() {
            String status = "incorrect password";
            
            @Override
            public void onNext(PasswordRequest request) {
                // Validate room ID and password, they both should be correct, or incorrect password
            	//Assume room ID 101, password 123qwe
                if ("101".equals(request.getRoomID()) && "123qwe".equals(request.getPassword())) {
                    status = "access granted";
                }
            }
            // Stream need these 
            @Override
            public void onError(Throwable t) {
                // Handle errors
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(AccessResponse.newBuilder().setStatus(status).build());
                responseObserver.onCompleted();
            }
        };
    }

  
}
