package com.kn.DD_Array;

import java.util.Scanner;

public class DD_ProductOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int size = scan.nextInt();
		System.out.println("Enter the size of Array Indexs");
		int ind = scan.nextInt();
//		Array Declaration and Creation
		int[][] arr = new int[size][ind];
		int[][] brr = new int[arr.length][ind];
		int prr[][] = new int[arr.length][ind];
//		Array initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Array Elements for arr Array" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the Array Elements for arr Array" + (i + 1) + " of Array" + (j + 1));
				arr[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the Array Elements for brr Array" + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the Array Elements for brr Array" + (i + 1) + " of Array" + (j + 1));
				brr[i][j] = scan.nextInt();
			}
		}
		outputOfTheTwoArrays(arr, arr.length, brr);
		productofTwoArrays(arr.length, brr, arr, prr);
		adiitionofTwoArray(arr.length,brr,arr,prr);

	}
public static void adiitionofTwoArray(int length, int[][] brr, int[][] arr, int[][] prr) {
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("The Addition of Two arrays of array"+(i+1)+" is ");
		for(int j=0;j<arr[i].length;j++)
		{
			prr[i][j]=arr[i][j]+brr[i][j];
			System.out.print(prr[i][j]+" ");
		}
		System.out.println();
	}
	}
//	Method to find product of two Arrays
	private static void productofTwoArrays(int length, int[][] brr, int[][] arr, int[][] prr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The product elements of the arr and brr Array " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("The elements of the arr Array"+(i+1)+" of index"+j+" is "+arr[i][j]);
//				System.out.println("The elements of the brr Array"+(i+1)+" of index"+j+" is "+brr[i][j]);
				prr[i][j] = arr[i][j] * brr[i][j];
				System.out.print(prr[i][j] + " ");
			}
			System.out.println();
		}
	}
//	Method to print the output for Two Arrays
	private static void outputOfTheTwoArrays(int[][] arr, int length, int[][] brr) {
//		Array traversing
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The elements of the arr Array " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("The elements of the arr Array"+(i+1)+" of index"+j+" is "+arr[i][j]);
//				System.out.println("The elements of the brr Array"+(i+1)+" of index"+j+" is "+brr[i][j]);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The elements of the brr Array " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
//				System.out.println("The elements of the arr Array"+(i+1)+" of index"+j+" is "+arr[i][j]);
//				System.out.println("The elements of the brr Array"+(i+1)+" of index"+j+" is "+brr[i][j]);
				System.out.print(brr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
