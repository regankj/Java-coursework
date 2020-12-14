package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;


    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("My Playground App");
        // set up and show the root FXML file
        initRootLayout();
        // set up and show the simpleGui FXML file
        showSimpleGui();
    }

    public void initRootLayout(){
      try {
          FXMLLoader loader = new FXMLLoader();
          loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
          rootLayout = (BorderPane) loader.load();

          // show the scene containing the root layout
          Scene scene = new Scene(rootLayout);
          primaryStage.setScene(scene);
          primaryStage.show();
      } catch ( IOException e ) {
        e.printStackTrace();
      }
    }

    public void showSimpleGui(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("SimpleGui.fxml"));
            AnchorPane GuiOverview = (AnchorPane) loader.load();

            rootLayout.setCenter(GuiOverview);

        } catch ( IOException e ) {
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {
        launch(args);
    }

}
