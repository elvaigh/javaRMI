package tpRMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Appli implements Remote{
	
	public static void main(String[] args) throws  RemoteException, MalformedURLException, AlreadyBoundException, NotBoundException, InterruptedException{
		LocateRegistry.createRegistry(1099); 
		String URL="rmi://localhost:1099/B";
		String URLA="rmi://localhost:1099/A";
		InterfaceA A=new ProcessusA();
		InterfaceB B=new ProcessusB();
		Naming.bind(URLA, A);
		Naming.bind(URL, B);
	}
}
