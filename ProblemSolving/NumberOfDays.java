package ProblemSolving;

import java.time.LocalDate;
import java.util.Scanner;

public class NumberOfDays {

//	public static void main(String[] args) 
//	{
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the first date in DD:MM:YY format: ");
//		String date1=scan.next();
//		System.out.println("Enter the second date in DD:MM:YY format : ");
//		String date2=scan.next();
//		
//
//	}
	    public static void main(String[] args) {
	        LocalDate date1 = LocalDate.of(2000, 2, 10);
	        LocalDate date2 = LocalDate.of(2012, 2, 10);
	        System.out.println(daysBetweenDates(date1, date2));
	    }

	    public static long daysBetweenDates(LocalDate date1, LocalDate date2) {
	        long jdn1 = calculateJulianDayNumber(date1);
	        long jdn2 = calculateJulianDayNumber(date2);
	        return Math.abs(jdn2 - jdn1);
	    }

	    public static long calculateJulianDayNumber(LocalDate date) {
	        int year = date.getYear();
	        int month = date.getMonthValue();
	        int day = date.getDayOfMonth();
//	        System.out.println(year+" "+month+" "+day);

	        if (month <= 2) {
	            year--;
	            month += 12;
	        }

	        int A = year / 100;
	        int B = 2 - A + (A / 4);

	        long jdn = (long) (365.25 * (year + 4716)) + (int) (30.6001 * (month + 1)) + day + B - 1524;

	        return jdn;
	    
	}
/*import java.util.Scanner;

public class CalculateDateDifference {

    static int monthDays[] = { 31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31 };

    public static void main(String[] args) {
        int date1[] = new int[3];
        int date2[] = new int[3];
        System.out.println("Enter the first date");
        date1 = getInput();
        System.out.println("Enter the Second date");
        date2 = getInput();

        int totalDays = getDifference(date1, date2);

        System.out.println(totalDays);
    }

    public static int[] getInput()

    {
        int[] dt = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in the given date");
        dt[0] = sc.nextInt();
        System.out.println("Enter the month  in the given date");
        dt[1] = sc.nextInt();
        System.out.println("Enter the year in the given date");
        dt[2] = sc.nextInt();
        return dt;
    }

    static int countLeapYears(int[] d) {
        int years = d[2];

        if (d[1] <= 2) {
            years--;
        }

        return years / 4 - years / 100 + years / 400;
    }

    public static int getDifference(int[] date1, int[] date2) {
        int n1 = date1[2] * 365 + date1[0];
        for (int i = 0; i < date1[1] - 1; i++) {
            n1 += monthDays[i];
        }
        n1 += countLeapYears(date1);

        int n2 = date2[2] * 365 + date2[0];
        for (int i = 0; i < date2[1] - 1; i++) {
            n2 += monthDays[i];
        }
        n2 += countLeapYears(date2);
        return n2 - n1;
    }
}*/

}
