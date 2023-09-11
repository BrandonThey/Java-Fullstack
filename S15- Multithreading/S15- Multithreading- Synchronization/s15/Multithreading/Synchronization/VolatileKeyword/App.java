package s15.Multithreading.Synchronization.VolatileKeyword;

public class App {

	//whenever a thread is dependent on a variable its good to 
	//mark the variable as volatile to prevent caching
	//only restricted to variables
	volatile public static int flag = 0;
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//infinite while loop that runs while the flag is set to 0
				while(true){
					if(flag == 0) {
						System.out.println("Running");
					}
					else {
						break;
					}
				}
				
			}
		}).start();

		new Thread(new Runnable() {
			
			//after 5000 miliseconds switch the flag to stop the loop
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				App.flag = 1;
				System.out.println("Flag has been updated");
			}
		}).start();
	}

}
