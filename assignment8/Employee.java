package assignment8;

public class Employee
{
	private int empId;
	private String name;
	private double salary;
	private String email;
	
	private static String company="Zoho";
	private static double pf=1500;

	
	
	public Employee(int empId, String name, double salary, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Employee.company = company;
	}
	
	public void getDetails()
	{
		System.out.println("NAME of the employee :"+name);
		System.out.println("Salary of the emoloyee : "+salary);
		System.out.println("Employee id : "+empId);
		System.out.println("Employee email : "+email);
		
	}
	public double finalSalary()
	
	{
		return salary-pf;
	}
	
	
	




}
