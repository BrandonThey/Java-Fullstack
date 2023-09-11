package s15.Multithreading.Synchronization.Join;

public class App {

	public int counter = 0;
	public static void main(String[] args) {
		App app = new App();
		
		//a simple thread that increments the counter
		Thread thread1 = new Thread(new Runnable() {	
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++) {
					app.counter++;
				}
				
			}
		});
		//printing the counter but it will not be 1000 since the thread is still running
		//in the background so we would need to sleep but sleep is not efficient
		//so instead we'll use join to sync the main thread with the created thread
//		try {
//			//since this join call is in the main thread, it will be joined with the 
//			//main thread
//			thread1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		
		//if we want to join two created threads together 
		//we can join thread1 into thread2 meaning that thread1 will run first
		//then thread2 will run
		Thread thread2 = new Thread(new Runnable() {	
			@Override
			public void run() {
				try {
					//we can put a number, for example 2000, inside the join method
					//which will be how long it will wait for thread1 until terminating it
					//and thread1 will have no impact on the counter
					thread1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				for(int i = 0; i < 1000; i++) {
					app.counter++;
				}
				
			}
		});
		thread1.start();
		thread2.start();
		
		//we can then join thread2 to the main thread to get our correct result
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The counter is at: " + app.counter);
	}

}
