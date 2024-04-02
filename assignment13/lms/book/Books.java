package assignment13.lms.book;

public class Books 
{
	int bookId;
	String bookName;
	String Author;
	String Publisher;
	
	public Books() 
	{
		super();	
	}
	public Books(int bookId, String bookName, String author, String publisher) {
		this.bookId = bookId;
		this.bookName = bookName;
		Author = author;
		Publisher = publisher;
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
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	

}
