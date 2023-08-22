package com.kn.DD_Array;

import java.util.Scanner;

public class CopyingDDArrayfromAnotherArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		System.out.println("Enter the size of Array Index");
		int ind = scan.nextInt();
		
		int [][]arr=new int[size][ind];
		int [][]brr=new int[arr.length][ind];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the arr Array elements of Array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("-----------------------");
		allArrayElements(arr.length,arr);
		System.out.println("-----------------------");
		copyingbrrArrayFromarr(arr.length,arr,brr);
	}

	public static void allArrayElements(int length, int[][] arr) {
		System.out.println("The array elements of Array arr are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}

	public static void copyingbrrArrayFromarr(int length, int[][] arr, int[][] brr) {
		System.out.println("The Array elements of Array brr are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				brr[i][j]=arr[i][j];
				System.out.print(brr[i][j]+" ");
			}System.out.println();
		}		
	}

}
