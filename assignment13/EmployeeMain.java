package assignment13;

abstract class Employee
{
	 int empId;
	 String name;
	 String email;
	 static String company="Zoho";
	 
	 
	public Employee(int empId, String name, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
	}

	abstract void calculatePay(); //abstract Method
	
	public void getEmployeeDetails() // Concrete Method
	{
		System.out.println("NAME of the employee :"+name);
		System.out.println("Employee id : "+empId);
		System.out.println("Employee email : "+email);	
	}	
}

class HourlyEmployee extends Employee
{
	int hours;
	String type;
	public HourlyEmployee(int empId, String name, String email, int hours,String type,int id) 
	{
		super(empId,name,email);
		this.hours=hours;
		this.type=type;
	}
	public void getEmployeeDetails()// override method
	{
		System.out.println("NAME of the employee :"+name);
		System.out.println("Employee id : "+empId);
		System.out.println("Employee email : "+email);
		System.out.println("Employee type is : "+type);	
		System.out.println("Employee Worked for : "+hours);
	
	}
	public void calculatePay() 
	{
		System.out.println("Employee Daily salary :"+(double)hours*100+" rupees");
		
	}
}
class SalariedEmployee extends Employee
{
	double salary;
	public SalariedEmployee(int empId, String name, String email, double salary)
	{
		super(empId,name,email);
		this.empId=empId;
		this.salary=salary;
	}
	public void getEmployeeDetails() // method overriding
	{
		System.out.println("NAME of the employee :"+name);
		System.out.println("Employee id : "+empId);
		System.out.println("Employee email : "+email);
		System.out.println("Employee's Monthly Salary is : "+salary);
		
	}
	
	public void calculatePay() {
		System.out.println("Employee's annual salary is : "+ (12*salary));
	}
}
public class EmployeeMain
{
	public static void main(String[] args) 
	{		
		getDetails(new HourlyEmployee(12,"Rakesh","rakesh2000@gmial.com",10,"Hourly",104));
		getDetails(new SalariedEmployee(186,"Mahesh","Mahesh2006@yahoo.com",650560.25));
	}
	static void getDetails(Employee e)
	{
		e.getEmployeeDetails();
		e.calculatePay();
		System.out.println();
	}
}
