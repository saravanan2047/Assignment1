package assignment17.producerconsumer;

class Consumer implements Runnable {
	 private Buffer buffer;

	 public Consumer(Buffer buffer) {
	     this.buffer = buffer;
	 }

	 @Override
	 public void run() {
	     for (int i = 0; i < 10; i++) {
	         buffer.get();
	         try {
	             Thread.sleep((int)(Math.random() * 100));
	         } catch (InterruptedException e) {
	             e.printStackTrace();
	         }
	     }
	 }
	}
