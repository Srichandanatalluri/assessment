package Codingassessment3;

public class TestBussinessLogic {
	public static void main(String[] args) {
		
		BussinessLogic bl=new BussinessLogic();
		
		bl.addBooks();	
		
		System.out.println("\nAfter adding the Books ");
		bl.displayBooks();	
					
		bl.updateBooks(3,4001,"Stuart Little","E.B.White");	
		
		System.out.println("\nAfter Updating the book ");
		bl.displayBooks();
		
		bl.deleteBook(4);
		
		System.out.println("\nAfter Deleting the book ");
		bl.displayBooks();

}
}
