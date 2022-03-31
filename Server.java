	
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
	
public class Server extends FactoryImpl {
	
    public static void main(String args[]) {
		
		try {
			
			// creating a new server obj and stub
		    Server obj = new Server();
		    Factory stub = (Factory) UnicastRemoteObject.exportObject(obj, 0);

		    // Bind the remote object's stub in the registry
		    Registry registry = LocateRegistry.getRegistry();
		    registry.bind("Sorter", stub);

		    System.err.println("Server ready");

		} 

		catch (Exception e) {

		    System.err.println("Server exception: " + e.toString());
		    e.printStackTrace();
		    
		}
    }
}