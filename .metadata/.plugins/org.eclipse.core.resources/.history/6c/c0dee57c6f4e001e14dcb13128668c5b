package s17.FileHandling.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		try(FileInputStream input = new FileInputStream("src/vehicles.dat")){
			try(ObjectInputStream obj = new ObjectInputStream(input)){
				Vehicle vehicle1 = (Vehicle) obj.readObject();
				Vehicle vehicle2 = (Vehicle) obj.readObject();
				System.out.println("Vehicle 1: " + vehicle1);
				System.out.println("Vehicle 2: " + vehicle2);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
