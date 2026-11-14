package server;

import business.atores.Cliente;

import java.util.List;

public class ClienteService {
    ClienteRepository repo;

    public String cadastrarCliente(Cliente cliente) {
        return repo.create(cliente);
    }

    public List<Cliente> buscarCliente(String nome) {
        return List.of();
    }

    public boolean atualizarCliente(String id, Cliente cliente) {
        return false;
    }

    public boolean apagarCliente(String id) {
        return false;
    }
}
