package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = scan.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println("Capital Letter");
		}
		else{
			System.out.println("Small Letter");
		}
		scan.close();
	}
}