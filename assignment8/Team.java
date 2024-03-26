package assignment8;

public class Team 
{
	String name;
	String city;
	String division;
	private Player player;
	
	
	
	public Team(String name, String city, String division, Player player)
	{
		super();
		this.name = name;
		this.city = city;
		this.division = division;
		this.player = player;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void play()
	{
		System.out.println("The team is playing the match");
		
	}
	public void hireCoach(String coachName)
	{
		System.out.println("The team hires a new coach"+coachName);
	}

}
