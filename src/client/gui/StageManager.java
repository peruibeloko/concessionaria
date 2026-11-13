package client.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StageManager {
    private final Stage stage;

    public StageManager(Stage stage) {
        this.stage = stage;
    }

    public void loadScene(Tela tela) throws IOException {
        Parent root = FXMLLoader.load(tela.getScenePath());
        stage.setScene(new Scene(root));
    }
}
