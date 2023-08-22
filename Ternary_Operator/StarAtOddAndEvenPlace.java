package com.kn.Ternary_Operator;

public class StarAtOddAndEvenPlace {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{
				if(i+j>=6 && j-i<=4 && k==1)
				{
					System.out.print("*");
					k=0;
				}
				else
				{
					System.out.print("-");
					k=1;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i+j>=6 && (i+j)%2==0)&&( j-i<=4 && (i+j)%2==0))
				{
					System.out.print("*");
				}
				else
					System.out.print("-");
			}System.out.println();
		}
	}
} 	