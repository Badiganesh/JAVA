package IteraTion;

import java.util.Scanner;

public class TableUsingFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER THE TABLE NO = ");
		int n = scan.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
		scan.close();
	}

}
