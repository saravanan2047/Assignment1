
public class Bag extends Box implements  function5
{

	String item;
	int d;
	String ty="school";
	public Bag(String color, int size,String item, int d) 
	{
		super(color, size, item);
		this.color = color;
		this.size = size;
		this.item=item;	
		this.d=d;
	}
	
	public void store() // inherited method from Box
	{
		System.out.println("The capacity of the bag is "+size+ " and color is "+color);
	}
	public void clean() // inherited method from Box
	{
		System.out.println("Bag is cleaned");
	}
	public void open() // inherited method from Box
	{
		System.out.println("The bag is opned and items are "+item);
	}
	public void close() // inherited method from Box
	{
		System.out.println("Bag is closed");
	}
	
	public void dimension()// Bag  class specific method
	{
		System.out.println("The dimension of the bag is "+d+" X "+d);
	}
	
	@Override
	public void write() // Interface method
	{
		System.out.println("Bag is written Quotes with "+ color + " color");
	}
	@Override
	public void type() // Interface method
	{
		System.out.println("Type of the bag is : "+ty);
		
	}
	
	
	

	

}
