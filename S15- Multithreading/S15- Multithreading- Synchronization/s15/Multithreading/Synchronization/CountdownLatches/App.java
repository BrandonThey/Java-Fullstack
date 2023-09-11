package s15.Multithreading.Synchronization.CountdownLatches;

import java.util.concurrent.CountDownLatch;

//countdown latches are another way to manage threads
class SomeThread extends Thread{
	private CountDownLatch latch;

	@Override
	public void run() {
		System.out.println("Thread running: " + Thread.currentThread().getName());
		System.out.println("Thread execution completed \n");
		latch.countDown(); //one instance of releasing a lock
	}
	
	public SomeThread(CountDownLatch latch) {
		this.latch = latch;
	}

}
public class App {

	public static void main(String[] args) {
		
		//a latch is a locking mechanism on threads
		//the 4 in the initialization is how many steps we have to take 
		//before unlocking the latch, so we must unlock it 4 times
		CountDownLatch latch = new CountDownLatch(4);
		SomeThread thread1 = new SomeThread(latch);
		SomeThread thread2 = new SomeThread(latch);
		SomeThread thread3 = new SomeThread(latch);
		SomeThread thread4 = new SomeThread(latch);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		//this latch on the main thread will force the main thread to wait
		//until the lock is released, in this case it must be unlocked 4 times
		//so since we unlock a step every time a thread runs in our SomeThread class
		//the latch will unlock after all 4 of the threads have finished
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is now the main thread: " + Thread.currentThread().getName());
	}

}
