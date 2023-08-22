package com.kn.Nasted_forLoop;

public class Example7And8PP {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i>=j)
				{
					System.out.print((5+j)-i);
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)(64+i));
			}System.out.println();
		}
	}

}
