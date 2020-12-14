package WK66_uicontrols;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ErrorDialogExample_13 extends Application {

    public static void main(String [] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Error Dialog Example");

        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error Dialog");
        alert.setHeaderText("This is an Error Dialog");
        alert.setContentText("Some kind of mistake eh?");

        alert.showAndWait();




    }

}