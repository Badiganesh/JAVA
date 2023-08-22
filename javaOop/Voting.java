package javaOop;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age of the person = ");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println(" Not Eligible");
		}
	}
}
