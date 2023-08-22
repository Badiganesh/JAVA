package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The age");
		int age = scan.nextInt();
		
		if(age>=18)
		{
			System.out.println("vote Eligible");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}

}
