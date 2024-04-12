package assignment14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student 
{
	int student_id;
	String name;
	int marks;
	
	public Student(int student_id, String name, int marks) {
		super();
		this.student_id = student_id;
		this.name = name;
		this.marks = marks;
	}
	
}
class IdSorting implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1, Student o2) 
	{
		int id1=o1.student_id;
		int id2=o2.student_id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return 1;
		else
			return 0;
	}
	
}
class NameSorting implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1, Student o2) 
	{
		String name1=o1.name;
		String name2=o2.name;
//		if(id1>id2)
//			return -1;
//		else if(id1<id2)
//			return 1;
//		else
//			return 0;
		return name1.compareTo(name2);
	}
	
}
class MarksSorting implements Comparator<Student>
{
	
	@Override
	public int compare(Student o1, Student o2) 
	{
		int marks1=o1.marks;
		int marks2=o2.marks;
		if(marks1<marks2)
			return -1;
		else if(marks1>marks2)
			return 1;
		else
			return 0;
	}
	
}
public class CustomSorting {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		List<Student> studentList= new ArrayList<Student>();
		System.out.println("Enter the number of students : ");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the name of student : ");
			String name=scan.next();
			System.out.println("Enter Student ID: ");
			int id=scan.nextInt();
			System.out.println("Enter student marks : ");
			int marks=scan.nextInt();
			Student s= new Student(id,name,marks);
			studentList.add(s);
		}
		System.out.println("Before Sorting ");
		for(Student s:studentList)
		{
			System.out.println(s.student_id+" \t"+s.name+"\t "+s.marks+"\n");
		}
		while(true) {
		System.out.println("Enter the porperty to which you want to sort: \n1) ID \n2) Name \n3) Marks \n4) Exit");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1: Collections.sort(studentList, new IdSorting());
		break;
		case 2: Collections.sort(studentList, new NameSorting());
		break;
		case 3: Collections.sort(studentList, new MarksSorting());
		break;
		case 4: break;
		default: System.out.println("Enter a valid option ..");
		}
		if(choice==4) break;
		System.out.println("After sorting ");
		for(Student s:studentList)
		{
			System.out.println(s.student_id+" \t"+s.name+"\t "+s.marks+"\n");
		}
		
		}
	}

}


