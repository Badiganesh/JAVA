package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class MultiplicationTableOfN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Multiplication table");
		int table = scan.nextInt();
		
		for(int i=1;i<=table;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" * "+j+" = "+i*j);
			}
			System.out.println();
		}
	}

}
