
public class MainMethod1 {

	public static void main(String[] args) 
	{
				Pen p= new Pen(5,"green");
				System.out.println("\n Class Pen:");
				p.color="indigo";
				p.size=7;
				p.store();
				p.open();
				p.close();
				p.show();
				p.isTheft();
				p.clean();
	}

}
/*Class Pen:
Pen stores ink
The capacity of the pen :7
Pen is being closed
Pen is displayed
Pen is theft
Pen is clean*/
