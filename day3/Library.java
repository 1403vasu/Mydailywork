package week1.day3;

public class Library {

	
	public  String addBook(String BookTitle) {
		System.out.println("Book Added Successfully");
		return BookTitle;
	}
	public void issueBook() {
		 System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library library = new Library();


	        String bookTitle = library.addBook("The Great Gatsby");

	        
	        System.out.println("Added Book: " + bookTitle);

	        // Issue a book
	        library.issueBook();
      
	}

}
