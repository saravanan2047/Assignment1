package assignment8;

public class Flight 
{
	private int flightId;
	private String flightName;
	private String engineType;
	private int noOfSeats;
	private static String manufacturer="Airbus";
	private static String commonBeverages="Water";
	private static int noOfPilots=2;
	
	
	
	public Flight(int flightId, String flightName, String engineType, int noOfseats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.engineType = engineType;
		this.noOfSeats = noOfseats;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getNoOfseats() {
		return noOfSeats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfSeats = noOfseats;
	}
	public static String getManufacturer() {
		return manufacturer;
	}
	public static String getCommonBeverages() {
		return commonBeverages;
	}
	public static int getNoOfPilots()
	{
		return noOfPilots;
	}
	
	public void details()
	{
		
	System.out.println("Airplane name :"+flightName);
	System.out.println("Airplane seat capacity : "+noOfSeats);
	System.out.println("Airplane engine type:"+engineType);
	System.out.println("Airplane id"+flightId);
	System.out.println("Airplane Manufacturer : "+manufacturer);
	System.out.println("Airplane beverage : "+commonBeverages);
	System.out.println("Number of pilots : "+noOfPilots);
	
	}
	
	
	
	

}
