package s10.CoreConcepts.InnerClasses.shop;

//simulating an anonymous inner class 
abstract class Lock{
	public abstract boolean isUnlocked(String keyCode);
	
}

public class AnonInnerClass {
	Lock lock = new Lock() {
		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			}
			else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	
	
}
