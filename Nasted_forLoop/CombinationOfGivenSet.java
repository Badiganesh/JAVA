package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class CombinationOfGivenSet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Row & Cloumn");
		int row = scan.nextInt();
		int column = scan.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(i);
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
