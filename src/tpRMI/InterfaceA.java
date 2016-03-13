package tpRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceA extends Remote {

	public int pong(int n) throws RemoteException;
	public void top() throws RemoteException;
}
