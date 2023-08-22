package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of the 1st procuct ");
		int p1 = scan.nextInt();
		System.out.println("Enter the value of the 2nd procuct ");
		int p2 = scan.nextInt();
		
		boolean flag = discountaAppli(p1,p2);
		if(flag) {
			System.out.println("Discount is Applicable for "+(p1+p2));
		}
		else
		{
			System.out.println("Discount is not Applicable for "+(p1+p2));
		}
		scan.close();
		
	
	}

	private static boolean discountaAppli(int p1, int p2) {
		if(p1+p2 >=100) {
			return true;
		}
		else {
			return false;
		}

	}
}