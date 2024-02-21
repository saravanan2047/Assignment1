package assignment2;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the weight in KGs : ");
		float weight=scan.nextFloat();
		System.out.println("Enter the heights in MTRs : ");
		float height=scan.nextFloat();
		
		float bmi=weight/(height*height);
		System.out.println("The BMI for the given weight and heigth is : "+bmi+" Kg/m2");

	}

}
