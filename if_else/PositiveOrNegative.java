package com.kn.if_else;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number ");
		int num = scan.nextInt();
		
		boolean flag = ifpositive(num);
		if(flag) {
			System.out.println("The Number "+num+" is positive "+"("+flag+")");
		}
		else {
			System.out.println("The Number "+num+" is negative "+"("+flag+")");
		}
	}

	private static boolean ifpositive(int num) {
		if(num>0){
			return true;
		}
		else {
			return false;
		}
}
}