package s10.CoreConcepts.InnerClasses.shop;

public class Door {
	//custom variable Lock that will be an object
	private Lock lock; //object that is of lock class
	public Door() {
		lock = new Lock(true); //references the object of lock class
	}
	
	public void shopStatus() {
		if(lock.isLock()) { //if locked
			System.out.println("Shop is currently closed");
		}
		else {
			System.out.println("Welcome we are open");
		}
	}
	
	
	//member inner class Lock inside the door class
	//a member inner class is when we have a non-static class inside another non-static class
	public class Lock{
		private boolean lock; //local lock varible

		public Lock(boolean lock) {
			this.lock = lock;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}
	}


	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	
	
}
