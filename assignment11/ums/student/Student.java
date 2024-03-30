package assignment11.ums.student;

public class Student 
{
	private String name;
	private int yearOfStudy;
	private String courseSelected;
	
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	public String getcourseSelected() {
		return courseSelected ;
	}
	public void setcourseSelected(String courseSelected) {
		this.courseSelected = courseSelected;
	}
}
