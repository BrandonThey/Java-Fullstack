package s15.Multithreading.Synchronization.ConcurrencyControl;

public class App {

	public static int counter = 0;
	
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("Thread 1 is over");
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("Thread 2 is over");
			}
		});
		thread1.start();
		thread2.start();
		//Ideally the value of counter should be 2000 after these threads
		//however this is not always the case, sometimes it is less than 2000
		//that is because the counter is the same variable shared between two entities
		//that may cause errors in concurrency
		//so we must use synchronization
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The value of counter is: " + App.counter);
	}

}
