package Javapackage;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
	//	System.out.println("Enter value to find square:");
	//    int num=sc.nextInt();
	//	int square=num*num;
	//   System.out.println("Square of a entered number is :"+square);
	    
	    
	System.out.println("Enter number to find square");
	int num = sc.nextInt();
	int square = num*num;
	System.out.println("The square of a number is "+square);

	}

}
