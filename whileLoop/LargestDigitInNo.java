package com.kn.whileLoop;

import java.util.Scanner;

public class LargestDigitInNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int n = scan.nextInt();
		largestDigit(n);
		scan.close();
	}

	static void largestDigit(int n) {
		int r=0,sum=0,G=0;
		while(n>0)
		{
			r=n%10;
			if(r>sum)
			{
				G=r;
			}
			sum=r;
			n/=10;
		}
		System.out.println(G);
	}

}
