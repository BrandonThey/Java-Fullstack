package s12.CollectionsFramework.Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

//queues are first in first out 
public class App {

	public static void main(String[] args) {
		//a linked blocking queue blocks out null values
		Queue<Integer> queue = new LinkedBlockingQueue<Integer>(6); //size of queue is 6
		
		//when adding or removing from any data structure we should use a try catch
		//to prevent overfilling errors or no such element errors
		
		try {
			queue.remove();
		}catch(NoSuchElementException e){
			System.out.println("Queue is empty");
		}
		
		try {
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
		} catch(IllegalStateException e){
			System.out.println("queue is full");
		}
		
		//here we see only 6 elements were added before the exception was caught
		//we can avoid this using the queue.offer and queue.poll methods, 
		//where it will add/remove if possible
		if(queue.offer(8)) {
			System.out.println("Element was added");
		}
		else{
			System.out.println("Queue is full");
		}
		
		if(queue.poll() != null) {
			System.out.println("Element was removed");
		}
		else{
			System.out.println("Queue is empty");
		}
		for(Integer element : queue) {
			System.out.println(element);
		}
	}

}
