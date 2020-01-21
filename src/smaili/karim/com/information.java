package smaili.karim.com;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface information extends Remote {
    public String getInformations() throws RemoteException;
}
