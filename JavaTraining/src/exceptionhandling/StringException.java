package exceptionhandling;
	/*
	 * StringIndexOutOfBoundException
	 * (When we trying to access character in a string which is not present)
	 */

public class StringException {

	public static void main(String[] args) {
		
		try  {
			String str = "Deepak";
			System.out.println(str.charAt(6));
			
		}   
		catch (Exception e) {
			System.out.println("Please enter valid index number");
			
		}
		
	}

}
