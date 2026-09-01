package task4;

	//Create a Book class with title, author, and price.

public class BookDetails {
	
	//Data members
	String title;
	String author;
	float price;
	
	//Method to display book details 
	void display()   {
	System.out.println("Book Title: " + title);
	System.out.println("Book author: " + author);
	System.out.println("Book Price: " + price);
	
	}

	public static void main(String[] args) {
		
		BookDetails bt = new BookDetails();
		
		//Assigning Values 
		bt.title = "Java Programming";
		bt.author = "Games Gosling";
		bt.price = 499.59f;
		
	//	Displaying details
		bt.display();
		

	}

}
