package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Window;


public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField pfPassword;

    @FXML
    private Button btnSubmit;

    @FXML
    protected void handleSubmit(ActionEvent event){
        Window owner = btnSubmit.getScene().getWindow();
        if(txtUsername.getText().isEmpty()){
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your username");
            return;
        }
        if(pfPassword.getText().isEmpty()){
            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", "Please enter your password");
            return;
        }

        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Login Successful!", "Welcome " + txtUsername.getText());
    }
}
