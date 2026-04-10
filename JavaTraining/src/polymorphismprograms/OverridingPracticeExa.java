package polymorphismprograms;


class Base {
	
	public void study()  {
		System.out.println("I am Studying");
	}


}

public class OverridingPracticeExa extends Base {

	public static void main(String[] args) {

		OverridingPracticeExa obj = new OverridingPracticeExa();
		obj.study();
	}

	public void study()  {
		super.study();
		System.out.println("You are studying");
	}
}
