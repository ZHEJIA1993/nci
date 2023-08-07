import Entrance.EntranceControlGrpc;
import buildingdata.BuildingDataCheckGrpc;
import io.grpc.stub.StreamObserver;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import remote.RemoteControlGrpc;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import Entrance.Service1.FacialRequest;
import Entrance.Service1.PasswordRequest;
import Entrance.Service1.AccessResponse;
//
public class MyGUI extends Application {

    private static EntranceControlGrpc.EntranceControlStub entranceControlStub;
    private static BuildingDataCheckGrpc.BuildingDataCheckStub buildingDataCheckStub;
    private static RemoteControlGrpc.RemoteControlStub remoteControlStub;

    public MyGUI() {
   
}
    //setter
    public static void setStubs(EntranceControlGrpc.EntranceControlStub entranceControlStub, 
            BuildingDataCheckGrpc.BuildingDataCheckStub buildingDataCheckStub, 
            RemoteControlGrpc.RemoteControlStub remoteControlStub) {
			MyGUI.entranceControlStub = entranceControlStub;
			MyGUI.buildingDataCheckStub = buildingDataCheckStub;
			MyGUI.remoteControlStub = remoteControlStub;
			}

    // a simple one learns from online
    public void start(Stage primaryStage) {
        
        // Entrance Service
        TextField entranceInput = new TextField();
        entranceInput.setPromptText("Enter Student ID");
        Button entranceButton = new Button("Entrance");
        TextArea entranceOutput = new TextArea();
        entranceButton.setOnAction(event -> {
            String input = entranceInput.getText();
            String response = "Student ID received: " + input;
            entranceOutput.setText(response);
        });

        // BuildingDataCheck Service
        TextField buildingDataCheckInput = new TextField();
        buildingDataCheckInput.setPromptText("Enter room ID");
        Button buildingDataCheckButton = new Button("BuildingDataCheck");
        TextArea buildingDataCheckOutput = new TextArea();
        buildingDataCheckButton.setOnAction(event -> {
            String input = buildingDataCheckInput.getText();
            String response = "Room ID received: " + input;
            buildingDataCheckOutput.setText(response);
        });

        // RemoteControl Service
        TextField remoteControlInput = new TextField();
        remoteControlInput.setPromptText("Enter Room ID");
        Button remoteControlButton = new Button("RemoteControl");
        TextArea remoteControlOutput = new TextArea();
        remoteControlButton.setOnAction(event -> {
            String input = remoteControlInput.getText();
            String response = "Room ID received: " + input;
            remoteControlOutput.setText(response);
        });

        VBox vbox = new VBox(
            entranceInput, entranceButton, entranceOutput, 
            buildingDataCheckInput, buildingDataCheckButton, buildingDataCheckOutput, 
            remoteControlInput, remoteControlButton, remoteControlOutput
        );

        vbox.setSpacing(10);  

        Scene scene = new Scene(vbox, 400, 500); 
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
    


    
    

