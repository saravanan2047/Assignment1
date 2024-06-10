package assignment17.deadlock;

public class Patient {
	 public void cure(Doctor doctor) {
	        synchronized(this) {
	            System.out.println(Thread.currentThread().getName() + " locked Patient");
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println(Thread.currentThread().getName() + " trying to lock Doctor");
	            synchronized(doctor) {
	                System.out.println(Thread.currentThread().getName() + " locked Doctor");
	            }
	        }
	    }

}
