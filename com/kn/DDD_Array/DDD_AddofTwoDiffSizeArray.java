package com.kn.DDD_Array;

import java.util.Scanner;

public class DDD_AddofTwoDiffSizeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the arr Array1");
		int size1 =scan.nextInt();
		System.out.println("Enter the size of the arr Array2");
		int size2=scan.nextInt();
		System.out.println("Enter the size of the arr Array3");
		int size3=scan.nextInt();
//		Array Creation And Declaration
		int arr[][][]= new int[size1][size2][size3];
		int brr[][][]= new int[size1][size2][size3];
//		Array initialization
		System.out.println("Enter the Array Elements of Array arr");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]= scan.nextInt();
				}
			}
		}
		System.out.println("Enter the Array Elements of Array brr");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				for(int k=0;k<brr[i][j].length;k++)
				{
					brr[i][j][k]= scan.nextInt();
				}
			}
		}
		additionOfTwoDiffsizeArray(arr,brr);
	}
//		Method for Adding two Array of Different size
	public static void additionOfTwoDiffsizeArray(int[][][] arr, int[][][] brr  ) {
//		Array traversing
		System.out.println("The Array elements of Array crr are:");
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					for(int k=0;k<arr[i][j].length;k++)
					{
						System.out.print(arr[i][j][k]+brr[i][j][k]+" ");
					}System.out.println();
				}System.out.println();
			}
		
	}

}
