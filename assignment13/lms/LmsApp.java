package assignment13.lms;

import java.util.List;
import java.util.Scanner;


import assignment13.lms.members.Members;
import assignment13.lms.book.Books;
import assignment13.lms.librarian.Librarian;
import assignment13.lms.librarytranscation.LibraryTransaction;

public class LmsApp {
	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		LibraryTransaction.getInstance().setLibraryName("ZSGS LIBRARY");
		LibraryTransaction.getInstance().setLibraryMobileNo(8529631456l);
		LibraryTransaction.getInstance().setLibraryId(897);
		while(true)
		{
			System.out.println("Select any option \n1) Add Member \n2) Add book \n3) Update Book \n4) Display Books  \n5) Add Librarian\n0) Exit");
			int choice =scan.nextInt();
			switch(choice)
			{
				case 1: addMember();
						break;
				case 2: addBook();
						break;
				case 3: updateBook();
						break;
				case 4: displayBook();
						break;
				case 5: addLibrarian();
						break;
				case 0: System.out.println("~~~~ Thank You ~~~~~\n");
				   		break;
				default : System.out.println("Enter a valid option\n");
			}  
			if(choice==0) break;
		}
	}
	public static void addLibrarian() 
	{
		Librarian librarian= new Librarian();
		System.out.println("Enter Name : ");
		librarian.setName(scan.next());
		System.out.println("Enter ID :");
		librarian.setId(scan.nextInt());
		System.out.println("Enter Email -Id");
		librarian.setEmail(scan.next());
		System.out.println("Enter Phone Number");
		librarian.setPhoneNumber(scan.nextLong());
		LibraryTransaction.getInstance().addLibrarian(librarian);
	}
	public static void addMember()
	{
		Members member= new Members();
		scan.nextLine();
		System.out.println("Enter Member NAME : ");
		member.setName(scan.nextLine());
		System.out.println("Enter Member Email-ID :");
		member.setEmail(scan.next());
		System.out.println("Enter Member ID :");
		member.setUserId(scan.nextInt());	
		LibraryTransaction.getInstance().addMembers(member);
	}
	public static void addBook()
	{
		Books book= new Books();
		scan.nextLine();
		System.out.println("Enter Book NAME : ");
		book.setBookName(scan.nextLine());
		System.out.println("Enter Book ID :");
		book.setBookId(scan.nextInt());
		System.out.println("Enter Author Name :");
		scan.nextLine();
		book.setAuthor(scan.nextLine());
		System.out.println("Enter Publisher : ");
		book.setPublisher(scan.next());
		LibraryTransaction.getInstance().addBooks(book);
	}
	public static void updateBook()
	{
		if(validate())
		{
			System.out.println("Enter Book ID :");
			int id=scan.nextInt();
			if(checkBookPresent(id))
			{
				while(true) 
				{
					System.out.println("What you want to update \n1) Book Name \n2) Author Name \n3) Publisher \n4) Exit");
					int choice=scan.nextInt();
					switch(choice)
					{
						case 1:	System.out.println("Enter new  Book Name : ");
								scan.nextLine();
						 		String name=scan.nextLine();
						 		modifyBookName(id,name);
							break;
						case 2:
							System.out.println("Enter new  Author Name : ");
							scan.nextLine();
					 		String authorName=scan.nextLine();
					 		modifyAuthorName(id,authorName);
							break;
						case 3:
							System.out.println("Enter new  Book Publisher : ");
							scan.nextLine();
					 		String publisher=scan.nextLine();
					 		modifyPublisher(id,publisher);
							break;
						case 4:
							break;
						default: System.out.println("Enter a valid input..>!!\n");
					}
					if(choice==4)
						break;					
				}
				
				
			}
		}
		else
		{
			System.out.println("\nNot allowed to modify Book Details\n");
		}
		
	}
	public static void modifyPublisher(int id, String publisher) {
		List<Books> bookList=LibraryTransaction.getInstance().getBooks();
		for(Books b:bookList)
		{
			if(id==b.getBookId())
			{
				b.setPublisher(publisher);
			}
		}
	}
	public static void modifyAuthorName(int id, String authorName) {
		List<Books> bookList=LibraryTransaction.getInstance().getBooks();
		for(Books b:bookList)
		{
			if(id==b.getBookId())
			{
				b.setAuthor(authorName);
			}
		}
		
	}
	public static void modifyBookName(int id, String name) 
	{
		List<Books> bookList=LibraryTransaction.getInstance().getBooks();
		for(Books b:bookList)
		{
			if(id==b.getBookId())
			{
				b.setBookName(name);
			}
		}
	}
	private static boolean checkBookPresent( int id) 
	{
		boolean stat=false;
		
		List<Books> bookList=LibraryTransaction.getInstance().getBooks();
		for(Books b:bookList)
		{
			if(id==b.getBookId())
			{
				return true;
			}
		}
		return false;
	}
	private static boolean validate() 
	{
		System.out.println("Enter Librarian email Id :");
		String email=scan.next();
		boolean stat=false;
		List<Librarian> libList=LibraryTransaction.getInstance().getLibrarian();
		for(Librarian l:libList)
		{
			if(email.equals(l.getEmail()))
			{
				return true;
			}		
		}
		return false;
	}
	public static void displayBook()
	{
		if(!LibraryTransaction.getInstance().getBooks().isEmpty()) 
		{
			System.out.printf("%-10s %-15s %-20s %-25s","Book NAME","Book ID","Author NAME","Publisher");
			System.out.println();
		for(Books b: LibraryTransaction.getInstance().getBooks())
		{
			System.out.format("%-10s %-15s %-20s %-25s",b.getBookName(),b.getBookId(),b.getAuthor(),b.getPublisher());
			System.out.println();
		}}
		else
			System.out.println("\nEmpty book List...!!!!\nAdd books first\n");
		
	}

}
