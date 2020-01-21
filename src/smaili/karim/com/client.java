package smaili.karim.com;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;

public class client {
    public static void main(String[] args) {
        //System.setSecurityManager(new RMISecurityManager());
        try {
            information stub = (information)Naming.lookup("rmi://localhost:1099/test");
            System.out.println(stub.getInformations());
        /*    Remote r = Naming.lookup("rmi://localhost:/TestRMI");
            if (r instanceof information) {
                String s = ((information) r).getInformations();
                System.out.println("chaine coming is = " + s);
            }

         */
        }
        catch (Exception e) {
        }
    }
}
