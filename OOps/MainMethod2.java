
public class MainMethod2 
{
	public static void main(String[] args) 
	{
		Box b= new Box("Blue",12,"Books");
		b.cost=125;
		b.color="pink";
		System.out.println("Cost of the box is "+b.cost);
		// overriden methods
		b.open();
		b.close();
		b.show();
		b.clean();
		
		b.isStolen(); // box specific method
		
		b.content(); // interface method
		b.color();
		
		b.isTheft();//Pen inherited methods
		b.store();
		
		
		
	}

}
/*Cost of the box is 125
box is opened
Box is closed
The size of the box is:12 & color is pink
Box is clean
box is theft by robber and item lost is Books
Content of the boxes
Color of the box is : pink
Pen is theft
Pen stores ink
*/