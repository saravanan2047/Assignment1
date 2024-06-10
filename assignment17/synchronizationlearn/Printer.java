package assignment17.synchronizationlearn;

class Printer {
	
    public void printDocument(String documentName) {

        synchronized(this) {
            System.out.println(Thread.currentThread().getName() + " is printing document: " + documentName);
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has finished printing document: " + documentName);
        }
    }
}


