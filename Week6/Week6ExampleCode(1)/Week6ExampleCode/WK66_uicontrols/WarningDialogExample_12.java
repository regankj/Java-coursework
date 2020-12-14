package WK66_uicontrols;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class WarningDialogExample_12 extends Application {

    public static void main(String [] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Warning Dialog Example");

        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning Dialog");
        alert.setHeaderText("This is a Warning Dialog");
        alert.setContentText("Be Careful out there!");

        alert.showAndWait();




    }

}