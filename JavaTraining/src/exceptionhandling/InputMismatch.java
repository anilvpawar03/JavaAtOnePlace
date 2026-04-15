package exceptionhandling;

	/*  
	 * InputMismatchException
	 * (When we enter the invalid input then will get this exception)
	 */
import java.util.Scanner;
public class InputMismatch {

	public static void main(String[] args) {
		
	try	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		System.out.println(num);
		
		//Here we should give Number as an input but instead of Number we give String as an input//
	}   
	  catch (Exception e) {
		  System.out.println("Please Enter Valid Input");
	  }
	
		finally  {
			System.out.println("This is finally block ");
		}
	}

}
 