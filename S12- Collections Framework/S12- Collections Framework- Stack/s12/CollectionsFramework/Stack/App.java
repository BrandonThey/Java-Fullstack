package s12.CollectionsFramework.Stack;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		Stack<Integer> demoNums = new Stack<>();
		
		//stack adding to the top of the stack method "push"
		demoNums.push(0);
		demoNums.push(1);
		demoNums.push(2);
		demoNums.push(3);
		demoNums.push(4);
		demoNums.push(5);
		
		//stack removing from the top of the stack method "pop"
		demoNums.pop();
		
		//stack look at top of stack but not remove
		System.out.println(demoNums.peek());
		for(Integer number: demoNums) {
			System.out.println(number);
		}
		
		
		//demoNums.search(value) searches for the value in the stack, returns a number boolean
		//demoNums.isEmpty() checks if the stack is empty or not
	}

}
