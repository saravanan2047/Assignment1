package assignment17.deadlock;

public class DeadLock {
    public static void main(String[] args) {
    	
        final Doctor doctor  = new Doctor();
        final Patient patient = new Patient();

        Thread thread1 = new Thread(() -> {
        	doctor.treatment(patient);
        }, "Patient");

        Thread thread2 = new Thread(() -> {
           patient.cure(doctor);
        }, "Doctor");

      
        thread1.start();
        thread2.start();
    }
}
