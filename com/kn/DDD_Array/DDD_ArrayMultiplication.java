package com.kn.DDD_Array;

import java.util.Scanner;

public class DDD_ArrayMultiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1=scan.nextInt();
		System.out.println("Enter the size of array 2");
		int size2=scan.nextInt();
		System.out.println("Enter the size of array 3");
		int size3=scan.nextInt();
//		Array Creation and Declaration
		int arr[][][]= new int[size1][size2][size3];
		int brr[][][]= new int[size1][size2][size3];
//		Array initialization
		System.out.println("Enter the Array Elements for Array arr");
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
		System.out.println("Enter the Array Elements for Array brr");
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
		multplicationOfTwoArray(arr,arr.length,brr);
	}
//		Method for multiplication of two array
	public static void multplicationOfTwoArray(int[][][] arr, int length, int[][][] brr) {
		System.out.println("The Multiplication of the two array elements are:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]*brr[i][j][k]+" ");
				}
			}
		}
	}

}
