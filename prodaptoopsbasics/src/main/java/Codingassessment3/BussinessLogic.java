package Codingassessment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class BussinessLogic extends Entity {
	

	
		String[] books=new String[5];
		void addBooks()
	    {		
			for(int i=0;i<=n;i++) {
	        books[i]="Book ID - "+id[i]+"\nBook name - "+name[i]+"\nBook author - "+author[i];       
	        System.out.println("Book "+(i+1)+" Added ");
	        }           
	    }
	    
	    void updateBooks(int i,int id,String name,String author)
	    {
	    	System.out.println("\nNew Updated Book is \n");
	    	System.out.println("Book "+(i+1));    	
	        books[i]="Book ID - "+id+"\nBook name - "+name+"\nBook author - "+author;
	        System.out.println(books[i]);
	    }
	    void displayBooks()
	    {    	
	    	for(int i=0;i<=numberOfBooks;i++)
	    	{
	    		System.out.println("\nBook "+(i+1));
	            System.out.println(books[i]);    	
	    	}
	    }
	    void deleteBook(int n)
	    {
	    	   	
	    	List<String> list=new ArrayList<String>(Arrays.asList(books));
	    	list.remove(n-1);
	    	books=list.toArray(new String[0]);
	    }

	}
