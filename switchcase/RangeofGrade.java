package com.kn.switchcase;

import java.util.Scanner;

public class RangeofGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Grade for Range");
		char ch = scan.next().charAt(0);
		RangeGrades(ch);
		scan.close();
	}

	static void RangeGrades(char ch) {
		switch (ch) {
		case 'A':
			System.out.println("Range between 91 - 100");
			break;
		case 'B':
			System.out.println("Range between 81 - 90");
			break;
		case 'C':
			System.out.println("Range between 71 - 80");
			break;
		case 'D':
			System.out.println("Range between 61 - 70");
			break;
		case 'E':
			System.out.println("Range between 51 - 60");
			break;
		case 'F':
			System.out.println("Range between 0 - 50");
			break;
		}
			
	}

}
