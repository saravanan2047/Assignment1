package assignment10;


class Shapes // parent class
{
	protected int side1;
	protected int side2;
	double area;
	double perimeter;
	String shape;
	
	Shapes(int side1, String shape)
	{
		this.side1=side1;
		this.shape=shape;
	}
	
	Shapes(int side1,int side2,String shape)
	{
		this.side1=side1;
		this.side2=side2;
		this.shape=shape;
	}
	void displayArea()
	{
		System.out.println("Area of "+shape+" is : "+area);
	}
	void displayPerimeter()
	{
		System.out.println("Perimeter of "+shape+"  is : "+perimeter+"\n");
	}
	void findArea()
	{
		
	}
	void findPerimeter()
	{
		
	}
}

class Square extends Shapes //Child class 1
{
	Square(int side,String shape)
	{
		super(side,shape);
	}
	void findArea()
	{
		area=side1*side1;
	}
	void findPerimeter()
	{
		perimeter=4*side1;
	}
}
class Rectangle extends Shapes  //Child class 2
{
	Rectangle(int length,int breadth,String shape)
	{
		super(length,breadth,shape);
	}
	void findArea()
	{
		area=(side1*side2);
	}
	void findPerimeter()
	{
		perimeter=2*(side1+side2);
	}

}
class Circle extends Shapes  //Child class 3
{
	Circle(int radius,String shape)
	{
		super(radius,shape);
	}
	void findArea()
	{
		area=(2*Math.PI*side1*side1);
	}
	void findPerimeter()
	{
		perimeter=2*Math.PI*side1;
	}
}
class Triangel extends Shapes   //Child class 4
{
	Triangel(int base,int height,String shape)
	{
		super(base,height,shape);
	}
	void findArea()
	{
		area=(0.5*side1*side2);
	}
	void findPerimeter() // considering equilateral triangle
	{
		perimeter=3*side1;
	}
}
public class ClassShapes {

	public static void main(String[] args) 
	{
		
		Shapes shape1= new Square(4,"square");
		findArea(shape1);
		
		Shapes shape2= new Rectangle(4,6,"rectangle");
		findArea(shape2);
		
		Shapes shape3= new Circle(5,"circle");
		findArea(shape3);
		
		Shapes shape4= new Triangel(5,10,"triangle");
		findArea(shape4);
	}
	public static void findArea(Shapes s)
	{
		s.findArea();
		s.findPerimeter();
		s.displayArea();
		s.displayPerimeter();
	}

}
