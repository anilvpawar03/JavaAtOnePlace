package collectionprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
 
public class HashSetExample {

	public static void main(String[] args) {
		
		//Declaration 
		HashSet myset = new HashSet();
		
		//Adding Elements in HashSet 
		myset.add(100);
		myset.add("Selenium");
		myset.add('A');
		myset.add(99.99);
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//Printing HashSet
		System.out.println(myset);
		
		//Size of HashSet
		System.out.println("Size of HashSet =" + myset.size());
		
		//Remove Elements from HashSet
		myset.remove(100);
		
		//Printing HashSet
		System.out.println(myset);
		
		
		/*
		 * Note:
		 * 1.Insertion of Elements is not possible in HashSet
		 * 2.Accessing Specific Elements is also not possible in HashSet
		 * 3.Convert HashSet into ArrayList(WorkAround Available)
		 */
		
		
		ArrayList al = new ArrayList(myset);
		
		//Printing ArrayList Data 
		System.out.println(al);
		System.out.println(al.get(2));
		
		//Read all the Elements using Looping Statement
		
		
		//Using Iterator
		Iterator it = myset.iterator();
		while(it.hasNext())  {
			System.out.println(it.next());
			
		//Read all the Elements using For Loop Statement
		for(Object x:myset)   {
			System.out.println(x);
		}
		
		
		//myset.clear();
		
		System.out.println(myset);
		}
	}

}
