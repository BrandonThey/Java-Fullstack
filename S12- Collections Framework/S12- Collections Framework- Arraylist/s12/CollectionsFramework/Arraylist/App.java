package s12.CollectionsFramework.Arraylist;

import java.util.ArrayList;

public class App {
	static ArrayList<String> ListNames = new ArrayList<>();
	
	public static void main(String[] args) {
		ListNames.add("Brandon"); //adding to list
		ListNames.add("John");
		ListNames.add("Mia");
		ListNames.add("Steve");
		ListNames.add("Lauren");
		ListNames.add("Jackson");
		
		App app = new App();
		app.displayNames(ListNames);
		app.removeNameByIndex(ListNames, 0);
		
		System.out.println();
		app.displayNames(ListNames);
		app.removeNameByValue(ListNames, "Jackson");
		
		System.out.println();
		app.displayNames(ListNames);
		app.modifyName(ListNames, 3, "Emma");
		
		System.out.println();
		app.displayNames(ListNames);
		
		int position = app.searchName(ListNames, "Emma");
		if(position != -1) {
			app.modifyName(ListNames, position, "Gemma");
			System.out.println();
			app.displayNames(ListNames);
		}
		else {
			System.out.println("Invalid name");
		}
	}
	
	void displayNames(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	void removeNameByIndex(ArrayList<String> names, int index) {
		names.remove(index);
	}
	
	void removeNameByValue(ArrayList<String> names, String name) {
		names.remove(name);
	}
	
	void modifyName(ArrayList<String> names, int index,  String newName) {
		names.set(index, newName);
	}
	
	int searchName(ArrayList<String> names, String name) {
		return names.indexOf(name);
	}
}
