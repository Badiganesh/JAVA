package com.kn.D_Array;

import java.util.Scanner;

public class SplitOneArrayIntoTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array Declaration creation
		int arr[]= new int[10];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element for Array"+(i+1));
			arr[i]=scan.nextInt();
		}
//		Array traversing
		for(int i=0;i<5;i++)
		{
				System.out.print(arr[i]+" ");
		}	
		System.out.println();
		for(int i=5;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
