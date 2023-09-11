package s10.CoreConcepts.Interfaces;

import s10.CoreConcepts.Interfaces.phone.Iphone8;
import s10.CoreConcepts.Interfaces.phone.OnePlus5;
import s10.CoreConcepts.Interfaces.phone.Phone;

public class main {
	public static void main(String[] args) {
//		OnePlus5 phone = new OnePlus5();
//		String processor = phone.processor();
//		System.out.println("Processor: " + processor);
		
		Phone phone = new OnePlus5();
		Phone iPhone = new Iphone8();
		System.out.println("Processor: " + phone.processor());
		System.out.println("Processor: " + iPhone.processor());
	}
}
