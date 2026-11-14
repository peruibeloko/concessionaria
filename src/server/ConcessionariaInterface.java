package server;

import business.atores.Cliente;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ConcessionariaInterface extends Remote {
    boolean login(String user, String pass) throws RemoteException;

    String cadastrarCliente(Cliente cliente);
    List<Cliente> buscarCliente(String nome);
    boolean atualizarCliente(String id, Cliente cliente);
    boolean apagarCliente(String id);
}
