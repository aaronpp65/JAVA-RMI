import java.rmi.RemoteException;

public class FactoryImpl implements Factory {

	@Override
	public Sorter createSorter() throws RemoteException {

		//returning a refrence of Sorter for each new client 
	    return new SorterImplementation();
	    
	}
}