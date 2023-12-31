package s16.LambdaExpressions.LambdaExpanded;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	private String name;

	public Data(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
}
public class App {

	public static void main(String[] args) {
		//creating a list of Data elements
		List<Data> list = new ArrayList<>();
		list.add(new Data("Brandon"));
		list.add(new Data("Jason"));
		list.add(new Data("Lauren"));
		list.add(new Data("Mia"));
		list.add(new Data("Eddy"));

		//sorting our list based on alphabetical
		//order on the names using a lambda expression
		Collections.sort(list, (Data obj1, Data obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		});
		for(Data data : list) {
			System.out.println(data.getName());
		}
		
		System.out.println();
		//sorting the list based on length of name using a lmabda expression
		Collections.sort(list,(Data obj1, Data obj2)->{
			if(obj1.getName().length() < obj2.getName().length()) {
				return -1;
			}
			else if(obj1.getName().length() > obj2.getName().length()){
				return 1;
			}
			else {
				return 0;
			}
		});
		for(Data data : list) {
			System.out.println(data.getName());
		}
	}

}
