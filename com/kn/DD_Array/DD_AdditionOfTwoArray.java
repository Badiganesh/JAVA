package com.kn.DD_Array;

import java.util.Scanner;

public class DD_AdditionOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size if the Array arr:");
		int asize = scan.nextInt();
//		Array Declaration & Creation
		int arr[][]=new int[asize][];
		int brr[][]= new int[arr.length][];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Elements for Array arr"+(i+1));
			arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Elements for Array brr"+(i+1));
			brr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Elements For Array:"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the Array Elements for Array:"+(i+1)+" of "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Elements For Array:"+(i+1));
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter the Array Elements for Array:"+(i+1)+" of "+(j+1));
				brr[i][j]=scan.nextInt();
			}
		}
		
		additionOFTwoDArray(arr,brr,arr.length,brr.length);
	}

	public static void additionOFTwoDArray(int[][] arr, int[][] brr, int length, int length2 ) {
		int crr[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println("The Elements of crr Array"+i+" of index :"+j+""+crr[i][j]);
			}
		}
	}

}
