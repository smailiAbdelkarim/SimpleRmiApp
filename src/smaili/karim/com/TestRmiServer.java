package smaili.karim.com;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLOutput;

public class TestRmiServer extends UnicastRemoteObject implements  information {
    protected TestRmiServer() throws RemoteException {
        super();
    }

    @Override
    public String getInformations() throws RemoteException {
        return "smaili abdelkarim";
    }

    }


