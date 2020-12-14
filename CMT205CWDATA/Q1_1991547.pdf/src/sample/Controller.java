package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javafx.scene.image.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Controller {

    @FXML
    private Button startBtn;

    @FXML
    private Button downloadBtn;


    //function to enter the homepage of the app
    public void enterApp(MouseEvent mouseEvent) throws IOException {
        Stage secondStage = new Stage();
        secondStage.setTitle("Weather");
        secondStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("home.fxml")), 1000, 700));
        secondStage.show();
    }

    @FXML
    private void downloadFile() throws FileNotFoundException, UnsupportedEncodingException {
        txtFile.generateFile();
    }


}



