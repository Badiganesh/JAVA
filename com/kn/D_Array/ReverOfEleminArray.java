package com.kn.D_Array;

import java.util.Scanner;

public class ReverOfEleminArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of Array");
//		Array creation declaration
		int arr[]=new int[scan.nextInt()];
		int brr[]=new int[arr.length];
//		Array initialization
		System.out.println("Enter the Array Elements of Array arr");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		printOfAllArrayEle(arr);
		System.out.println();
		reversOfallArrayElem(arr,brr);
	}

	public static void printOfAllArrayEle(int[] arr) {
		System.out.println("The Array Element are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void reversOfallArrayElem(int[] arr, int[] brr) {
		System.out.println("The reverse of the Array Element are");
		for(int i=0;i<arr.length;i++)
		{
			int rev=0,r=0;
			for(int j=0;arr[i]>0;j++)
			{
				r=arr[i]%10;
				rev=(rev*10)+r;
				arr[i]/=10;
			}
			brr[i]=rev;
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}

}
