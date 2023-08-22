package com.kn.Iteration_loops;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number To check Prime or not");
		int num = scan.nextInt();
		
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count++==1)
		{
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}

}
