package s16.LambdaExpressions.Predicates;

import java.util.function.IntPredicate;

//a predicate is a functional interface that performs an operation that returns
//a boolean value
public class App {

	public static void main(String[] args) {
		
		//in the lambda expression, i is the argument being compared to the value
		IntPredicate lessThan21 = i -> i < 21;
		IntPredicate greaterThan18 = i -> i > 18;

		System.out.println(lessThan21.test(19));
		
		//we can use a predicate's "and" method to be an and gate for two predicates
		System.out.println(lessThan21.and(greaterThan18).test(19));
		
		new App().demo(19, lessThan21, greaterThan18);
		new App().demo(20, lessThan21, greaterThan18);
		new App().demo(18, lessThan21, greaterThan18);
		new App().demo(17, lessThan21, greaterThan18);
	}

	public void demo(int x, IntPredicate lessThan21, IntPredicate greaterThan18) {
		if(lessThan21.and(greaterThan18).test(x)) {
			System.out.println("The input is less than 21 and greater than 18");
		}else {
			System.out.println("Invalid input");
		}
	}
}
