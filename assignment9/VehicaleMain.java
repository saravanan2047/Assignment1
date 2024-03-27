package assignment9;


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
	public void work()
	{
		System.out.println("vehicle is used for ..");
	}
	public void display()
	{
		System.out.println(vehicleNumber+"\t"+numberOfWheels+"\t"+speed+"\t"+type);
	}
}
class Bus extends Vehicle
{
	public void moving()
	{
		System.out.println("Bus is moving\n");
	}
	public void work()
	{
		System.out.println("Bus is used for travel..");
	}
	
	
}
class Bike extends Vehicle
{
	public void moving()
	{
		System.out.println("Bike is moving\n");
	}
	public void work()
	{
		System.out.println("Bike is used for adventure.....");
	}
	
}
class Truck extends Vehicle
{
	public void moving()
	{
		System.out.println("Truck is moving\n");
	}
	public void work()
	{
		System.out.println("Truck is used for Carrying goods");
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
		bus.work();	
		bus.moving();
		bus.display();
		
		System.out.println();
		
		Bike bike= new Bike();
		bike.numberOfWheels=2;
		bike.speed=150;
		bike.type="petrol";
		bike.vehicleNumber=15963;
		bike.work();
		bike.moving();
		bike.display();
		
		System.out.println();
		
		Truck truck= new Truck();
		truck.numberOfWheels=8;
		truck.speed=160;
		truck.type="Diesle";
		truck.vehicleNumber=186453;
		truck.work();
		truck.moving();
		truck.display();
	}

}
