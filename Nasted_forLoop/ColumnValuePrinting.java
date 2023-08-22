package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class ColumnValuePrinting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Row & Column");
		int row=scan.nextInt();
		int column= scan.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
