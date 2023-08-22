package com.kn.D_Array;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
//		Array creation and Declaration
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		BubbleSort2Demo BubbleSort2= new BubbleSort2Demo(arr);
//		int brr[]=BubbleSort2.arr[];
//		Array Traversing
		System.out.println("The Sorted Array Elements are");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
