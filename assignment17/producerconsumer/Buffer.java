package assignment17.producerconsumer;


class Buffer 
{
private int data;
private boolean isEmpty = true;

public synchronized void put(int value) {
   while (!isEmpty) {
       try {
           wait();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }

   data = value;
   isEmpty = false;
   System.out.println("Produced: " + value);

   notify();
}

public synchronized int get() {
   while (isEmpty) {
       try {
           wait();
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }
   int value = data;
   isEmpty = true;
   System.out.println("Consumed: " + value);
   notify();
   return value;
}
}

