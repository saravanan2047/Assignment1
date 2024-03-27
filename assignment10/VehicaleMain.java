package assignment10;


class Vehicle
{
	int vehicleNumber;
	int numberOfWheels;
	int speed;
	String  type;
	
	
	public void moving()
	{
		System.out.println("Vehicel is moving");	
	}
	public void stop()
	{
		System.out.println("vehicle is Stopped ..");
	}
	public void display()
	{
		System.out.println("Details--> vehicle Number:\t"+numberOfWheels+"\t Speed : "+speed+"\t Type : "+type);
	}
}
class Bus extends Vehicle
{
	public void moving()
	{
		System.out.println("Bus is moving\n");
	}
	public void stop()
	{
		System.out.println("Bus is Stopped..\n");
	}
	
	
}
class Bike extends Vehicle
{
	public void moving()
	{
		System.out.println("Bike is moving\n");
	}
	public void stop()
	{
		System.out.println("Bike is Stopped\n");
	}
	
}
class Truck extends Vehicle
{
	public void moving()
	{
		System.out.println("Truck is moving\n");
	}
	public void stop()
	{
		System.out.println("Truck is Stopped\n");
	}
	
}
public class VehicaleMain {

	public static void main(String[] args) 
	{
		Bus bus= new Bus();
		bus.numberOfWheels=4;
		bus.speed=120;
		bus.type="diesel";
		bus.vehicleNumber=105471;
		bus.moving();
		bus.stop();	
		bus.display();
		
		System.out.println();
		
		Bike bike= new Bike();
		bike.numberOfWheels=2;
		bike.speed=150;
		bike.type="petrol";
		bike.vehicleNumber=15963;
		bike.moving();
		bike.stop();
		bike.display();
		
		System.out.println();
		
		Truck truck= new Truck();
		truck.numberOfWheels=8;
		truck.speed=160;
		truck.type="Diesle";
		truck.vehicleNumber=186453;
		truck.moving();
		truck.stop();
		truck.display();
	}

}
