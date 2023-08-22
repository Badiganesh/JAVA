package com.kn.Nasted_forLoop;

import java.util.Scanner;

public class FactOfAllUptoN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the fcatorial range");
		int fact = scan.nextInt();
		scan.close();
		for(int i=1;i<=fact;i++)
		{
			int factorial=0;
			for(int j=1;j<fact;j++)
			{
				factorial+=i*j;
			}
			System.out.println(factorial);
		}
	}

}
