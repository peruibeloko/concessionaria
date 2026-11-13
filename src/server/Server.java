package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server implements ConcessionariaInterface {

    private static final Logger LOGGER = Logger.getLogger(Server.class.getName());

    public static void main() {
        LOGGER.info("Server startup");

        var startRegistry = List.of("rmiregistry");

        try {
            LOGGER.info("Starting RMI registry");
            new ProcessBuilder(startRegistry).start();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "RMI registry start failed", e);
            System.exit(-1);
        }

        var server = new Server();

        try {
            var stub = (ConcessionariaInterface) UnicastRemoteObject.exportObject(server, 0);
            LOGGER.info("Binding to port 2000");
            LocateRegistry.createRegistry(2000).bind("ConcessionariaServer", stub);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Server start failed", e);
            System.exit(-1);
        }
    }

    public boolean login(String user, String pass) {
        // TODO consultar no banco
        return true;
    }
}
