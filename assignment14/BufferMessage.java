package assignment14;

import java.util.ArrayList;
import java.util.Scanner;

class Buffer
{
	int size;
	ArrayList<String> message;
	int count=0;
	public Buffer(int size)
	{
		this.size=size;
		message=new ArrayList<>(size);
	}
	public void addMessage(String s)
	{
		if(message.size()>=size)
			message.set(count,s);
		else
			message.add(s);
		count=(count+1)%size;
	}
	public void displayMessage()
	{
		for(String s:message)
		{
			System.out.print(s+" ");
		}
	}
}
public class BufferMessage {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Max Size: ");
		int num=scan.nextInt();
		
		Buffer buffer= new Buffer(num);
		buffer.addMessage("HI");
		buffer.addMessage("There");
		buffer.addMessage("Welcome");
		buffer.addMessage("To");
		buffer.addMessage("Learn");
		buffer.addMessage("Java");
	
		buffer.displayMessage();
		

	}

}
