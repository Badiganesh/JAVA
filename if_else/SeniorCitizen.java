package com.kn.if_else;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age = ");
		int age = scan.nextInt();
		
		if(age>50) {
			System.out.println("Eligible for Discount");
		}
		else
			System.out.println("Not Eligible for Discount");
	}

}
