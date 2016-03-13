package tpRMI;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class ProcessusB extends UnicastRemoteObject implements InterfaceB,Serializable {

	static int n=0;
	public ProcessusB()throws  RemoteException{
		
	super();
		
	}

	@Override
	public void signal(int n) throws RemoteException{
		System.out.println("Signal"+n);

	}

	public void top() throws RemoteException{
		System.out.println("top");
	}
	public static void main(String[] args) throws  RemoteException, MalformedURLException, AlreadyBoundException, NotBoundException, InterruptedException{
		if (System.getSecurityManager() == null) {
			 System.setSecurityManager(new SecurityManager());
		}	    
		
		String URLA="rmi://localhost:1099/A";
		InterfaceA A=(InterfaceA) Naming.lookup(URLA);
		    
		    while(true){
		      
			  
			 
			
		    }
	
	}

	@Override
	public int ping(int _n,InterfaceB B) throws RemoteException {
		
		 B.setN(_n);
		 System.out.println("ping"+(_n));
		
		return n;
		
	}

	public static int getN() {
		return n;
	}

	public void setN(int n) throws RemoteException{
		ProcessusB.n = n;
	}
	
}
