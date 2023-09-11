package s09.classes.polymorphism;

import s09.classes.polymorphism.phone.Nokia;
import s09.classes.polymorphism.phone.Phone;
import s09.classes.polymorphism.phone.Samsung;

public class main {

	public static void main(String[] args) {
//		Phone phone = new Phone("Nokia 3310");
//		System.out.println(phone.getModel());
//		phone.features();
//
//		SamsungNote8 note8 = new SamsungNote8("Note 8");
//		System.out.println(note8.getModel());
//		note8.features();
		
		
		//polymorphism
		Phone newNote8 = new Samsung("Note 8");
		System.out.println(newNote8.getModel());
		newNote8.features();
		
		Phone nokia3310 = new Nokia("Nokia 3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
	
		//using the phone method to create a phone object
		Phone newPhone = new main().phone(1);
		Phone newNote = new main().phone(2);
		System.out.println(newPhone.getModel());
		System.out.println(newNote.getModel());
	}

	public Phone phone(int dailyDriver) {
		switch(dailyDriver) {
		case 1: return new Nokia("Nokia 3310");
		case 2: return new Samsung("Note 5");
		}
		return null;
	}
}
