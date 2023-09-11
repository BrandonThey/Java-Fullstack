package s11.Arrays;

//practicing arrays and their methods
public class App {

	public static void main(String[] args) {
		int[] intArray = new int[10]; //new integer array of size 10 elements
		intArray[5] = 10; //element 5 assigned value 10
		System.out.println(intArray[5]);
		
		String[] stringArray = {"Brandon", "John", "Salem", "Mia", "Lauren"};
		//looping over the array
		for(int i = 0; i < stringArray.length; i++){
			System.out.print(stringArray[i] + " ");
		}
		
		System.out.println();
		//enhanced for loop over the array
		for(String name: stringArray) {
			System.out.print(name + " ");
		}
	}

}
