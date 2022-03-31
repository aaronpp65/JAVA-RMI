
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;

public class SorterClient {

	private SorterClient() {}

	public static void performAction(Sorter stub, int _option, String query){
		
		// function name : performAction
        // args : stub (Sorter), _option (int), query (String)
        // return : void

		switch(_option){
			case 1: 
				try {
					stub.pushValue(Integer.parseInt(query));
					System.out.println("Pushed value "+ query);

				}
				catch (Exception e) {
					System.err.println("Client exception: " + e.toString());
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					stub.pushOperator(query);
					System.out.println("Completed operation "+ query);

				}
				catch (Exception e) {
					System.err.println("Client exception: " + e.toString());
					e.printStackTrace();
				}
				break;
			case 3:
				try {
					int popValue = stub.pop();
					System.out.println("Popped value "+ popValue);

				}
				catch (Exception e) {
					System.err.println("Client exception: " + e.toString());
					e.printStackTrace();
				}
				break;
			case 4:
				try {
					int responsepushValue = stub.delayPop(Integer.parseInt(query));
					System.out.println("Popped value "+ responsepushValue + "with a delay of " + query + " milliseconds");

				}
				catch (Exception e) {
					System.err.println("Client exception: " + e.toString());
					e.printStackTrace();
				}
				break;
			case 5:
				try {
					boolean isEmptyValue = stub.isEmpty();
					System.out.println("Stack empty "+ isEmptyValue);


				}
				catch (Exception e) {
					System.err.println("Client exception: " + e.toString());
					e.printStackTrace();
				}
				break;
			
		}

	}

	public static void main(String[] args) {

		String host = (args.length < 1) ? null : args[0];

		//reading file 
		File file = new File("input.txt");
		String st;
		try {

			BufferedReader br = new BufferedReader(new FileReader(file));

			Registry registry = LocateRegistry.getRegistry(host);
			// get stub
			Factory stub = (Factory) registry.lookup("Sorter");
			// get sorter object
			Sorter sorterStub = stub.createSorter();

			//getting line by line from i/p file
			while ((st = br.readLine()) != null){

				String[] words=st.split(" ");
				// calling different functions
				performAction(sorterStub, Integer.parseInt(words[0]), words[1]);


			}
		
		} 
		catch (Exception e) {

		System.err.println("Client exception: " + e.toString());
		e.printStackTrace();

		}

	}
}