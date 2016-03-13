package tpRMI;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ProcessusA extends UnicastRemoteObject implements InterfaceA{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static int n=5;
	public ProcessusA() throws RemoteException {
		if (System.getSecurityManager() == null) {
			 System.setSecurityManager(new SecurityManager());
		}
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException, AlreadyBoundException, InterruptedException {
	
		String URL="rmi://localhost:1099/B";
		InterfaceB B=(InterfaceB) Naming.lookup(URL);
		while(true){
			
			B.ping(n,B);
			
		}
	}

	@Override
	public int pong(int n) throws RemoteException {
		 ProcessusA.setN(n);
		 System.out.println("pong"+(n));
		return n;
		
	}

	@Override
	public void top() throws RemoteException {
		
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		ProcessusA.n = n;
	}
	
}
