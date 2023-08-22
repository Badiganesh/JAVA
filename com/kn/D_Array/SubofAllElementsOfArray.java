package com.kn.D_Array;

import java.util.Scanner;

public class SubofAllElementsOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
//		Array Declaration & Initialization
		int [] arr = new int[scan.nextInt()];
//		Array Initialization
		int sub=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Element of array "+(i+1)); 
			arr[i]=scan.nextInt();
			sub=-1*sub-arr[i];
		}
//		Array traversing
		System.out.println(sub);
		
	}
}


