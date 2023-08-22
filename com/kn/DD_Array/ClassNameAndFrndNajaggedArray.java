package com.kn.DD_Array;

import java.util.Scanner;

public class ClassNameAndFrndNajaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array Declaration and Array Creation
		System.out.println("Enter the total no of Batches");
		int size = scan.nextInt();
		String arr[][] = new String[size][];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the toatal no of friends in A" + (i + 1) + " Batch =");
			arr[i] = new String[scan.nextInt()];
		}
//		Array initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the A" + (i + 1) + " class Friends name");
			System.out.println("Enter the " + arr[i].length + " friends name");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.next();
			}
		}
//		Array traversing
		System.out.println("--------------*--------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("The A" + (i + 1) + " Batch Friends are:");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
