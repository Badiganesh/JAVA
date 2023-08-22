package com.kn.D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
//		Array Creation Declaration
		int arr[] = new int[size];
//		Array initialization
		System.out.println("Enter the Elements of the Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter the Element to search in a Array");
		int ele = scan.nextInt();
		binarySearchforAnArray(arr, ele);
	}

//	Method for Searching Element in Array using Binary Search
	public static void binarySearchforAnArray(int[] arr, int ele) {
//		Arrays.sort(arr);
		int position = -1;
	 	boolean isElementFound = false;
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (ele == arr[mid]) {
				position = mid + 1;
				isElementFound = true;
				break;
			} else if (ele > arr[mid]) {
				low = mid + 1;
//				high = high;
			} else {
//				low = low;
				high = mid - 1;
			}
		}
		if (isElementFound == false) {
			System.out.println("The element is not found in Array");
		} else
			System.out.println("The element " + ele + " is Found at position of " + position);
	}

}
