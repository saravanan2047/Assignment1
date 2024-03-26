package assignment8;

public class Movie 
{
	private String movieName;
	private int duration;
	private String director;
	private double budget;
	private int releaseYear;
	private static String genre ="Action";
	
	public Movie(String movieName, int duration, String director, double budget, int releaseYear) {
		super();
		this.movieName = movieName;
		this.duration = duration;
		this.director = director;
		this.budget = budget;
		this.releaseYear = releaseYear;
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public static String getGenre() {
		return genre;
	}
	public static void setGenre(String genre) {
		Movie.genre = genre;
	}
	public void getDetials()
	{
		System.out.println("Name of movie : "+movieName);
		System.out.println("Name of director : "+director);
		System.out.println("Duration of the movie : "+duration);
		System.out.println("Budget of the movie : "+budget);
		System.out.println("Release year : "+releaseYear);
		System.out.println("Movie Gener : "+genre);
		
	}
	

	

}
