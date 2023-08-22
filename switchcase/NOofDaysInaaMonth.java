package com.kn.switchcase;

import java.util.Scanner;

public class NOofDaysInaaMonth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month No ");
		int mon = scan.nextInt();

		NoofDays(mon);
		scan.close();
	}

	private static void NoofDays(int mon) {
		switch (mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("The Month " + mon + " has 31 days");
			break;
		case 2:
			System.out.println("The Month " + mon + " has 28 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(" The Month " + mon + " has 30 days");
		}

	}

}
