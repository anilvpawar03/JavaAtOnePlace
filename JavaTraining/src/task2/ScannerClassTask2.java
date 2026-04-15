package task2;

import java.util.Scanner;

public class ScannerClassTask2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Find sum of two numbers 
		System.out.println("Enter values to find sum of two numbers:");
     	int a = sc.nextInt();  // nextInt() = for number output;
	    int b = sc.nextInt();
	
		int sum = a + b;
		System.out.println("Sum of two numbers are:" + sum);
		
		
		//Find average of three numbers 
		System.out.println("Enter values to find Average:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		
		int avg = (p + r + r ) / 3;
		System.out.println("Average is :"+avg);
		
		
		//Find Simple interest calculation 
		System.out.println("Enter values to find simple interest:");
		int p1 = sc.nextInt();
		int r1 = sc.nextInt();
		int t1 = sc.nextInt();
		
		int si =(p1 * r1 * t1) /100;
		System.out.println("Simple Interest is :"+si);
		
		
		//Find Area of circle
		System.out.println("Enter values to find Area of Circle :");
		double ra = sc.nextDouble();    //For most accurate values "double" is used
		
		double area = 3.14 * ra * ra;
		System.out.println("Area of Circle is :"+area);
		
		//Read Integer from user 
		System.out.println("Enter Integer Number :");
		int number = sc.nextInt();
		
		System.out.println("Entegered Number is :"+number);
		
		
	
		
		
		
	}

}
