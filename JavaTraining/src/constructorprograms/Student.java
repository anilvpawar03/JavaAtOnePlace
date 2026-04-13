package constructorprograms;

public class Student {
	
	   String name;
	   int id;
	   
	   //Parameterized Constructor
	   Student(int i , String n)  {
		    id = i;
		   name = n;
		   
    }
	
	public void display()  {
		System.out.println("Id is : " +id);
		System.out.println("My name is :  "+name);
	}
	
	
	public static void main(String[] args) {
		
		Student obj1 = new Student(101,"Deepak");
		obj1.display();
		Student obj2 = new Student(102,"Anil");
		obj2.display();
		Student obj3 = new Student(103,"Naina");
		obj3.display();
	}

}
