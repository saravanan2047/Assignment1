package zohoTask2;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class TrainDeparture 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Train Trips for A & B");

        int NA = scanner.nextInt();
        int NB = scanner.nextInt();

        String[][] trips_AB = new String[NA][2];
        String[][] trips_BA = new String[NB][2];
        
        for (int i = 0; i < NA; i++) 
        {
        	System.out.println("Enter the departure time from A in HH:MM format :");
            trips_AB[i][0] = scanner.next();
            System.out.println("Enter the Arrival time at B  in HH:MM format:");
            trips_AB[i][1] = scanner.next();
        }

        for (int i = 0; i < NB; i++) 
        {
        	System.out.println("Enter the departure time from B  in HH:MM format:");
            trips_BA[i][0] = scanner.next();
            System.out.println("Enter the Arrival time at A  in HH:MM format:");
            trips_BA[i][1] = scanner.next();
        }

        calculateTrainsNeeded(NA, NB, trips_AB, trips_BA);
    }

    public static void calculateTrainsNeeded(int NA, int NB, String[][] trips_AB, String[][] trips_BA) 
    {
        String[][] events = new String[(NA + NB)*2][3];

        for (int i = 0; i < NA; i++) 
        {
            events[i][0] = trips_AB[i][0];
            events[i][1] = "A";
            events[i][2] = "depart";

            events[NA + i][0] = trips_AB[i][1];
            events[NA + i][1] = "B";
            events[NA + i][2] = "arrive";
        }

        for (int i = 0; i < NB; i++) 
        {
            events[2 * NA + i][0] = trips_BA[i][0];
            events[2 * NA + i][1] = "B";
            events[2 * NA + i][2] = "depart";

            events[2 * NA + NB + i][0] = trips_BA[i][1];
            events[2 * NA + NB + i][1] = "A";
            events[2 * NA + NB + i][2] = "arrive";
        }

        Arrays.sort(events, Comparator.comparing(o -> o[0]));

        int trains_A = 0, trains_B = 0;
        int trainsNeeded_A = 0, trainsNeeded_B = 0;

        for (String[] event : events) 
        {
            String time = event[0];
            String station = event[1];
            String action = event[2];

            if ("depart".equals(action)) 
            {
                if ("A".equals(station)) 
                {
                    trains_A++;
                } else 
                {
                    trains_B++;
                }
            } 
            else 
            {
                if ("A".equals(station)) 
                {
                    trains_A--;
                } 
                else 
                {
                    trains_B--;
                }
            }

            trainsNeeded_A = Math.max(trainsNeeded_A, trains_A);
            trainsNeeded_B = Math.max(trainsNeeded_B, trains_B);
        }

        System.out.println("Total Trains needed at station A is " + trainsNeeded_A +
                " Total Trains needed at station B is " + trainsNeeded_B);
    }
}

