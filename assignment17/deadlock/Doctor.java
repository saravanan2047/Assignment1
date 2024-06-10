package assignment17.deadlock;

public class Doctor {
	 public void treatment(Patient patient) {
	        synchronized(this) {
	            System.out.println(Thread.currentThread().getName() + " locked Doctor");
	            try {
	                Thread.sleep(100);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            System.out.println(Thread.currentThread().getName() + " trying to lock patient");
	            synchronized(patient) {
	                System.out.println(Thread.currentThread().getName() + " locked patient");
	            }
	        }
	    }

}
