package task4;

	//Demonstrate parameterized constructor. 

public class Student {

	String name;
    int age;

	
    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    
 // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
	
	public static void main(String[] args) {

		  // Creating object and passing values
        Student st = new Student("Pushpak", 24);
		

        // Display details
        st.display();
	}

}
