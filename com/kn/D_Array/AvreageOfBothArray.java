package com.kn.D_Array;

import java.util.Scanner;

public class AvreageOfBothArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array arr");
		int size =scan.nextInt();
		System.out.println("Enter the size of the Array brr");
		int size2 =scan.nextInt();
//		Array creation
		int arr[]=new int[size];
		int brr[]=new int[size2];
//		Array initialization
		System.out.println("Enter the arr Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the brr Array Elements");
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=scan.nextInt();
		}
		averageofBothArrays(arr,brr);
	}

	public static void averageofBothArrays(int[] arr, int[] brr) {
		int sumarr=0,sumbrr=0, average=0;
		for(int i=0;i<arr.length;i++)
		{
			sumarr+=arr[i];
		}
		for(int i=0;i<brr.length;i++)
		{
			sumbrr+=brr[i];
		}
		average=(sumarr+sumbrr)/(arr.length+brr.length);
		System.out.println("The Average of Both Array Element is :"+average);
	}

}
