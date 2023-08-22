package com.kn.whileLoop;

import java.util.Scanner;

public class LargestPalinDromNoInN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Range to find Palindrom");
		int num = scan.nextInt();
		LargestpalindrominN(num);
		scan.close();
	}

	static void LargestpalindrominN(int num) {
		for(int i=1;i<=num;i++)
		{
			int r=0,sum=0;
			for(int j=0;i>0;j++)
			{
				r= i%10;
				sum=(sum*10)+r;
				i/=10;
			}
			System.out.println(sum+",");
		}
	}

}