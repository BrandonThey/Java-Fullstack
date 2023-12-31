package s15.Multithreading.Synchronization.WaitAndNotify;

//using wait and notify keywords to control threading
public class App {

	static public int balance = 0;
	
	//simple withdraw and deposit methods for our wait and notify operations
	public void withdraw(int amount) {
		//synchronizing the if block since the wait command requires
		//syncing with the notify
		synchronized(this){
			if(balance <= 0) {
				try {
					System.out.println("Waiting for balance");
					//sets the current thread to waiting which stops(Lock) it until a notify occurs
					//it will wait for 6000 miliseconds for a notify otherwise it will 
					//terminate
					wait(6000);
					balance = balance - amount;
					System.out.println(amount + " Withdrawn Succesfully");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println("Your current balance is: " + balance);
		}
	}
	
	public void deposit(int amount) {
		System.out.println("We are depositing the amount");
		balance = balance + amount;
		
		//a synced notify(release) for the wait in the withdraw
		//a regular notify only releases one lock, while notifyAll releases all
		synchronized(this) {
			notify();
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		
		Thread withdrawThread = new Thread(new Runnable() {	
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		//setting the thread's name to show up in console outputs
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
			}
		});
		depThread.setName("Deposit Thread");
		depThread.start();
	}
}
