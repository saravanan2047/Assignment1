package assignment9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book 
{
	private int isbn;
	private String title;
	private String author;
	private String journer;
	private int publishYear;
	private double price;
	private static float tax=0.08f;
	private static List<Book> bookList= new ArrayList<>();
	
	
	public Book(int isbn, String title, String author, String journer, int publishYear, double price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.journer = journer;
		this.publishYear = publishYear;
		this.price = price;
		bookList.add(this);
	}
	public Book() {}
	
	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return  price;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getJourner() {
		return journer;
	}


	public void setJourner(String journer) {
		this.journer = journer;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	
	public double getTotalCost()
	{
		return price*tax;
	}
	public void displayAllDetails()
	{
		System.out.println("Book name :"+title);
		System.out.println("Author name : "+author);
		System.out.println("Book journer :"+journer);
		System.out.println("Publish year : "+publishYear);
		System.out.println("Cost of book : "+ getTotalCost());
	}
	public void displayAllBooks()
	{
		for(Book book:bookList)
		{
			System.out.println("Title : "+book.getTitle()+"\t Author : "+book.getAuthor()+"\tPrice  : "+book.getPrice());
		}
	}
}
public class BookMain
{
	public static void main(String [] args)
	{	
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter how many books you want to add.?");
	int number=scan.nextInt();
	for(int i=0;i<number;i++)
	{
		System.out.println("Enter book ID :");
		int bookId=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Book Title : ");
		String title=scan.nextLine();
		System.out.println("Enter the Author name : ");
		String name=scan.nextLine();
		System.out.println("Enter the journer : ");
		String journer=scan.next();
		System.out.println("Enter the Publishing year : ");
		int year=scan.nextInt();
		System.out.println("Enter the cost : ");
		float cost=scan.nextFloat();
		Book book= new Book(bookId,title,name,journer,year,cost);
	}
		Book book= new Book();
		book.displayAllBooks();
}
}
