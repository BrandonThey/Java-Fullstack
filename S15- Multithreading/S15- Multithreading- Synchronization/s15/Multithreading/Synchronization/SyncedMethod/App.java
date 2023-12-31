package s15.Multithreading.Synchronization.SyncedMethod;

//class that creates a series of opening and closing brakets
class Brakets{
	synchronized public void generate() {
		for(int i = 0; i <= 10; i++) {
			if(i <= 5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
}
public class App {
	public static void main(String[] args) {
		Brakets braket = new Brakets();
		
		//creating two threads that will interfere with each other
		//this is due to them not being able to sync with each other
		//this can be solved by using the "synchronized" keywork in the generate method
		//this allows only one thread to use the method at a time
		//but this only works for one obejct, if there are two objects
		//they will unsync, for example if there are two braket object being used
		//they will not by synced with each other
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i <= 5; i++){
					braket.generate();
				}
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i <= 5; i++){
					braket.generate();
				}
				
			}
		}).start();
	}
}
