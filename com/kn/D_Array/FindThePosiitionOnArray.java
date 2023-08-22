package com.kn.D_Array;

import java.util.Scanner;

public class FindThePosiitionOnArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Declaration and Creation
		int[] arr= new int[scan.nextInt()];
//		Array	initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements of Array for Position "+(i+1));
			arr[i] = scan.nextInt();
		}		

		findtheArrayposition(arr);
	}
//	Method To find the position of The Elements in an Array
	public static void findtheArrayposition(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Elment to find the position");
		int num= scan.nextInt();
		int same=0,position=0;
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				same=arr[i];
//				position=i;
				System.out.println("The Array Element "+arr[i]+" is Present in position "+(i+1));
			}
		}
		if(same!=num)
		{
			System.out.println("The Array Element is not present");
//			return num;
		}
	}

}
