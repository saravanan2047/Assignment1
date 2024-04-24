package test1;

import java.util.Scanner;

public class AlphabetPattern {
	   public static void main(String[] args) 
	    {
	    	Scanner scan= new Scanner(System.in);
	    	System.out.println("Enter the Character : ");
	    	char c=scan.next().charAt(0);
	        trianglePattern(c);
	    }
	    public static void trianglePattern(char cha) 
	    {
	        int n = cha - 'A' + 1;
	        char c = 'A';
	        for (int i = 1; i <= n; i++) 
	        {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            System.out.print(c);
	            if (i > 1) {
	                for (int j = 1; j <= 2 * i - 3; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print(c);
	            }
	            c++;
	            System.out.println();
	        }
	        c -= 2;
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            System.out.print(c);
	            if (i > 1) {
	                for (int j = 1; j <= 2 * i - 3; j++) {
	                    System.out.print(" ");
	                }
	                System.out.print(c);
	            }
	            c--;
	            System.out.println();
	        }
	    }
	}