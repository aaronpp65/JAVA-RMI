import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Factory extends Remote {

    Sorter createSorter() throws RemoteException;

}
