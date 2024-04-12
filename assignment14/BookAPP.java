package assignment14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book
{
	int bookId;
	String bookName;
	String author;
	String publisher;
	double price;
	public Book(int bookId, String bookName, String author, String publisher, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}	
}
public class BookAPP {

	public static void main(String[] args) 
	{
		List<Book> bookList= new ArrayList<Book>();
		addBooks(bookList);
		System.out.println("Books Are : \n");
		System.out.println();
		for(Book b:bookList)
		{
			System.out.println(b.bookId+"\t "+b.author+"\t "+b.bookName+"\t "+b.publisher+"\t "+b.price);
		}
	}

	public static void addBooks(List<Book> bookList) {
		Scanner scan= new Scanner(System.in);
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
			Book book= new Book(id,bookName,author,publisher,price);
			bookList.add(book);
		}	
	}
}
