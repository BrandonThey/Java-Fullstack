package s10.CoreConcepts.InnerClasses.shop;

//a class that mimics the other door class but uses a local inner class instead
//inner classes can only be used by the outer class
//easy access, as inner object is implicitly available inside the outer object
public class DoorLocalInner {
	//a local inner class is one that is in the local scope of a block statement
	public boolean isLocked(String key) {
		
		class Lock { //local inner class inside the isLocked method. Class is abstract and hidden from outside
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {//if the given string equals to qwerty then is unlocked
					return false;
				}
				else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);//return for outer method, creates a new lock object and checks if key unlocks it
	}
}
