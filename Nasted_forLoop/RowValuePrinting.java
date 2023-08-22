package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class RowValuePrinting {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Row & Column");
	int row =scan.nextInt();
	int column =scan.nextInt();
	scan.close();
	for(int i=1;i<=row;i++)
	{
		for(int j=0;j<=column;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}

}
