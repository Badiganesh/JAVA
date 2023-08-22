package com.kn.D_Array;

import java.util.Arrays;

import java.util.Scanner;

public class ArrangeinAccendingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
//		Array Creation and Declaration
		int arr[] = new int[size];
//		Array initialization
		System.out.println("Enter te Array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
//		Array Traversing
		System.out.println("The array elements in Accending order are");
		for(int i=0;i<arr.length;i++)
//		for (int i : arr)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
