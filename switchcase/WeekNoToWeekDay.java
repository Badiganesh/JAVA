package com.kn.switchcase;

import java.util.Scanner;

public class WeekNoToWeekDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Week No for Week Day");
		int no = scan.nextInt();
		WeekNotoDay(no);
		scan.close();
	}

	static void WeekNotoDay(int no) {
		switch(no) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}
	}

}
