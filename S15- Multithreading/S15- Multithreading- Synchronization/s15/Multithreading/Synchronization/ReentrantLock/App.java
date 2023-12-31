package s15.Multithreading.Synchronization.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {

	//we should use a locking mechanism on the counter to prevent
	//interference with updates to the variable
	static int counter = 0;
	static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				lock.lock(); //locking the block so that the counter will accurately adjust
				//using a try finally block so if any exceptions occur in the 
				//for loop the lock will still unlock
				try {
					for(int i = 0; i < 1000; i++) {
						App.counter++;
					}
				}
				finally {
					lock.unlock();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				lock.lock();
				try {
					for(int i = 0; i < 1000; i++) {
						App.counter++;
					}
				}
				finally {
					lock.unlock();
				}
			}
		});
		//starting threads
		thread1.start();
		thread2.start();
		
		//joining threads onto the main
		thread1.join();
		thread2.join();
		
		System.out.println("Final Value of counter is: " + App.counter);
		
	}
}
