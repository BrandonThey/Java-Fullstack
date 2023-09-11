package s10.CoreConcepts.Interfaces.phone;

public class Iphone8 implements Phone{

	@Override
	public String processor() {
		return "A11";
	}

	@Override
	public String OS() {
		return "IOS";
	}

	@Override
	public int spaceInGB() {
		return 64;
	}

}
