package assignment17.synchronizationlearn;

class PrintJob implements Runnable {
    private Printer printer;
    private String documentName;

    public PrintJob(Printer printer, String documentName) {
        this.printer = printer;
        this.documentName = documentName;
    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            printer.printDocument(documentName + " - Copy " + (i + 1));
        }
    }
}
