package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class CharPaternPrinting {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of Row & Cloumn");
		int row = scan.nextInt();
		int column = scan.nextInt();
		scan.close();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
		System.out.println();
	}

}
