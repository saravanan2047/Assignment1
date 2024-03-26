package assignment8;

public class Book 
{
	private int isbn;
	private String title;
	private String author;
	private String journer;
	private int publishYear;
	private double price;
	private static float tax=0.08f;

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
	public void displayAll()
	{
		System.out.println("Book name :"+title);
		System.out.println("Author name : "+author);
		System.out.println("Book journer :"+journer);
		System.out.println("Publish year : "+publishYear);
		System.out.println("Cost of book : "+ getTotalCost());
	}
	

}
