package chapter6;

import java.util.Calendar;
import java.util.Scanner;
public class Java385bai6 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in )) {
			Calendar date1 = Calendar.getInstance();
			System.out.println("game start");
			System.out.print("1 enter: ");
			sc.nextLine();
			int m1 = date1.get(Calendar.SECOND);
			System.out.println("enter: "+m1);
			
			System.out.print(" enter doi: ");
			sc.nextLine();
			Calendar date2 = Calendar.getInstance();
			int m2 = date2.get(Calendar.SECOND);
			System.out.println("enter: "+m2);
			System.out.println("enter: "+Math.abs(m1-m2));
			// ng 2 
			Calendar date = Calendar.getInstance();
			System.out.println("game start");
			System.out.println("2 enter: ");
			sc.nextLine();
			int m3 = date.get(Calendar.SECOND);
			System.out.println("enter: "+m3);
			Calendar dat = Calendar.getInstance();
			System.out.print(" enter doi: ");
			sc.nextLine();
			int m4 = dat.get(Calendar.SECOND);
			System.out.println("enter: "+m4);
			System.out.println("enter: "+Math.abs(m3-m4 ));
			if(10- Math.abs(m1-m2)>10- Math.abs(m3 -m4)) {
				System.out.print("ng thanhg 2 ");
			}
			else {
				System.out.print("ng thanhg 1 ");
			}} }}

//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        System.out.println("Welcome to the Time Game!");
//	        System.out.println("Press <Enter> to start the game and try to get as close as possible to 10 seconds.");
//
//	        // Wait for the user to press Enter
//	        scanner.nextLine();
//
//	        // Get the current time in milliseconds
//	        Calendar calendar = Calendar.getInstance();
//	        long startTimeInMillis = calendar.getTimeInMillis();
//
//	        // Wait for the user to press Enter again
//	        scanner.nextLine();
//
//	        // Get the current time again and calculate the elapsed time in seconds
//	        calendar = Calendar.getInstance();
//	        long endTimeInMillis = calendar.getTimeInMillis();
//	        double elapsedTimeInSeconds = Math.abs((endTimeInMillis - startTimeInMillis) / 1000.0);
//
//	        // Calculate how far the user is from 10 seconds
//	        double distanceFrom10Seconds = Math.abs(elapsedTimeInSeconds - 10.0);
//
//	        // Determine whether the user won or lost
//	        if (distanceFrom10Seconds < 1.0) {
//	            System.out.println("Congratulations! You won the game!");
//	        } else {
//	            System.out.println("Sorry, you lost the game.");
//	        }
//
//	        System.out.println("Elapsed time: " + elapsedTimeInSeconds + " seconds");
//	        System.out.println("Distance from 10 seconds: " + distanceFrom10Seconds + " seconds");
//	    }
//	}

