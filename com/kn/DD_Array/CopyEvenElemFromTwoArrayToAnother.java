package com.kn.DD_Array;

import java.util.Scanner;

public class CopyEvenElemFromTwoArrayToAnother {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		System.out.println("Enter the size of Array of Array 1");
		int ind=scan.nextInt();
//		Array Declaration And Creation
		int arr[][]=new int [size][ind];
		int brr[][]= new int[arr.length][ind];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{System.out.println("Enter the Array arr Elements");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		allElementsOfArrayArrare(arr,arr.length);
		evenElementsoofArrayArrTobrr(arr,brr,arr.length);
	}
//	Method To find Even elements of Array arr
	public static void evenElementsoofArrayArrTobrr(int[][] arr, int[][] brr, int length) {
		System.out.println("The Even elements of Arrar arr are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]%2==0)
				{
					brr[i][j]=arr[i][j];
					System.out.print(brr[i][j]+" ");
				}
			}
		}
	}
//	Method to print all the Array elements
	public static void allElementsOfArrayArrare(int[][] arr, int length) {
		System.out.println("The Array Elements of Array arr are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

}
