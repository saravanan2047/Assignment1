package assignment9;


class Shapes // parent class
{
	protected int side1;
	protected int side2;
	double area;
	
	Shapes(int side1)
	{
		this.side1=side1;
	}
	
	Shapes(int side1,int side2)
	{
		this.side1=side1;
		this.side2=side2;
	}
	void displayArea()
	{
		System.out.println("Area is : "+area);
	}
	void findArea()
	{
		
	}
}

class Square extends Shapes //Child class 1
{
	Square(int side)
	{
		super(side);
	}
	void findArea()
	{
		area=side1*side1;
	}
}
class Rectangle extends Shapes  //Child class 2
{
	Rectangle(int length,int breadth)
	{
		super(length,breadth);
	}
	void findArea()
	{
		area=(side1*side2);
	}
}
class Circle extends Shapes  //Child class 3
{
	Circle(int side1)
	{
		super(side1);
	}
	void findArea()
	{
		area=(2*Math.PI*side1*side1);
	}
}
class Triangel extends Shapes   //Child class 4
{
	Triangel(int base,int height)
	{
		super(base,height);
	}
	void findArea()
	{
		area=(0.5*side1*side2);
	}
}
public class ClassShapes {

	public static void main(String[] args) 
	{
		
		Shapes shape1= new Square(4);
		findArea(shape1);
		
		Shapes shape2= new Rectangle(4,6);
		findArea(shape2);
		
		Shapes shape3= new Circle(5);
		findArea(shape3);
		
		Shapes shape4= new Triangel(5,10);
		findArea(shape4);
	}
	public static void findArea(Shapes s)
	{
		s.findArea();
		s.displayArea();
	}

}
