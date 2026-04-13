package polymorphismprograms;

public class MethodOverloadingExample {

	public void add(int a, int b) {

		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {

		System.out.println(a + b + c);
	}

	public void add(int a, float b) {

		System.out.println(a + b);
	}

	public static void main(String[] args) {

		MethodOverloadingExample obj = new MethodOverloadingExample();

		obj.add(20, 30);
		obj.add(20, 30, 50);
		obj.add(20, 10.5f);
	}

}
