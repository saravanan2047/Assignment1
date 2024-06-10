package assignment17.producerconsumer;

public class Main {
	 public static void main(String[] args) {
	     Buffer buffer = new Buffer();

	     Thread producer1 = new Thread(new Producer(buffer), "Producer-1");
	     Thread producer2 = new Thread(new Producer(buffer), "Producer-2");
	     Thread consumer1 = new Thread(new Consumer(buffer), "Consumer-1");
	     Thread consumer2 = new Thread(new Consumer(buffer), "Consumer-2");

	     producer1.start();
	     producer2.start();
	     consumer1.start();
	     consumer2.start();
	 }
}





