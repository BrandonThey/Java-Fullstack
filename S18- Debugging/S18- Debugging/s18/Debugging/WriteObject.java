package s18.Debugging;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("car", 4268);
		try(FileOutputStream output = new FileOutputStream("src/vehicles.dat")){
			try(ObjectOutputStream obj = new ObjectOutputStream(output)){
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Objects have been writen to file");
			}
		} catch(FileNotFoundException e){
			System.out.println("File Not Found Exception");
		} catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error reading the file");
		}
	}

}
