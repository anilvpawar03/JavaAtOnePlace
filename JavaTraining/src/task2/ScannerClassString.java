package task2;

import java.util.Scanner;

public class ScannerClassString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Read String from User
		System.out.println("Enter text :");
		String str = sc.nextLine();
		
		System.out.println("Entered Line is :"+str);

	}

}
