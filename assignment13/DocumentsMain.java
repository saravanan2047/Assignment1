package assignment13;


abstract class Document
{
	
	public abstract void documentSize(int x);
	public abstract void documentType();
	public  void documentLocation() {
		System.out.println("Document is present in the default loaction i.e. Drive D");
	}
}
class PdfDocument extends Document
{
	
	
	public void documentSize(int size) 
	{
		System.out.println("Document size is "+size+"Kb");
	}

	public void documentType() 
	{
		System.out.println("Document type is PDF");	
	}
}
class ImageDocument extends Document
{
	public void documentSize(int size) {
		System.out.println("Document size is "+size+"Kb");
	}

	@Override
	public void documentType() {
		System.out.println("Document type is IMAGE");	
	}

	
	
}
class TextDocument extends Document
{

	public void documentSize(int size) {
		System.out.println("Document size is "+size+"Kb");
	}

	@Override
	public void documentType() {
		System.out.println("Document type is TEXT");	
	}

	
}
public class DocumentsMain 
{
	public static void main(String[] args) 
	{
		display(new PdfDocument(),1215);
		display(new TextDocument(),215);
		display(new ImageDocument(),715);	
	}
	public static void display(Document p, int size)
	{
		p.documentType();
		p.documentSize(size);
		System.out.println();
	}

}
