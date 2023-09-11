import org.studyeasy.CalculateExercise;
public class Exercise {

	public static void main(String[] args){
		//creating a new object out of the calculateExercise class
		CalculateExercise prime = new CalculateExercise();
		if(prime.isPrime(25)) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
	}

}
