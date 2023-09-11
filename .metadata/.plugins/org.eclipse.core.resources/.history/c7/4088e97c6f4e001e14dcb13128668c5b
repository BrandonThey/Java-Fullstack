package s17.FileHandling.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("car", 4268);

		//try with resources block, where we put the resource we want to try and 
		//create into the try argument
		//the vehicles.dat file is not human readable but there will be a method to 
		//read and print it out as human readable
		try(FileOutputStream output = new FileOutputStream("src/vehicles.dat")){
			//the internal try block's exceptions can be handled by the external catches
			//a object output stream that is able to write the object's data
			//to the file
			
			//in order to write an object to a file however, we first need to serialize it
			//meaning we need to convert the objct into bytes that can be transfered
			//to the file
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
