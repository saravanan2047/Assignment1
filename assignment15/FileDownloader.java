package assignment15;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class FileDownloader extends Thread{

	private String urlLink;
    private String downloadePath;
    private boolean stat = false;
    
	public FileDownloader(String fileURL, String downloadePath){
		this.urlLink=fileURL;
		this.downloadePath=downloadePath;
	}
	
	@Override
	public void run() {
        try {
            URL url = new URL(urlLink);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int fileSize = connection.getContentLength();
 
            InputStream inputStream = connection.getInputStream();
            FileOutputStream outputStream = new FileOutputStream(downloadePath);

            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1 && !stat) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
                double progress = (double) totalBytesRead / fileSize * 100;
                System.out.printf("Download Progress: %.2f%%\n", progress);
            }

            outputStream.close();
            inputStream.close();

            if (stat) {
                System.out.println("Download interrupted.");
                File file = new File(downloadePath);
                if (file.exists()) {
                    file.delete();
                }
            } else {
            	Scanner scanner=new Scanner(System.in);
                System.out.println("\nDownload completed.");
                System.out.println("\nDo you want open?\n type yes or no");
                String option=scanner.next();
                if("YES".equalsIgnoreCase(option)) {
                	openFile();
                }
                else {
                	System.out.println("Thank you!");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void stopDownload() {
		stat = true;
        interrupt();
    }
	
	public void openFile() throws IOException {
		FileInputStream fileInput=new FileInputStream(downloadePath);
		Runtime runTime=Runtime.getRuntime();
		Process process=runTime.exec("cmd /c start "+downloadePath);
		fileInput.close();
	}
	
}