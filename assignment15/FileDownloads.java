package assignment15;


import java.util.Scanner;
public class FileDownloads {
	 	public static void main(String[] args) {
	 		Scanner scanner=new Scanner(System.in);
	 		
	 		System.out.println("Paste File Download link ");
	 		String urlLink = scanner.nextLine();
	 		
	 		System.out.println("Keep the path ...");
	        String downloadePath = scanner.nextLine();

	        FileDownloader downloader = new FileDownloader(urlLink, downloadePath);
	        downloader.start();

	        try 
	        {
	            Thread.sleep(10500);
	            downloader.stopDownload();
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	}
}
