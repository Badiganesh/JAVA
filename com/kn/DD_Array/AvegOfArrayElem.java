package com.kn.DD_Array;

import java.util.Scanner;

public class AvegOfArrayElem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
//		Array Declaration & creation 
		int arr[][]=new int[scan.nextInt()][];
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the size of the Array for "+(i+0));
			arr[i]= new int[scan.nextInt()];
		}
//		Array Elements as input From user
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array Elemnts for Array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the Array element for Array"+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
//		Array traversing
		int avg=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The array Elements of Array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The Array Elements are "+arr[i][j]);
				avg+=arr[i][j];
			}
			System.out.println("The average of the Array elements are :"+(avg/arr[i].length));
		}
		
		
	}
}
