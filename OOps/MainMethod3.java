
public class MainMethod3 
{

	public static void main(String[] args) 
	{
		Bag g= new Bag("black",10,"books", 6);
		g.color="white";
		
		// Interface method function5
		g.write();
		g.type();
		
		g.dimension(); // Bag specific method
		
		g.color(); // Box interface method not inherited
		g.content();// Box Interface method not inherited
		
		g.isStolen();// Box Specific  method but not inherited
		
		g.open(); // overriden method
		g.clean();// overriden method
		g.close();// overriden method
		g.store();// overriden method
		g.show(); // pen inherited method overriden by Box
		g.isTheft();// pen inherited method

		

	}

}
/*Bag is written with white color
Type of the bag is : school
The dimension of the bag is 0 X 0
Color of the box is : white
Content of the boxes
box is theft by robber and item lost is books
The bag is opned and items are books
Bag is cleaned
Bag is closed
The capacity of the bag is 10 and color is white
The size of the box is:10 & color is white
Pen is theft
*/
