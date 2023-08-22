package com.kn.D_Array;

import java.util.Scanner;

public class FindComninTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the arr Array");
//		Array Creation and Declaration
		int[] arr=new int[scan.nextInt()];
		int[] brr=new int[arr.length];
//		Array initialization
		System.out.println("Enter the arr Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the brr Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			brr[i]=scan.nextInt();
		}
		toFindtheCommEleinArray(arr,brr);
	}
//	Method To find Common elements
	public static void toFindtheCommEleinArray(int[] arr, int[] brr) {
		System.out.println("The Common Elements in arrays");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==brr[i])
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
