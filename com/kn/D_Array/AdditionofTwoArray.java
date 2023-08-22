package com.kn.D_Array;

import java.util.Scanner;

public class AdditionofTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size if the Array arr:");
//		Array Declaration & Creation
		int arr[]=new int[scan.nextInt()];
		int brr[]=new int[arr.length];
		int crr[]= new int[arr.length];
		int prr[]= new int[arr.length];
		
//		Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Array Elements Array1 = arr1 :"+(i+1));
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Elements for Array2 = brr :"+(i+1));
			brr[i]=scan.nextInt();
		}
		additionOfTwoArray(arr.length,arr,brr,crr);	
		System.out.println("-------------------------------");
		productOfTwoArray(arr.length,arr,brr,prr);
	}
//	Method for Product of Two Array
	public static void productOfTwoArray(int length, int[] arr, int[] brr, int[] prr) {
		for(int i=0;i<arr.length;i++)
		{
			prr[i]=arr[i]*brr[i];
			System.out.println("The Prr elements of Array :"+(i+1)+" = "+prr[i]);
		}
	}
//	Method for Addition of two Array
	public static void additionOfTwoArray(int length,int[] arr, int[] brr, int[] crr) {
		Scanner scan = new Scanner(System.in);
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			crr[i]=arr[i]+brr[i];
			System.out.println("The Crr elements of Array :"+(i+1) +" = " +crr[i]);
		}
		
	}

}
