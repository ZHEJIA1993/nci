import java.io.IOException;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import Entrance.EntranceControlGrpc;
import buildingdata.BuildingDataCheckGrpc;
import remote.RemoteControlGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.application.Application;

public class GrpcClient {

	

    // entranceControlStub for making gRPC calls
    private static EntranceControlGrpc.EntranceControlStub entranceControlStub;
    private static BuildingDataCheckGrpc.BuildingDataCheckStub buildingDataCheckStub;
    private static RemoteControlGrpc.RemoteControlStub remoteControlStub;

    public static void main(String[] args) {
        // Discover services by jmDNS
        discoverServices();

        // Set up gRPC channels and stubs
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8090)
                .usePlaintext()
                .build();

            // Set up the gRPC stub
            entranceControlStub = EntranceControlGrpc.newStub(channel);
            buildingDataCheckStub = BuildingDataCheckGrpc.newStub(channel);
            remoteControlStub = RemoteControlGrpc.newStub(channel);
       
           

            // Run the GUI 
            MyGUI.setStubs(entranceControlStub, buildingDataCheckStub, remoteControlStub);
            Application.launch(MyGUI.class, args);
            
         
            
    }
    
    private static class Listener implements ServiceListener {
    	// it is the way to update the address and port of your gRPC server
    
        @Override
        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }

        @Override
        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }

        @Override
        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            
            
        }
    }
    public static void discoverServices() {
        try {
            // Create a new JmDNS instance
            JmDNS jmdns = JmDNS.create();

            // Add a service listener from above 
            jmdns.addServiceListener("_entrancecontrol._tcp.local.", new Listener());
            jmdns.addServiceListener("_buildingdatacheck._tcp.local.", new Listener());
            jmdns.addServiceListener("_remotecontrol._tcp.local.", new Listener());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   
    
    
    
}