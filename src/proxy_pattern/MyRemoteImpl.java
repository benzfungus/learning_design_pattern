package proxy_pattern;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    private static final long serialVersionUID = 3629055941149956726L;
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello(){
        
        return "Server says, 'Hey'";
    }
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
