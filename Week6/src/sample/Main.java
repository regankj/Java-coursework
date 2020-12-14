package sample;

import java.io.FileInputStream;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Vbox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        String fxmlDocPath = "Path-To-YourFXML-file/FxFXMLExample1.fxml";
        FileInputStream fxmlStream = new FileInputStream(fxmlDocPath);

        VBox root = (VBox) loader.load(fxmlStream);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("A simple FXML Example");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
