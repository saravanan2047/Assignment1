package assignment11.ums.faculty;

import java.util.List;

import assignment11.ums.course.Course;

public class Faculty 
{
	private String name;
	private String designation;
	private long mobileNo;
	private List<Course> courseList;

	public Faculty() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void setCourse(Course c)
	{
		courseList.add(c);
	}
	public List<Course> getCourse()
	{
		return  courseList;
	}
	

}
