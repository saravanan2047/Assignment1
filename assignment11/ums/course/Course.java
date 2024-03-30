package assignment11.ums.course;

import java.util.List;

import assignment11.ums.student.Student;

public class Course 
{
	private String courseName;
	private int weightAge;
	private int noOfUnits;
	private List<Student> studentList;
	
	
	public Course() {
		super();
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getWeightAge() {
		return weightAge;
	}
	public void setWeightAge(int weightAge) {
		this.weightAge = weightAge;
	}
	public int getNoOfUnits() {
		return noOfUnits;
	}
	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}
	public void addStudent(Student stud)
	{
		studentList.add(stud);
	}
	public List<Student> getStudent()
	{
		return studentList;
	}
	
	

}
