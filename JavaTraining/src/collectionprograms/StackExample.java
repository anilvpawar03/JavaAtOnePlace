package collectionprograms;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> name = new Stack<>();
		
		name.push("Ankit");
		name.push("Ankush");
		name.push("Vinay");
		
		System.out.println(name);
		
		name.pop();
		System.out.println(name);
	}

}
