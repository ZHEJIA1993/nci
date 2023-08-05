import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;
public class GrpcServer {
	 public static void main(String[] args) throws IOException, InterruptedException {
	        int port = 8090;
	     // Register the services with jmDNS
	        registerWithJmDNS(port);
	        Server server = ServerBuilder.forPort(port)
	            .addService(new Entrance.EntranceControlImpl())
	            .addService(new buildingdata.BuildingDataCheckImpl())
	            .addService(new remote.RemoteControlServiceImpl())
	            .build()
	            .start();
	        
	        System.out.println("Server started, Port:" + port);
	        
	        server.awaitTermination();
	

	 }
	 private static void registerWithJmDNS(int port) {
	        try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	            // Register 3 services with 3 unique service types
	            registerService(jmdns, "EntranceControlService", "_entrancecontrol._tcp.local.", port);
	            registerService(jmdns, "BuildingDataCheckService", "_buildingdatacheck._tcp.local.", port);
	            registerService(jmdns, "RemoteControlService", "_remotecontrol._tcp.local.", port);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    private static void registerService(JmDNS jmdns, String serviceName, String serviceType, int port) {
	        ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, port, "grpc service");
	        try {
	            jmdns.registerService(serviceInfo);
	            System.out.println("Registered service: " + serviceName + " with type: " + serviceType);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
