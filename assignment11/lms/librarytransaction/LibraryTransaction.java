package assignment11.lms.librarytransaction;

import java.util.ArrayList;
import java.util.List;

import assignment11.lms.books.Books;
import assignment11.lms.members.Members;

public class LibraryTransaction 
{
	private static int libraryId;
	private static String libraryName;
	private static long libraryMobileNo;
	private static LibraryTransaction library;
	private static List<Books> bookList=new ArrayList<Books>();
	private static List<Members> memberList= new ArrayList<Members>();
	
	private LibraryTransaction()
	{
		super();
	}public static LibraryTransaction getInstance()
	{
		if(library==null)
		{
			library=new LibraryTransaction();
		}
		return library;
	}
	
	public int getLibraryId() {
		return libraryId;
	}
	public  void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public long getLibraryMobileNo() {
		return libraryMobileNo;
	}
	public void setLibraryMobileNo(long libraryMobileNo) {
		this.libraryMobileNo = libraryMobileNo;
	}
	public void addBooks(Books book)
	{
		bookList.add(book);
	}
	public List<Books> getBooks()
	{
		return bookList;
	}
	public void addMembers(Members member)
	{
		memberList.add(member);
	}
	public List<Members> getMembers()
	{
		return memberList;
	}
	
}
