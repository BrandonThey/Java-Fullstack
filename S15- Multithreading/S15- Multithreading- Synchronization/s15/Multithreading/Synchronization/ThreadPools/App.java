package s15.Multithreading.Synchronization.ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Threadpools help manage threads where there are multiple, possibly interconnected threads
class SomeThread extends Thread{
	private String name;

	public SomeThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Starting thread: " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Running ended: " + name);
	}
}

public class App {

	public static void main(String[] args) {
		//creating multiple threads so we can manage them
		//threads should be given resources evenly, where one thread does not
		//use up all the resources at all times
		//here we're creating a thread pool using executor service with the
		//number of threads that can be ran at a time being 2
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		SomeThread thread1 = new SomeThread("Thread1");
		SomeThread thread2 = new SomeThread("Thread2");
		SomeThread thread3 = new SomeThread("Thread3");
		SomeThread thread4 = new SomeThread("Thread4");
		SomeThread thread5 = new SomeThread("Thread5");
		SomeThread thread6 = new SomeThread("Thread6");

		//here we start the threads using the executor service rather than using
		//thread.start()
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);
		executorService.execute(thread6);
		
		//shutting down the executor
		executorService.shutdown();
	}

}
