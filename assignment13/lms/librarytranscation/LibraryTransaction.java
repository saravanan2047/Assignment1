package assignment13.lms.librarytranscation;

import java.util.ArrayList;
import java.util.List;
import assignment13.lms.book.Books;
import assignment13.lms.librarian.Librarian;
import assignment13.lms.members.Members;

public class LibraryTransaction 
{
	private static int libraryId;
	private static String libraryName;
	private static long libraryMobileNo;
	private static LibraryTransaction library;
	private static List<Books> bookList=new ArrayList<Books>();
	private static List<Members> memberList= new ArrayList<Members>();
	private static List<Librarian> librarianList= new ArrayList<Librarian>();
	
	
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
	public void addMembers(Members memb)
	{
		memberList.add(memb);
	}
	public List<Members> getMembers()
	{
		return memberList;
	}
	public void addLibrarian(Librarian librarian)
	{
		librarianList.add(librarian);
	}
	public List<Librarian> getLibrarian()
	{
		return librarianList;
	}	
}
