package assignment13.lms.members;

import java.util.ArrayList;
import java.util.List;

import assignment11.lms.books.Books;

public class Members 
{
	int userId;
	String name;
	String email;
	List<Books> userBookList= new ArrayList<Books>();
	
	
	public Members() {
		super();
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void addBooks(Books book)
	{
		userBookList.add(book);	
	}
	public List<Books> getUserBook()
	{
		return userBookList;
	}
	
	

}
