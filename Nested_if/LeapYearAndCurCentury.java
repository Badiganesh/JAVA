package com.kn.Nested_if;

import java.util.Scanner;

public class LeapYearAndCurCentury {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Year ");
		int year = scan.nextInt();
		boolean ly = leapyear(year);
		boolean CC = CurrentCentury(year);
		if(ly&&CC)
		{
			System.out.println(year+" Is a Leap Year");
			System.out.println(year +" Is a current century year");
		}
		else if(ly){
			System.out.println(year+" Is a Leap Year");
			System.out.println(year +" Is a Not a current century year");
		}
		else if(CC)
		{
			System.out.println(year+" IS not a Leap year ");
			System.out.println(year +" Is a current century year");
		}
		else
		{
			System.out.println(year+" IS not a Leap year ");
			System.out.println(year +" Is Not a current century year");
		}
		scan.close();
		
	}

	private static boolean CurrentCentury(int year) {
		if(year%100==0) {
			return true;
		}
		else {
		return false;
		}
	}

	private static boolean leapyear(int year) {
		if(year%4==0)
		{
			if(year%100==0) {
				
				if(year%400==0)
				{
					return true;
				}
			}return true;
		}return false;
		
	}

}
