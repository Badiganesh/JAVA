package com.kn.Nasted_forLoop;

public class RevNoPrintInPP {

	public static void main(String[] args) {
		int num =25;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(num<=9)
				{
					System.out.printf("%02d",num);
					System.out.print(" ");
				}
				else
					System.out.print(num+" ");
				num--;
			}System.out.println();
		}
	}

}
