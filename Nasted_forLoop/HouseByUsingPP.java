package com.kn.Nasted_forLoop;

public class HouseByUsingPP {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i+j==4 ||j-i==2||i==3||i==4)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
		for(int i=5;i<=8;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1||j==5||i==8)
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

}
