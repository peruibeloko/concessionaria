package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import servidor.ConcessionariaInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// TODO permissionamento
// TODO enum de scenes
// TODO método de troca de cena baseado em switch + enum

public class Client extends Application {

    public static ConcessionariaInterface server;
    public static Stage stage; // TODO trocar public access por um método

    public void openClient() {
        launch();
    }

    @Override
    public void start(Stage givenStage) throws Exception {

        try {
            Registry reg = LocateRegistry.getRegistry(null, 2000);
            server = (ConcessionariaInterface) reg.lookup("ConcessionariaServer");
            System.out.println("Connected successfully: " + server.toString());
        } catch (Exception e) {
            System.err.println("Error connecting to server:  " + e.getMessage());
            System.exit(-1);
        }

        stage = givenStage;
        Parent root = FXMLLoader.load(getClass().getResource("scenes/Login.fxml"));
        var scene = new Scene(root, 600, 400);
        stage.setTitle("Concessionária");
        stage.setScene(scene);
        stage.show();
    }
}