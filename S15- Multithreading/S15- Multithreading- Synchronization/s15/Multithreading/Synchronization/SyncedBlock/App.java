package s15.Multithreading.Synchronization.SyncedBlock;

//class that creates a series of opening and closing brakets
class Brakets{
	public void generate() {
		//here we are syncing only a block of the code 
		//which is faster than syncing the whole method
		//the synchrinized method takes a private object
		//in this case we use the current instatiated object, "this"
		synchronized(this) { 
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
}
public class App {
	public static void main(String[] args) {
		Brakets braket = new Brakets();
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