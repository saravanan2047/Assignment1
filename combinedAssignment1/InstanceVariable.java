package combinedAssignment1;

public class InstanceVariable 
{

	public static void main(String[] args) 
	{
		Product p= new Product((byte)12,(short)124,12586,98125897463l,12.5636f,12.3654795,'A',true,"JAVA");
		System.out.println("Byte value of instance variable is      "+p.byteNum);
		
		System.out.println("Short value of instance variable is     "+p.shortNum);
		
		System.out.println("Integer value of instance variable is   "+p.intNum);
		
		System.out.println("Long value of instance variable is      "+p.longNum);
		
		System.out.println("Float value of instance variable is     "+p.floatNum);
		
		System.out.println("Double value of instance variable is     "+p.doubleNum);
		
		System.out.println("Character value of instance variable is  "+p.ch);
		
		System.out.println("Boolean value of instance variable is    "+p.bool);
		
		System.out.println("String value of instance variable is     "+p.name);
		
		
		

	}

}
class Product
{
	byte byteNum;
	short shortNum;
	int intNum;
	long longNum;
	float floatNum;
	double doubleNum;
	char ch;
	boolean bool;
	String name;
	public Product(byte byteNum, short shortNum, int intNum, long longNum, float floatNum, double doubleNum, char ch,
			boolean bool, String name) {
		super();
		this.byteNum = byteNum;
		this.shortNum = shortNum;
		this.intNum = intNum;
		this.longNum = longNum;
		this.floatNum = floatNum;
		this.doubleNum = doubleNum;
		this.ch = ch;
		this.bool = bool;
		this.name = name;
	}
	
}