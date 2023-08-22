package com.kn.Nested_if;

import java.util.Scanner;

public class loanOnAgeandIncome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Age = ");
		int age = scan.nextInt();
		System.out.print("Enter the Income per Month = ");
		int inc = scan.nextInt();
		
		boolean declar= Loandeclaration(age,inc);
		if(declar) {
			System.out.println("Eligible For Loan");
		}
		else
			System.out.println("Not Eligible For loan");
		scan.close();
	}

	private static boolean Loandeclaration(int age, int inc) {
		if(age>=21 && inc>=15000 )
		{
			return true;
		}
		return false;
	}

}
