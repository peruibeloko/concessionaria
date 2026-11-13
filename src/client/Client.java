package client;

import client.gui.StageManager;
import client.gui.Tela;
import javafx.application.Application;
import javafx.stage.Stage;
import server.ConcessionariaInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Application {

    public static ConcessionariaInterface server;
    public static StageManager stageMgr;
    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    public static void main() {
        Client.launch();
    }

    @Override
    public void start(Stage givenStage) throws Exception {
        LOGGER.info("Starting client");

        try {
            Registry reg = LocateRegistry.getRegistry(null, 2000);
            server = (ConcessionariaInterface) reg.lookup("ConcessionariaServer");
            LOGGER.info("Connected to server");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error connecting to server", e);
            System.exit(-1);
        }

        givenStage.setTitle("Concessionária");
        stageMgr = new StageManager(givenStage);
        stageMgr.loadScene(Tela.Login);
        givenStage.show();
    }
}