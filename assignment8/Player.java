package assignment8;

public class Player 
{
	private int jearsyNumber;
	private String name;
	private String position;

	public Player(int jearsyNumber, String name, String position) {
		super();
		this.jearsyNumber = jearsyNumber;
		this.name = name;
		this.position = position;
		
	}
	
	public int getJearsyNumber() {
		return jearsyNumber;
	}
	public void setJearsyNumber(int jearsyNumber) {
		this.jearsyNumber = jearsyNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	void playGame()
	{
		System.out.println("The player is playing the game");
	}
	void train()
	{
		System.out.println("The player is under training");
	}
}
