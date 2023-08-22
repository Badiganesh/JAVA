package com.kn.D_Array;

import java.util.Scanner;

public class AddtionOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array ");
		int arr1 []=new int[scan.nextInt()];
		int arr2[]=new int [arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter the no to store in array "+(i+1));
			arr1[i]=scan.nextInt();
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		int arr3 []= new int[arr1.length+arr2.length];
			for(int i=0;i<arr1.length;i++)
			{
				arr3[i]=arr1[i];
			}
			for(int i=arr1.length;i<arr2.length;i++)
			{
				arr3[i+arr1.length]=arr2[i];
			}
		
//		Array traversing
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
	}

}
