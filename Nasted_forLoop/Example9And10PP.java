package com.kn.Nasted_forLoop;

public class Example9And10PP {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j>=4 && j-i<=2)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j>=i && i+j<=6)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
