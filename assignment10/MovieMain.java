package assignment10;

class Movie
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
	public void getDetails()
	{
		System.out.println("Name of movie : "+movieName);
		System.out.println("Name of director : "+director);
		System.out.println("Duration of the movie : "+duration);
		System.out.println("Budget of the movie : "+budget);
		System.out.println("Release year : "+releaseYear);
		System.out.println(ratings);
	}
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
	}

public class MovieMain
{
	public static void main(String[] args) 
	{
		Movie movie=new HorrorMovie("The ring",120,"Gore Verbinski",480000000.0,2002,3.5f);
		movie.getDetails();
		System.out.println();
		Movie movie2= new SciFiMovie("Interstellar",158,"Christopher Nolan",2000000000.0,2014,4.9f);
		movie2.getDetails();
		System.out.println();
		Movie movie3= new RomComMovie("Crazy, Stupid, Love",118,"Glenn Ficarra",150000000,2011,15000000,3.2f);
		movie3.getDetails();
	}
}