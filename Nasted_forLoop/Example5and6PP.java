package com.kn.Nasted_forLoop;

public class Example5and6PP {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print(j);
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j)
				{
					System.out.print((char)(64+j));
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
