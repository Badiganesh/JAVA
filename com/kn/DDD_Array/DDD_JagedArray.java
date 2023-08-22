package com.kn.DDD_Array;

import java.util.Scanner;

public class DDD_JagedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1=scan.nextInt();
		System.out.println("Enter the size of array 2");
		int size2=scan.nextInt();
		System.out.println("Enter the size of array 3");
		int size3=scan.nextInt();

		//		Array Creation and Declaration
		int arr[][][]= new int[size1][size2][size3];

		//		Array initialization
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}

		//		Array Traversing
		System.out.println("The Elements of the Array are ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
	}
}  