package com.kn.D_Array;

import java.util.Scanner;

public class EvenNoEleminArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Declaration and Creation
		int[] arr= new int[scan.nextInt()];
//		Array	initialization
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements of Array "+(i+1));
			arr[i] = scan.nextInt();
		}
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" , ");
			}
		}
		System.out.println(" Are The even array element");
	}

}
