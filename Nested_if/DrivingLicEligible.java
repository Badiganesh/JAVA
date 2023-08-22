package com.kn.Nested_if;

import java.util.Scanner;

public class DrivingLicEligible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Age = ");
		int age = scan.nextInt();
		System.out.print("Enter the Vision Score = ");
		float vis = scan.nextFloat();
		boolean DLtest = DrivingLic(age,vis);
		if(DLtest)
		{
			System.out.println("IS Eligible For Driving Licence");
		}
		else
			System.out.println("IS Not Eligible For Driving Licence");
		scan.close();
	}

	private static boolean DrivingLic(int age, float vis) {
		if(age>=18 && vis>0.25)
		{
			return true;
		}
		return false;
	}

}
