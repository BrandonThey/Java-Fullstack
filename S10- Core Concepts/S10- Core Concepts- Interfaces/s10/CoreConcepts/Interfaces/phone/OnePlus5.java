package s10.CoreConcepts.Interfaces.phone;

public class OnePlus5 implements Phone {
	
	@Override
	public String processor() {
		//returns the processor name 
		return "SD835";
	}

	@Override
	public String OS() {
		return "Android";
	}

	@Override
	public int spaceInGB() {
		// TODO Auto-generated method stub
		return 64;
	}
}
