package assignment11.lms.books;

public class Books 
{
	int boodId;
	String bookName;
	String Author;
	String Publisher;
	
	public Books() 
	{
		super();	
	}
	public Books(int boodId, String bookName, String author, String publisher) {
		this.boodId = boodId;
		this.bookName = bookName;
		Author = author;
		Publisher = publisher;
	}
	public int getBoodId() {
		return boodId;
	}
	public void setBoodId(int boodId) {
		this.boodId = boodId;
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
