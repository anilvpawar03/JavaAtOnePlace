package exceptionhandling;

import java.util.Scanner;
            //Arithmetic Exception (When we divide any number by '0' will get this exception)
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		try  {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
		int div = num1 / num2;
		System.out.println("The Division is " +div);
		
		}  catch  (Exception e)  {
			
			System.out.println("Cannot divide by zero");
			
		}
		
		System.out.println("Hello World");
		
	}

}
