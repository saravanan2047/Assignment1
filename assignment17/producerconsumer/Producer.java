package assignment17.producerconsumer;


class Producer implements Runnable {
private Buffer buffer;

public Producer(Buffer buffer) {
   this.buffer = buffer;
}

@Override
public void run() {
   for (int i = 0; i < 10; i++) {
       buffer.put(i);
       try {
           // Sleep to simulate time taken to produce
           Thread.sleep((int)(Math.random() * 100));
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
}
}