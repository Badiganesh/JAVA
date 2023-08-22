package com.kn.whileLoop;

import java.util.Scanner;

public class lengthOFNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to find Length ");
		int n =scan.nextInt();
		System.out.println(LengthofNoIs(n));
		scan.close();
	}

	static int LengthofNoIs(int n) {
		int r=0,count=0;
		while(n>0)
		{
			r=n%10;
			count++;
			n/=10;
		}return count++;
	}

}
