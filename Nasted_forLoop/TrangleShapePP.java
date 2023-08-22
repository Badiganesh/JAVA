package com.kn.Nasted_forLoop;

public class TrangleShapePP {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j && i+j<=6)
				{
					System.out.print("*");
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
				if(j<=i && j+i>=6)
				{
					System.out.print("*");
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
				if(i<=j && i+j<=10)
				{
					System.out.print("*");
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
				if(i>=j && i+j<=10)
				{
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
