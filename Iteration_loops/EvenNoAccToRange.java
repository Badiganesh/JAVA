package com.kn.Iteration_loops;

import java.util.Scanner;

public class EvenNoAccToRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range To print Even No ");
		int num = scan.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+",");
			}
		}
		
	}

}
