package assignment10;

class Employee
{
	 int empId;
	 String name;
	 String email;
	 static String company="Zoho";
	
	public Employee(int empId, String name, String email) 
	{
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
	}	
	public void getEmployeeDetails()
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
	public HourlyEmployee(int empId, String name, String email, int hours,String type) 
	{
		super(empId, name, email);
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
		System.out.println("Employee salary :"+salaryAmount(hours)+" rupees");
	}
	public double salaryAmount(int hour)
	{
		return hour*100;
	}
	
}
class SalariedEmployee extends Employee
{
	double salary;
	public SalariedEmployee(int empId, String name, String email, double salary)
	{
		super(empId, name, email);	
		this.salary=salary;
	}
	public void getEmployeeDetails() // method overriding
	{
		System.out.println("NAME of the employee :"+name);
		System.out.println("Employee id : "+empId);
		System.out.println("Employee email : "+email);
		System.out.println("Employee's Monthly Salary is : "+salary);
	}
}
public class EmployeeMain
{
	public static void main(String[] args) 
	{		
		getDetails(new HourlyEmployee(12,"Rakesh","rakesh2000@gmial.com",10,"Hourly"));
		getDetails(new SalariedEmployee(186,"Mahesh","Mahesh2006@yahoo.com",650560.25));
	}
	static void getDetails(Employee e)
	{
		e.getEmployeeDetails();
		System.out.println();
	}
}
