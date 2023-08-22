package com.kn.Nasted_forLoop;

public class TypesOfPatternPrinting {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=6) {
					System.out.print(6-i);
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=6) {
					System.out.print(6-j);
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=6) {
					System.out.print((char)(70-i));
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j<=6) {
					System.out.print((char)(70-j));
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=6) {
					System.out.print("*");
				}
				else
					System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
