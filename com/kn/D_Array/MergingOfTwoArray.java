package com.kn.D_Array;

import java.util.Scanner;

public class MergingOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array arr");
//		Array Creation and Declaration
		int arr[] = new int[scan.nextInt()];
		System.out.println("Enter the size of the Array brr");
		int brr[] = new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the Array Elements for Array arr");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the Array Elements for Array brr");
		for (int i = 0; i < brr.length; i++) {
			brr[i] = scan.nextInt();
		}
//		Array Traversing
		System.out.println("The Array elements of Array arr ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("The Array elements of Array brr ");
		for (int i : brr) {
			System.out.print(i + " ");
		}
		System.out.println();
		int crr[] = mergingoftheTwoArrays(arr, brr);
		System.out.println("The merged Array Elements are");
		for (int i : crr) {
			System.out.print(i + " ");
		}
	}

	public static int[] mergingoftheTwoArrays(int[] arr, int[] brr) {
		int crr[] = new int[arr.length + brr.length];
		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}
		for (int i = arr.length, j = 0; i < crr.length; i++, j++) {
			crr[i] = brr[j];
		}
		return crr;
	}

}
