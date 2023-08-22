package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class StarPrinting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Rows & Coloumn");
		int row = scan.nextInt();
		int column = scan.nextInt();
		scan.close();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=column;j++)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
