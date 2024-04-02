package assignment13;

import java.util.ArrayList;
import java.util.List;

abstract class Products
{
	String name;
	double price;
	String brand;
	int quantity;

	public Products(String name, double price, String brand, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.quantity=quantity;
	}
	
	public abstract double getPrice();
	public abstract void getDecription();
}
class ElectronicProducts extends Products
{
	public ElectronicProducts(String name, double price, String brand, int quantity) {
		super(name, price, brand, quantity);
	}

	public double getPrice() 
	{
		return price;
	}

	@Override
	public void getDecription() 
	{
		System.out.println("Product name is :"+name);
		System.out.println("Product belongs to brand : "+brand);
		System.out.println("Available quantity is : "+quantity);
	}
}
class ClothingProduct extends Products
{
	String size;

	public ClothingProduct(String name, double price, String brand, int quantity,String size) 
	{
		
		super(name, price, brand, quantity);
		this.size=size;
	}

	public double getPrice() 
	{
		return price;	
	}

	public void getDecription() {
		System.out.println("Product Material name is :"+name);
		System.out.println("Product belongs to brand : "+brand);
		System.out.println("Available quantity is : "+quantity);
		System.out.println("Clothe size is : "+size);
	}
	
}
class BookProducts extends Products
{
	String color;
	public BookProducts(String name, double price, String brand, int quantity, String color) {
		super(name, price, brand, quantity);
		this.color=color;
	}

	public double getPrice() 
	{
		return price;
	}

	@Override
	public void getDecription() {
		System.out.println("Book name is :"+name);
		System.out.println("Book belongs to Publisher : "+brand);
		System.out.println("Available quantity is : "+quantity);
		System.out.println("Book Cover color is : "+color);
	}
}
class ShoppingCart
{
	List<Products> productList=new ArrayList<>();
	public void add(Products p)
	{
		productList.add(p);
	}
	
}

public class ProductMain {

	public static void main(String[] args) 
	{
		Products electronic= new ElectronicProducts("Air Pods",2500,"Boat",1000);
		electronic.getDecription();
		System.out.println(electronic.name+" price is "+electronic.getPrice()+"\n");
		Products clothProducts= new ClothingProduct("Cotton",1625,"Allen Solley",1500,"M-L-XL-XLL");
		clothProducts.getDecription();
		System.out.println(clothProducts.name+" material price is "+clothProducts.getPrice()+"\n");
		Products bookProduct= new BookProducts("THE adventure",250,"Gilbert",1500,"Black & Grey");
		bookProduct.getDecription();
		System.out.println( bookProduct.name+"'s Book price is "+ bookProduct.getPrice()+"\n");
		ShoppingCart sc= new ShoppingCart();
		sc.add(bookProduct);
		sc.add(clothProducts);
		sc.add(electronic);
		int total=0;
		for(Products p : sc.productList )
		{
			total+=p.getPrice();
		}
		System.out.println("Total  cost of the products in the cart is : "+total);

	}

}
