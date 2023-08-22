package com.kn.Ternary_Operator;

public class OutSideOfEmptyTriangle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{
				if(i+j<=6 && (i+j)%2==0 || j-i>=4 && (i+j)%2==0)
				{
					System.out.print("*");
					k=1;
				}
				else
				{
					System.out.print("-");
					k=1;
				}
			}System.out.println();
		}
		
		System.out.println();
		for(int i=1;i<=5;i++)
		{
			int k=1;
			for(int j=1;j<=9;j++)
			{
				if( j-i>=4 && k==1||j<=6-i && k==1)
				{
					System.out.print("*");
					k=0;
				}
				else
				{
					System.out.print("-");
					k=1;
				}
			}System.out.println();
		}
		
	}

}
