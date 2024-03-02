public class Pen implements function1,function2,function3
{	
	int size;
	String color;
	
	public Pen(int size, String color) 
	{
		this.size = size;
		this.color = color;
	}
	public  void show() // pen class specific method
	{
		System.out.println("Pen is displayed");	
	}
	// Overridden methods 
	@Override
	public void open() // from interface function1
	{
		System.out.println("The capacity of the pen :"+size);
	}
	@Override
	public void close() // from interface function1
	{
		System.out.println("Pen is being closed");	
	}
	
	@Override
	public void isTheft() // from interface function2
	{
	System.out.println("Pen is theft");
		
	}
	@Override
	public void clean() // from interface function2
	{
		System.out.println("Pen is clean");	
	}
	@Override
	public void store() // from interface function3
	{
		System.out.println("Pen stores ink");
	}
}







