package s10.CoreConcepts.InnerClasses;

import s10.CoreConcepts.InnerClasses.shop.Door;
import s10.CoreConcepts.InnerClasses.shop.DoorLocalInner;

public class Shop {
	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus();
		door.getLock().setLock(false); //getting the lock object then setting the lock boolean
		door.shopStatus();
		
		//testing the inner class locking class
		DoorLocalInner doorInner = new DoorLocalInner();
		System.out.println(doorInner.isLocked("Test"));
		System.out.println(doorInner.isLocked("qwerty"));
		
		//getting the key from the command line and testing them
//		for(int i = 0; i < args.length; i++) {
//			if(doorInner.isLocked(args[i])) {
//				System.out.println("Shop is currently closed");
//			}
//			else {
//				System.out.println("Welcome, we are open");
//			}
//		}
		
		//using an anonymous object to simulate the door and lock
		for(int i = 0; i < args.length; i++) {
			if(new DoorLocalInner().isLocked(args[i])) {
				System.out.println("Shop is currently closed");
			}
			else {
				System.out.println("Welcome, we are open");
			}
		}
	}
}
