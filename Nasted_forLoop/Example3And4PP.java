package com.kn.Nasted_forLoop;


public class Example3And4PP {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
			System.out.print((char)(64+j));
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i) {
					System.out.print(i);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
