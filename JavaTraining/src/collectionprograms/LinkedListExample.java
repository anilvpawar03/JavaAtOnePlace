package collectionprograms;

import java.util.LinkedList;
                                                   //Queue  
public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Ankit");
		name.add("Ankush");
		name.add("Deepak");
		
		System.out.println(name);
		
		name.addFirst("Rohit");
		System.out.println(name);
		
		name.addLast("Vinay");
		System.out.println(name);
		
		name.removeLast();
		System.out.println(name);
		
		
		for(String str:name)
		{
			System.out.println(str);
		}
		
		
		
	}

}
