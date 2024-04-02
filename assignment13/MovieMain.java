package assignment13;

abstract class Movie
{
	String movieName;
	int duration;
	String director;
	double budget;
	int releaseYear;
	float ratings;
	
	public Movie(String movieName, int duration, String director, double budget, int releaseYear,float ratings)
	{
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.director = director;
		this.budget = budget;
		this.releaseYear = releaseYear;
		this.ratings=ratings;
	}
	abstract public void getDetails();
	abstract public void ticketPrice();
	abstract public void bookSeatNo();
}
class RomComMovie extends Movie
{
	int ticketesSold;
	public RomComMovie(String movieName, int duration, String director, double budget, int releaseYear,int ticketsSold,float ratings)
	{
		super(movieName, duration, director, budget, releaseYear,ratings);
		this.ticketesSold=ticketsSold;
	}
	public void getDetails()
	{
		System.out.println("Name of movie : "+movieName);
		System.out.println("Name of director : "+director);
		System.out.println("Duration of the movie : "+duration);
		System.out.println("Budget of the movie : "+budget);
		System.out.println("Release year : "+releaseYear);
		System.out.println(ratings);
		System.out.println("Total profit : "+profit());
	}
	public void movieRatings()
	{
		System.out.println(ratings);
	}
	public int profit()
	{
		return ticketesSold*120;
	}
	@Override
	public void ticketPrice() {

		System.out.println("The cost of the ticket is 120 $ per head.");
		
	}
	@Override
	public void bookSeatNo() {
		System.out.println("Seat was booked successfully...");
		
	}
	
}
class HorrorMovie extends Movie
{
	public HorrorMovie(String movieName, int duration, String director, double budget, int releaseYear,float ratings)
	{
		super(movieName, duration, director, budget, releaseYear,ratings);	
	}
	public void getDetails()
	{
		System.out.println("Name of movie : "+movieName+"\tName of director : "+director);
		System.out.println("Duration of the movie : "+duration+"\tBudget of the movie : "+budget+"\nRelease year : "+releaseYear);
	}
	@Override
	public void ticketPrice() {
		
		System.out.println("The cost of the ticket is 180 $ per head.");
	}
	@Override
	public void bookSeatNo() {
		System.out.println("Seat Number 12 was booked successfully...");
		
		
	}
}
class SciFiMovie extends Movie
{

	public SciFiMovie(String movieName, int duration, String director, double budget, int releaseYear,float ratings)
	{
		super(movieName, duration, director, budget, releaseYear,ratings);
	}
	public void getDetails()
	{
		System.out.println("Name of movie : "+movieName);
		System.out.println("Name of director : "+director);
		System.out.println("Duration of the movie : "+duration);
		System.out.println("Budget of the movie : "+budget);
		System.out.println("Release year : "+releaseYear);
//		System.out.println(getClass().getName());
	}
	@Override
	public void ticketPrice() {
		System.out.println("The cost of the ticket is 220 $ per head.");
		
	}
	@Override
	public void bookSeatNo() {
		System.out.println("Seat Number 21 & 23 was booked successfully...");
	}
	}

public class MovieMain
{
	public static void main(String[] args) 
	{
		HorrorMovie movie=new HorrorMovie("The ring",120,"Gore Verbinski",480000000.0,2002,3.5f);
		doActivity(movie);
		System.out.println();
		SciFiMovie movie2= new SciFiMovie("Interstellar",158,"Christopher Nolan",2000000000.0,2014,4.9f);
		doActivity(movie2);
		System.out.println();
		RomComMovie movie3= new RomComMovie("Crazy, Stupid, Love",118,"Glenn Ficarra",150000000,2011,15000000,3.2f);
		doActivity(movie3);
		
	}
	public static void  doActivity(Movie e)
	{
		e.getDetails();
		e.bookSeatNo();
		e.ticketPrice();
	}
}