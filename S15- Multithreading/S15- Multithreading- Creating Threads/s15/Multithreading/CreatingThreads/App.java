package s15.Multithreading.CreatingThreads;

//creating threads by inheriting the threads class
class MyCounter extends Thread{
	private int threadNum;

	//overriding the run method so we call countme when we run the process
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for(int i = 1; i <= 9; i++) {
			//adding a sleep to slow down the process by 500 miliseconds
			//to show the multithreading in process
			try {
				sleep(500);
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

	public static void main(String[] args) throws InterruptedException {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);

		//creating a variable that times how long the application takes
		long startTime = System.currentTimeMillis();
		//Start method that the JVM uses to multithread that will run
		//counter 1 and 2 at the same time
		//This will run counter 1 and 2 in the background and move on to the 
		//rest of the application
		counter1.start();
		System.out.println();
		counter2.start();
		
		//sleeping to wait for the counters to be finished before counting the time
		Thread.sleep(5000);
		long endTime = System.currentTimeMillis();
		System.out.println("Application took: " + (endTime-startTime) + " milliseconds");
	}

}
