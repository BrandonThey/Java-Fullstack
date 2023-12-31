package s17.FileHandling.CreatingFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		//creating a new file in the project
		//we can specify where we want the file ot be using a
		//file path
		File file = new File("src/example.txt");
		file.createNewFile();
		System.out.println("File created");

		//creating a new directory
		File directory = new File("src/Example_Directory");
		directory.mkdir();
		System.out.println("Directory Created");
		
		//making multiple directories
		File directories = new File("src/Example_Directory/Author/Brandon");
		directories.mkdirs();
		System.out.println("Directories Created");
		
		//creating a new file into the directory
		File newFile = new File("src/Example_Directory/Author/Brandon/HelloWorld.txt");
		newFile.createNewFile();
		System.out.println("New File Created");
	}

}
