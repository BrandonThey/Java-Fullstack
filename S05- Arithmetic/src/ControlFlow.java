
public class ControlFlow {

	public static void main(String[] args) {
		int x = 6;
		
		if(x==6) {
			System.out.println("value is 6");
		}
		else {
			System.out.println("What happened");
		}
		
		//ternary operators
		boolean y;
		//if 5 is greater than 4 then true otherwise false
		// y = condition? result_if_true:result_if_false
		y = (5>4)? true:false;
		int test;
		test = (20 > 33)?20:23;
		
		System.out.println(test);
		
		//switch statement
		switch(x) {
		case 1:
			System.out.println("Value is 1");
			break;
		case 6:
			System.out.println("Value is 6");
			break;
		default:
			break;
		}
		
		//for loop
		for(int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		
		//nested loop exercise
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
