package com.kn.DD_Array;

import java.util.Scanner;

public class DDJaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array declaration and creation
		int arr[][]=new int[2][];
		arr[0]=new int[4];
		arr[1]=new int[2];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the Elements of the array "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter the Array Element for the "+i+j+" index :");
				arr[i][j]=scan.nextInt();
			}
		}
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The elements of Array "+i+j+" = "+arr[i][j]);
			}
		}
	}

}
