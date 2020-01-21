package smaili.karim.com;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args) {

        try {
            //System.setSecurityManager(new java.rmi.RMISecurityManager());
            LocateRegistry.createRegistry(1099);
            TestRmiServer testRMIServer = new TestRmiServer();
            Naming.rebind("rmi://localhost:1099/test",testRMIServer);
            System.out.println("lancememt du serveur");
            // while(true) { }
        } catch (Exception e) {
            System.out.println("Exception capturée: " + e.getMessage());
        }
    }
}
