package com.kn.Nested_if;

import java.util.Scanner;

public class EqualOrGreaterIn3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3 Number");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		
		boolean flag = Equal(n1,n2,n3);
		if(flag)
		{
			System.out.println("The all 3 numbers are Equal");
		}
		else if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is the Greatest Number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" is the Greatest Number");
		}
		else
		{
			System.out.println(n3+" is the Greatest Number");
		}
		scan.close();
	}

	private static boolean Equal(int n1, int n2, int n3) {
		if(n1==n2 && n2==n3)
		{
			return true;
		}
		return false;
	}

}
