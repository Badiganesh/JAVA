package com.kn.Iteration_loops;

import java.util.Scanner;

public class SumofNatNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the number for Addition =");
		int num = scan.nextInt();
		int sum =0;
		for(int i=0;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
