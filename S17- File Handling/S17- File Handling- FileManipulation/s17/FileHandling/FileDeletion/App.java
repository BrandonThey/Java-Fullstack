package s17.FileHandling.FileDeletion;

import java.io.File;

public class App {

	public static void main(String[] args) {
		//deleting the Hello World file we created before
		File file = new File("src/Example_Directory/Author/Brandon/HelloWorld.txt");
		
		if(file.delete()) {
			System.out.println("Deletion successful");
		}else {
			System.out.println("Error with deletion");
		}

	}

}
