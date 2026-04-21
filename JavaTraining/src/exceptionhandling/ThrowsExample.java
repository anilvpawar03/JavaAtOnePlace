package exceptionhandling;

public class ThrowsExample {

	static void checkAge(int age)  throws ArithmeticException   {
		if (age < 18 )   {
			throw new 
			ArithmeticException("Not eligible for voting");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			checkAge(15);
		}
		catch (ArithmeticException e){
			System.out.println("Exception caught : " + e.getMessage());
		}
	}

}
