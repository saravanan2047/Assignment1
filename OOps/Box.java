
public class Box extends Pen implements function4
{	
	String item;
	int cost;
	public Box(String color, int size,String item) 
	{
		super(size, color);
		this.color = color;
		this.size = size;
		this.item=item;
	}
	public void open() // pen overriden
	{
		System.out.println("box is opened");
	}
	public void close() // pen overriden
	{
		System.out.println("Box is closed");
	}
	
	public void show() // pen overriden
	{
		System.out.println("The size of the box is:"+ size + " & color is "+color);
	}
	public void clean() // pen overriden 
	{
		System.out.println("Box is clean");
	}
	
	public void isStolen() // Box specific method
	{
		System.out.println("box is theft by robber and item lost is "+item);
	}
	@Override 
	public void content() // interface method
	{
		System.out.println("Content of the boxes");
		
	}
	@Override
	public void color() // interface method
	{
		System.out.println("Color of the box is : "+color);
		
	}

}
