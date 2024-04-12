package assignment14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Books
{
	int bookId;
	String bookName;
	String author;
	String publisher;
	double price;
	public Books(int bookId, String bookName, String author, String publisher, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
public class BookApp2 {
	static Scanner scan= new Scanner(System.in);
	static List<Books> bookList= new ArrayList<>();
	
	public static void main(String[] args) 
	{
		
		while(true)
		{
			System.out.println("Enter the choice \n1) ADD \n2) Update \n3) Delete \n4) Display \n5) Exit");
			String choice=scan.next();
			switch(choice)
			{
			case "1": add();
			break;
			case "2": update();
			break;
			case "3": delete();
			break;
			case "4": display();
			break;
			case "5": System.out.println("<<<<<<---THANK YOU---->>>>>>");break;
			default: System.out.println("Enter a valid option...!!!!\n");
			}
			if(choice.equals("5")) break;
			
		}

	}

	
	public static void display() {
		if(bookList.isEmpty())
			System.out.println("First add books to display..\n");
		else {
			System.out.println("Books Are : \n");
		
		for(Books b:bookList)
		{
			System.out.println(b.bookId+"\t "+b.author+"\t "+b.bookName+"\t "+b.publisher+"\t "+b.price+"\n");
		}
		System.out.println("\n");
		}
		
	}


	public static void update() {
	
		if(bookList.isEmpty()) System.out.println("Add book First\n");
		else
		{
			System.out.println("Enter book ID : ");
			int id=scan.nextInt();
			for(Books b:bookList)
			{
				if(b.bookId==id)
				{
					updatebook(b);
					
					return;
				}
			}
			System.out.println("Book NOt Found...please enter the correct book ID");
		}
		
	}

	public static void updatebook(Books b) {
		System.out.println("Enter what you want to update : ");
		System.out.println("1) Price \n2) Publisher \n3) Book ID \n4) Exit");
		String choice=scan.next();
		switch(choice)
		{
		case "1": System.out.println("Enter the new Price : ");
		double price=scan.nextDouble();
		b.setPrice(price);
		System.out.println("Update successfully.....\n");
		break;
		case "2":  System.out.println("Enter the new Publisher : ");
		scan.nextLine();
		String publisher=scan.nextLine();
		b.setPublisher(publisher);
		System.out.println("Update successfully.....\n");
		break;
		case "3": System.out.println("Enter the new Book ID : ");
		int id=scan.nextInt();
		b.setBookId(id);
		System.out.println("Update successfully.....\n");
		break;
		case "4": System.out.println("To main Page...\n");
		break;
		default: System.out.println("Enter a valid option...!!!\n");
		
		}
		
	}

	public static void add() {
		System.out.println("Enter how many books you want to add : ");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter book ID : ");
			int id=scan.nextInt();
			System.out.println("Enter the Book name : ");
			scan.nextLine();
			String bookName= scan.nextLine();
			System.out.println("Enter the Author name : ");
			String author= scan.nextLine();
			System.out.println("Enter the publisher : ");
			String publisher=scan.nextLine();
			System.out.println("Enter the price: ");
			double price=scan.nextDouble();
			Books book= new Books(id,bookName,author,publisher,price);
			bookList.add(book);
		}	
		
	}
	public static void delete() 
	{
		System.out.println("Enter the book ID");
		int id=scan.nextInt();
		for(Books b:bookList)
		{
			if(b.bookId==id)
			{
				bookList.remove(b);
				System.out.println("Book Removed Successfully....");
				return;
			}
		}
		System.out.println("Book Not found. ....Please enter correct bok ID");
		
		
	}
}
