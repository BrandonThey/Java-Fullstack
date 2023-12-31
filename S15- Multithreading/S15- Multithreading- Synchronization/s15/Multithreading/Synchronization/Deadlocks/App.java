package s15.Multithreading.Synchronization.Deadlocks;

//a deadlock is a state where threads need a resource but that resource
//cannot be released so there is a deadlock and the application is stuck
public class App {

	public static void main(String[] args) {

		String lock1 = "lock1";
		String lock2 = "lock2";
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized(lock1) {
					System.out.println("Inside thread 1 on lock 1");
					synchronized(lock2) {
						System.out.println("Inside thread 1 on lock 2");
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				//when we reverse the order for the threads
				//it enters a deadlocked state because thread 1 is waiting for lock 2
				//while thread 2 is waiting for lock 1 due to the synchronized block
				synchronized(lock2) {
					System.out.println("Inside thread 2 on lock 2");
					synchronized(lock1) {
						System.out.println("Inside thread 2 on lock 1");
					}
				}
			}
		});

		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("I am the main method");
	}

}
