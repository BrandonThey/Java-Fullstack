package s17.FileHandling.FileWritingAndReading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		File newFile = new File("src/example.txt");
		
		//trying to open a new writer and if sucessfull then write to the file
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
				writer.write("Brandon \n");
				writer.write("Jason \n");
				writer.write("Paul \n");
				writer.write("Samantha \n");
				System.out.println("File write is completed");
		} catch(IOException e) {
			System.out.println("Error occured while writing to file");
		}
		
		//try catch with a buffered reader to read the contents of the file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(newFile));
			String tempLine;
			System.out.println();
			while((tempLine = reader.readLine()) != null) {
				System.out.println(tempLine);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File was not found");
		} catch(IOException e) {
			System.out.println("Error occured while reading from file");
		}

		System.out.println();
		//try catch with a scanner instead to read the contents of the file
		try {
			Scanner scanner = new Scanner(newFile);
			String line;
			while(scanner.hasNext()) {
				line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();
			
		} catch(FileNotFoundException e){
			System.out.println("Error finding the file");
		}
		
		/*the difference between Scanner and BufferedReader is that 
		a BufferedReader is synchronized and thus can be use in multithreaded
		applications. It also has a larger buffer and reads faster than a scanner.
		however a scanner parses data while a Reader only reads the characters
		*/
	}

}
