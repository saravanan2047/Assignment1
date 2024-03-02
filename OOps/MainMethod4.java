
public class MainMethod4 
{
	public static void main(String[] args) 
	{
		System.out.println("\n Class Pen:");
		Pen p= new Pen(5,"green");
		p.color="indigo";
		p.size=15;
		p.open();
		p.close();
		p.show();
		p.store();
		p.isTheft();
		p.clean();
		
		System.out.println("\n Class Box:");
		Box b= new Box("Blue",2,"Books");
		b.open();
		b.close();
		b.isStolen();
		b.show();
		
		System.out.println("\n Class Bag:");
		Bag g= new Bag("Red",1,"pencil",8);
		g.store();
		g.clean();
		g.open();
		g.close();
		g.dimension();
		g.clean();
	}

}
/*Class Pen:
The capacity of the pen :5
Pen is being closed
pen is writting and color is : green
Pen is displayed
Pen is theft

 Class Box:
Box is closed
box is theft by robber and item lost is Books
box is opened
THe size of the box is:2 & color is Blue

 Class Bag:
Bag is closed
Bag is cleaned
The capacity of the bag is 1and color is Red
The bag is opned and items are pencil
pen is writting and color is : indigo
*/