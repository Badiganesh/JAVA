package com.kn.if_else;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the year ");
		int year = scan.nextInt();

		boolean flag = leapYearOrNot(year);
		if (flag) {
			System.out.println(year + " year is a Leap Year");
		} else {
			System.out.println(year + " year is not a Leap Year");
		}
		scan.close();

	}

	private static boolean leapYearOrNot(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}
