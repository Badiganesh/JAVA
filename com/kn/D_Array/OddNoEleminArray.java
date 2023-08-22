package com.kn.D_Array;

import java.util.Scanner;

public class OddNoEleminArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
//		Array declaration & creation
		int[] arr = new int[scan.nextInt()];
//		Array Initialization 
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array Element "+(i+1));
			arr[i]=scan.nextInt();
		}
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0) {
			System.out.print(arr[i]+",");
			}
		}
		System.out.println(" Are the odd Elements of the Array");
	}

}
