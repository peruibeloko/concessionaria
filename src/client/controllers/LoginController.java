package client.controllers;

import client.Client;
import client.gui.Tela;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    public Button loginBtn;
    public TextField loginField;
    public PasswordField passField;

    public void login() throws IOException {
        String user = loginField.getText();

        boolean authorized = Client.server.login(user, passField.getText());

        if (authorized) {
            switch (user) {
                case "vendedor" -> Client.stageMgr.loadScene(Tela.Vendedor);
                case "mecanico" -> Client.stageMgr.loadScene(Tela.Mecanico);
                case "gerente" -> Client.stageMgr.loadScene(Tela.Gerente);
                default -> Client.stageMgr.loadScene(Tela.Login); // TODO erro!
            }
        } else {
            // error!
        }
    }
}
