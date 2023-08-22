package com.kn.D_Array;

import java.util.Scanner;

public class SplitingArrayIntoTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
//		Array Declaration and Array Creation
		int arr[]= new int[size];
		int brr[]=new int[((arr.length)+1)/2];
		int crr[]=new int[arr.length-brr.length];
//		Array initialization
		System.out.println("Enter the array elements for Array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		allarrArrayElementsare(arr.length,arr);
		arraySplitingInTwoArray(arr.length,arr,brr,crr);
	}

	private static void allarrArrayElementsare(int length, int[] arr) {
		System.out.println("The arr Array Elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void arraySplitingInTwoArray(int length,  int[] arr, int[] brr, int[] crr) {
		for(int i=0;i<arr.length;i++)
		{
			if(i<=brr.length)
			{
				brr[i]=arr[i];
			}
			else
				crr[i]=arr[i];;
		}
		for(int i=0;i<=brr.length;i++)
		{
			System.out.println("The brr Array Elements are");
			System.out.print(brr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=crr.length;i++)
		{
			System.out.println("The crr Array Elements are");
			System.out.print(crr[i]+" ");
		}
	}

}
