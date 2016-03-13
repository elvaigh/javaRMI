package tpRMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceB extends Remote {

	public void signal(int n) throws RemoteException;
	public void top() throws RemoteException;
	public int  ping(int n,InterfaceB B) throws RemoteException;
	public void setN(int n)throws RemoteException ;
}
