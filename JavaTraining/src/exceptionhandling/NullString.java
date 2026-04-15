package exceptionhandling;

  	/*
  	 * NullPointerException
  	 * (When we trying to convert Null String into Upper case)
  	 */
public class NullString {

	public static void main(String[] args) {
		try {
			
		String str = null;
		System.out.println(str.toUpperCase());
		
		}
		catch (NullPointerException np)  {
			 
			System.out.println("Null String can't be casted");
			
		}
	}

	
}
