package assignment17.synchronizationlearn;

public class SynchronizedPrinter {
	public static void main(String[] args) {
		Printer printer = new Printer();

		Thread thread1 = new Thread(new PrintJob(printer, "Document1"));
		Thread thread2 = new Thread(new PrintJob(printer, "Document2"));
		Thread thread3 = new Thread(new PrintJob(printer, "Document3"));
		
		thread1.setName("T1");	
		thread2.setName("T2");	
		thread3.setName("T3");	
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
