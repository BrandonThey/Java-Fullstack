package org.studyeasy;

public class CalculateExercise {
	public static boolean isPrime(int number) {
		int temp;
		boolean result = true;
		
		for(int i = 2; i <= number; i++) {
			temp = number % i;
			if(temp == 0) {
				result = false;
				break;
			}
		}
		
//		if(result) {
//			System.out.println(number + " is prime");
//		}
//		else {
//			System.out.println(number + " is not prime");
//		}
			
		return result;
	}
	
	//overloading method for checking primes for doubles by converting it int
	public static boolean isPrime(double doubleVal) {
		int number = (int) doubleVal;
		int temp;
		boolean result = true;
		
		for(int i = 2; i <= number; i++) {
			temp = number % i;
			if(temp == 0) {
				result = false;
				break;
			}
		}
			
		return result;
	}
}
