package com.kn.DDD_Array;

import java.util.Scanner;

public class DDD_ArrayAddition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1=scan.nextInt();
		System.out.println("Enter the size of array 2");
		int size2=scan.nextInt();
		System.out.println("Entr the size of array 3");
		int size3=scan.nextInt();
//		Array Creation and Declaration
		int arr[][][]= new int[size1][size2][size3];
		int brr[][][]= new int[size1][size2][size3];
//		Array initialization
		System.out.println("Enter the  arr Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Enter the  brr Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					brr[i][j][k]=scan.nextInt();
				}
			}
		}
		AdditionofTwoArrays(arr.length,arr,brr);
	}
// Method for Addition of Two Array
	private static void AdditionofTwoArrays(int length, int[][][] arr, int[][][] brr) 
	{
		System.out.println("The Adiition of Two Array elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+brr[i][j][k]+" ");
				}
			}
		}
	}

}
