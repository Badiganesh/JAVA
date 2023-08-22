package com.kn.Nasted_forLoop;

public class Example1And2ForPP {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}System.out.println();
		}
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(6-i);
			}
			System.out.println();
		}
	}

}
