package s15.Multithreading.Synchronization.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

//A blocking queue is a queue and a thread safe collection, meaning that they are able
//to handle multithreaded applications, we will use producer and consumer 
//example
class Producer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;

	@Override
	public void run() {
		//infinite while loop that constantly adds to the queue when possible
		while(true) {
			try {
				Thread.sleep(500);
				//whenever the queue is full it will stop the thread from adding more
				queue.put(App.counter++);
				System.out.println("Value added to queue: " + App.counter);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public Producer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	
}

class Consumer implements Runnable{

	private ArrayBlockingQueue<Integer> queue;

	@Override
	public void run() {
		//infinite while loop that constantly takes a element from the queue
		//if available
		while(true) {
			try {
				Thread.sleep(1000);
				queue.take();
				App.counter--;
				System.out.println("Value removed from queue: " + App.counter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public Consumer(ArrayBlockingQueue<Integer> queue) {
		this.queue = queue;
	}	
}

public class App {

	static int counter = 0;
	
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
		
		//creating a producer object and a thread that will run that object
		Producer produce = new Producer(queue);
		Thread producerThread = new Thread(produce);
		producerThread.start();
		
		//creating a consumer object and a thread that will run that object
		Consumer consume = new Consumer(queue);
		Thread consumeThread = new Thread(consume);
		consumeThread.start();
	}

}
