package assignment11.ums;

import assignment11.ums.course.Course;
import assignment11.ums.faculty.Faculty;
import assignment11.ums.student.Student;

public class UniversityMain {

	public static void main(String[] args) 
	{
		Course course1= new Course();
		course1.setCourseName("Fundamental of C++");
		course1.setNoOfUnits(8);
		course1.setWeightAge(6);
	
		Course course2= new Course();
		course2.setCourseName("Fundamental of JAVA");
		course2.setNoOfUnits(12);
		course2.setWeightAge(5);
		
		
		Student s1= new Student();
		s1.setcourseSelected(course1.getCourseName());
		s1.setName("Rajesh");
		s1.setYearOfStudy(2);
		
		Student s2= new Student();
		s2.setcourseSelected(course2.getCourseName());
		s2.setName("Rajesh");
		s2.setYearOfStudy(2);
		
		Student s3= new Student();
		s3.setcourseSelected(course1.getCourseName());
		s3.setName("Rajesh");
		s3.setYearOfStudy(2);
		
		course1.addStudent(s3);
		course1.addStudent(s2);
		course2.addStudent(s1);
		
		Faculty f1= new Faculty();
		f1.setDesignation("Assistance professor");
		f1.setMobileNo(8529639630l);
		f1.setName("Harish");
		f1.setCourse(course2);
		f1.setCourse(course1);
		
		Faculty f2= new Faculty();
		f2.setDesignation("Senior Professor");
		f2.setMobileNo(8569639630l);
		f2.setName("Ram lal");
		f2.setCourse(course2);	
		
		
	}

}
