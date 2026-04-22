package collectionprograms;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList myList = new ArrayList();
		
		
		myList.add(100);
		myList.add(10.5);
		myList.add("Pune");
		myList.add('D');
		myList.add(100);
		myList.add(true);
		myList.add(null);
		myList.add(null);
		
		//Size of an ArrayList
		System.out.println(myList.size());
		
		//Print Data from the ArrayList
		System.out.println("Pinting Data from ArrayList" +myList);
		
		//Remove Data from ArrayList and Print
		myList.remove(5);
		System.out.println("Printing Data after Removing" +myList);
		
		//Insert Element in the ArrayList
		myList.add(1, "Java");
		System.out.println("Print Data after Insertion new Data" +myList);
		
		myList.add("Mumbai");
		System.out.println("Print Data after Insertion new Data " +myList);
		
		//Modify Element in the ArrayList  (Modify/Replace)
		myList.set(2, "Nagpur");
		System.out.println("Print Data after Modifying" +myList);
		
		System.out.println(myList.get(4));
		
		System.out.println(myList.get(8));
	}

}
