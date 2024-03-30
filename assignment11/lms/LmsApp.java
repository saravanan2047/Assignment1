package assignment11.lms;

import java.util.Arrays;

import assignment11.lms.books.Books;
import assignment11.lms.library.Library;
import assignment11.lms.members.Members;

public class LmsApp {

	public static void main(String[] args) 
	{
		Library.getInstance().setLibraryName("ZSGS LIBRARY");
		Library.getInstance().setLibraryMobileNo(8529631456l);
		Library.getInstance().setLibraryId(897);
		
		Books book1= new Books();
		book1.setAuthor("James Allen");
		book1.setBoodId(568);
		book1.setBookName("AS a man Thinkth");
		book1.setPublisher("Hills");
		Books book2= new Books();
		book2.setAuthor("J.K Rowlin");
		book2.setBoodId(568);
		book2.setBookName("Harry Potter");
		book2.setPublisher("Bloomsbury Publishing ");
		
		Library.getInstance().addBooks(book1);
		Library.getInstance().addBooks(book2);
		Members memb1= new Members();
		memb1.setEmail("sam2002@gmail.com");
		memb1.setName("Sam");
		memb1.setUserId(101);
		memb1.addBooks(book2);
		Members memb2= new Members();
		memb2.setEmail("James2000@gmail.com");
		memb2.setName("James");
		memb2.setUserId(102);
		memb2.addBooks(book1);
		Library.getInstance().addMembers(memb2);
		Library.getInstance().addMembers(memb1);
		
		for(Members m: Library.getInstance().getMembers())
		{
			System.out.println(m.getName()+" "+m.getEmail()+" "+m.getUserId()+" "+m.getUserBook().get(0).getBookName());
		}

	}

}
