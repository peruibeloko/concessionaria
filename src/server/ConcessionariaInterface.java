package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConcessionariaInterface extends Remote {
    boolean login(String user, String pass) throws RemoteException;
}
