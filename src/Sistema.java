import gui.Client;
import servidor.Server;

import java.io.IOException;
import java.util.List;

public class Sistema {
    static void main() throws IOException {
        var startRegistry = List.of("rmiregistry");
        new ProcessBuilder(startRegistry).start();

        var server = new Server();
        if (!server.start()) return;
        System.out.println("Server ready!");

        var client = new Client();
        client.openClient();
    }
}
