package s15.Multithreading.CreatingThreadsUsingRunnable;

import java.util.Random;

//creating threads by implementing the runnable interface
class MyCounter implements Runnable{
	private int threadNum;

	@Override
	public void run() {
		//implementing a sleep function using a random time to lessen jumbling up of threads
		Random random = new Random();
		for(int i = 0; i <= 9; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + ". The thread number is: " + this.threadNum);
		}
	}

	public MyCounter(int threadNum) {
		this.threadNum = threadNum;
	}
}
public class App {

	public static void main(String[] args) {
		Thread counter1 = new Thread(new MyCounter(1));
		Thread counter2 = new Thread(new MyCounter(2));

		counter1.start();
		counter2.start();
		
		try {
			Thread.sleep(5000);
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if we want to use a threaded method only once, we can use an
		//anonymouse object
		Thread newThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i <= 10; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		});
		
		newThread.start();
	}

}
