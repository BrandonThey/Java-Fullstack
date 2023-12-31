package s15.Multithreading.Synchronization.Interrupt;

public class App {

	static public int balance = 0;
	public void withdraw(int amount) {
		synchronized(this){
			if(balance <= 0) {
				try {
					System.out.println("Waiting for balance");
					wait(6000);
					balance = balance - amount;
					System.out.println(amount + " Withdrawn Succesfully");
				} catch (InterruptedException e) {
					System.out.println("Thread was interrupted");
					return;
				}
				
			}
			System.out.println("Your current balance is: " + balance);
		}
	}
	
	public void deposit(int amount) {
		System.out.println("We are depositing the amount: " + amount);
		balance = balance + amount;
		
		
	}
	
	public static void main(String[] args) {
		App app = new App();
	
		//for anonymous threads we cannot interrupt it since we dont have a reference
		//for the thread but here we have a reference, withdrawThread
		Thread withdrawThread = new Thread(new Runnable() {	
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		withdrawThread.setName("Withdraw Thread");
		withdrawThread.start();

		Thread depThread = new Thread(new Runnable() {	
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(2000);
				withdrawThread.interrupt(); //interrupting the thread which will terminate it
			}
		});
		depThread.setName("Deposit Thread");
		depThread.start();
	}
}
