package gui.controllers;

import gui.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    public Button loginBtn;
    public TextField loginField;
    public PasswordField passField;

    public void login() throws IOException {
        boolean authorized = Client.server.login(loginField.getText(), passField.getText());
        if (authorized) {
            Parent root = FXMLLoader.load(getClass().getResource("../scenes/Main.fxml"));
            Client.stage.setScene(new Scene(root, 600, 400));
        } else {
            // error!
        }
    }
}
