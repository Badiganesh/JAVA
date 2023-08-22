package ControlConstructs;

import java.util.Scanner;

public class posDiff {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st nor = ");
		int a = scan.nextInt();
		System.out.println("Enter the 2nd nor = ");
		int b = scan.nextInt();
		int sub;
		if (a > b) {
			sub = (a - b);
			System.out.println(" the diff = " + sub);
		} else {
			sub = (b - a);
			System.out.println(" the diff = " + sub);
		}
	}
}
