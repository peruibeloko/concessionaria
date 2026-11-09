package servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements ConcessionariaInterface {

    public boolean start() {
        try {
            var server = new Server();
            var stub = (ConcessionariaInterface) UnicastRemoteObject.exportObject(server, 0);
            LocateRegistry.createRegistry(2000).bind("ConcessionariaServer", stub);
            return true;
        } catch (Exception e) {
            System.err.println("Server can't start: " + e.getMessage());
            System.exit(-1);
            return false;
        }
    }

    @Override
    public boolean login(String user, String pass) {
        // Verifica coisas
        return true;
    }
}
