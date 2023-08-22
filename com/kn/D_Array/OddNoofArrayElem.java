package com.kn.D_Array;

import java.util.Scanner;

public class OddNoofArrayElem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
//		Array Creation and Declaration
		int arr[]= new int[size];
//		Array initialization
		System.out.println("Enter the Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= scan.nextInt();
		}
		oddNoofArrayElements(arr);
		System.out.println();
		evenNoOfArrayElement(arr);
	}

	public static void evenNoOfArrayElement(int[] arr) {
		System.out.println("The Even Array Elements are");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void oddNoofArrayElements(int[] arr) {
		System.out.println("The odd Array Elements are");
		int[] orr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				orr[i]=arr[i];
				System.out.print(orr[i]+" ");
			}
		}
	}
}
