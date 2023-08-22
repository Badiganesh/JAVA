package com.kn.D_Array;

import java.util.Scanner;

public class FindPrimeNoInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array creation and declaration
		int arr[]=new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		theArrayElementsAre(arr);
		toFindprimeNoInArray(arr);
	}

	public static void theArrayElementsAre(int[] arr) {
		System.out.println("The Array Elements are");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

	public static void toFindprimeNoInArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=1;j<=100;j++)
			{
				if(arr[i]%j==0)
				{
					count++;
				}
			}
			if(count++<=2)
			{
				System.out.println(arr[i]+" is a Prime No");
			}
		}
	}

}
