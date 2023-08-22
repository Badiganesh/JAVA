package com.kn.DD_Array;

import java.util.Scanner;

public class largeSumoFArrayElemOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array 1");
		int size = scan.nextInt();
		System.out.println("Enter the size of Array 1 index");
		int ind = scan.nextInt();
//		Array Declaration And Creation
		int arr[][]= new int[size][ind];
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{System.out.println("Enter the Array elements for Array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{System.out.println("Enter the Array elements for Array"+(i+1)+" of index"+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		allArrayElemnts(arr,arr.length);
		largeArrayElemSum(arr,arr.length);
	}

	public static void allArrayElemnts(int[][] arr, int length) {
		for(int i=0;i<arr.length;i++)
		{System.out.println("The Array Elements of Array index "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

	public static void largeArrayElemSum(int[][] arr, int length) {
		int sum=0,max=0;
		for(int i=0;i<arr.length;i++)
		{sum=0;
		System.out.println("The largest array Elements are:");
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=+arr[i][j];
				if(sum>max)
				{
					max=sum;
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
		}
		
	}

}
