package assignment9;

import java.util.Scanner;

class Student 
{
	int id;
	String name;
	float marks;
	
	public Student() // zero parameter constructor
	{
		System.out.println("Zero parameter");
	} 
	
	public Student(String name)
	{	this();
		this.name=name;
		System.out.println("One parameter");
	}
	public Student(String name, float marks)
	{
		this(name);
		this.name=name;
		this.marks=marks;
		System.out.println("Two parameter");
	}
	public Student(int id, String name, float marks) {
		this(name,marks);
		this.id = id;
		this.name = name;
		this.marks = marks;
		System.out.println("three paramerete");
	}
	
}

class ZSGSStudent extends Student
{
	String email;

	public ZSGSStudent(int id, String name, float marks, String email) 
	{
		super(name,marks);
		this.email = email;
	}
	public ZSGSStudent(String name,float marks)
	{
		super(name);
		System.out.println("Child class");
	}

}

public class ParentChild {

	public static void main(String[] args) 
	{
		
		Student stud= new Student(42,"sam",156);
		ZSGSStudent zsgs= new ZSGSStudent(12,"sam",152,"sam2002@g,mail.com");
//		ZSGSStudent zsgs1=new Student(42,"sam",156);
		Student s1= new ZSGSStudent("Ram",192);
		System.out.println(s1.name+"\t"+s1.marks);
	}

}
