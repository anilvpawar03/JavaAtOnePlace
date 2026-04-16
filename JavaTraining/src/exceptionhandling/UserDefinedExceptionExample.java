package exceptionhandling;


// Create Custom/Userdefined Exception 

class InvalidAgeException extends Exception {
	
	InvalidAgeException(String msg)   {
		super(msg);
	}
	
}

public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		
		try {
			//Calling the method
			UserDefinedExceptionExample.ageCheck(17);
			
		}  catch (InvalidAgeException  e)  {
			 System.out.println("Invalid Age Exception");
			 System.out.println(e.getMessage());
		}
		
		
	}
		//Defining the Method
	public static void ageCheck(int age) throws InvalidAgeException {
		
		if (age < 18)  {
			throw new InvalidAgeException("Age must be 18 or Above");
			
		} else {
			System.out.println("Valid Age for Voting");
		}
		/*
		 * Note : 'throw' keyword is used to throws the user defined or custom exception
		 * object to the JVM explicitly.
		 */
	}

}
