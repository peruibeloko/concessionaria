package client.gui;

import java.net.URL;

public enum Tela {
    Login(Tela.class.getResource("/client/scenes/Login.fxml")),
    Gerente(Tela.class.getResource("/client/scenes/Gerente.fxml")),
    Vendedor(Tela.class.getResource("/client/scenes/Vendedor.fxml")),
    Mecanico(Tela.class.getResource("/client/scenes/Mecanico.fxml"));

    private final URL scenePath;

    Tela(URL scenePath) {
        this.scenePath = scenePath;
    }

    public URL getScenePath() {
        return scenePath;
    }
}
