import java.rmi.Remote; 
import java.rmi.RemoteException;
import java.util.ArrayList;  

// Creating Remote interface for our application 
public interface Hello extends Remote {
//   void lookup(String productname, int hopcount) throws RemoteException;
//   void reply(int buyerId, int sellerId) throws RemoteException;
//   void printMsg() throws RemoteException;
//   void buy(int sellerId) throws RemoteException;
	void lookup_helper(String product_name, int hopcount, ArrayList<Integer> buyers) throws RemoteException;
	void reply_helper(ArrayList<Integer> trace_back_peers, int sellerId) throws RemoteException;
	boolean buy(int seller_id) throws RemoteException;
} 