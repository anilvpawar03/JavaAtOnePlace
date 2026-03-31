package Javapackage;

public class MultipleValueStoreExample {

	public static void main(String[] args) {

		
		//int Array
		int a[] = {10,20,30,40,50};
		
		//Char Array
		char ch[] = {'a','e','i','o','u'};
		
		//String Array
		String name[] = {"Simon","Anil","Sunil","Sachin","Raghav","Samir"};
		
		float ft[] = new float[5];
		ft[0] = 1.1f;
		ft[1] = 2.1f;
		ft[2] = 99.99f;
		ft[3] = 77.7f;
		ft[4] = 33.33f;
		//ft[6]=77.4f;
		
		
		
		System.out.println(ft[0]);
		System.out.println(ft[2]);
		
		
		System.out.println(a[0]);
		System.out.println(a[2]);
		System.out.println(a[4]);
		
		
		System.out.println(ch[4]);
		System.out.println(ch[3]);
	
		
		System.out.println(name[1]);
	    System.out.println(name[10]);
	  //It will give "ArrayIndexOutOfBoundsException" as 10 index not present in name Array.
	  //it will not run further outputs if any even if inputs are right further.
		System.out.println(name[2]);  //this is not resulted cause of above error.
		
		
		
		
		
		
	}

}
