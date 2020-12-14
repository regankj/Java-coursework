package sample;

import javafx.fxml.FXML;
import javafx.scene.image.*;
import javafx.scene.image.Image;

import java.awt.*;

public class ImageController {

    @FXML

    private ImageView ImgView;

    @FXML
    private void initialize(){
        Image image = new Image(s:"");
        ImgView.setImage(image);
    }
}
