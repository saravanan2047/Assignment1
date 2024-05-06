package assignment15;

public class ProducerConsumer {

	public static void main(String[] args) {
		        Buffer buffer = new Buffer(5); 

		        Producers producer = new Producers(buffer);
		        Consumers consumer = new Consumers(buffer);

		        producer.start();
		        consumer.start();
	}
}
