package s12.CollectionsFramework.Deque;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

//A Deque is a double ended queue where elements can be 
//inserted or removed from either the front or end of the queue
public class App {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);

		for(Integer num : deque) {
			System.out.println(num);
		}
		
		deque.addFirst(0);//adding to the front
		deque.removeLast();//remove from the back
		System.out.println();
		for(Integer num : deque) {
			System.out.println(num);
		}
	}

}
