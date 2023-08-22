package com.kn.simpleif;

import java.util.Scanner;

public class AdultorNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age ");
		int age = scan.nextInt();
		
		if(age>21) {
			System.out.println("Your Adult");
		}
		else {
			System.out.println("your not Adult");
		}
		scan.close();
	}

}
