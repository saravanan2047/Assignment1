
public class MainMethod5 {

	// creating objects with parent references and checking what methods can be invoked
	public static void main(String[] args) 
	{
		System.out.println("\n Box class with Bag reference: ");
		Pen p= new Box("hue",12,"pencil");
		p.color="Red";
		//p.isStolen();   ----> child specific  method is not invoked by parent refernce
		//p.color(); ------> Box interface method is not invoked by parent reference
		//p.content(); ------> Box interface method is not invoked by parent reference
		
		/* can be invoked by down casting*/
		((Box) p).color();
		((Box) p).content();
		((Box)p).isStolen();
		
		// invoking class Pen methods
		p.show(); // overriden
		p.open(); // overriden 
		p.close(); //overriden
		p.isTheft(); // not overriden by Box class only inherited
		p.clean(); //overriden
		p.store(); //not overriden by Box class only inherited
		
		System.out.println("\n\n");
		
		System.out.println("\n Bag class with Box reference: ");
		Box b= new Bag("Green",12,"Notes",5);
		b.cost=1200;
		
		//b.dimension();----> child specific  method is not invoked by parent refernce
		//b.write(); ------> Bag interface method is not invoked by parent reference
		//b.type(); ------> Bag interface method is not invoked by parent reference
		// p.b=25; unable to initialize child specific variable
		
		/* can be invoked by down casting*/
		((Bag) b).dimension();
		((Bag) b).write();
		((Bag) b).type();
		
		// invoking Box class methods
		b.open(); // overriden methods of Box
		b.clean(); // overriden methods of Box
		b.store(); // overriden methods of Box
		b.close(); // overriden methods of Box
		
		b.color(); // Box class interface methods only inherited
		b.content(); // Box class interface methods only inherited
		b.isStolen();// Box class specific methods only inherited
		
		b.show(); // pen overriden method At Box class inherited by Bag class
		b.isTheft(); // inhertied from pen class
			
		System.out.println("\n\n");
		
		Pen s= new Bag("Brown",14,"Games",6);
		//s.dimension();----> child specific  method is not invoked by super parent refernce
		//s.write(); ------> Bag interface method is not invoked by parent reference
		//s.type(); ------> Bag interface method is not invoked by parent reference
		//s.cost=250; unable to initialize child specific variable
			
		((Bag) s).dimension();
		((Bag) s).write();
		((Bag) s).type();
		
		s.open();// overriden methods of Bag
		s.clean();// overriden methods of Bag
		s.store();// overriden methods of Bag
		s.close();// overriden methods of Bag
		
		s.isTheft();// inherited to Pen class directly
		s.show();// overriden by Box class 
	
	}

}
/*Box class with Bag reference: 
Color of the box is : Red
Content of the boxes
box is theft by robber and item lost is pencil
The size of the box is:12 & color is Red
box is opened
Box is closed
Pen is theft
Box is clean
Pen stores ink




 Bag class with Box reference: 
The dimension of the bag is 5 X 5
Bag is written Quotes with Green color
Type of the bag is : school
The bag is opned and items are Notes
Bag is cleaned
The capacity of the bag is 12 and color is Green
Bag is closed
Color of the box is : Green
Content of the boxes
box is theft by robber and item lost is Notes
The size of the box is:12 & color is Green
Pen is theft



The dimension of the bag is 6 X 6
Bag is written Quotes with Brown color
Type of the bag is : school
The bag is opned and items are Games
Bag is cleaned
The capacity of the bag is 14 and color is Brown
Bag is closed
Pen is theft
The size of the box is:14 & color is Brown
*/