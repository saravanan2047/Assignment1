package assignment2;

import java.util.Scanner;

public class CelcuisToFarenheit {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Temperature in celcius :");
		double cel=scan.nextFloat();
		double far=(1.8*cel)+32;
		System.out.println("Temperature in Farenheit is : "+far);
	}

}
