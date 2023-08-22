package com.kn.DDD_Array;

import java.util.Scanner;

public class DDD_ArrayElementsCubeValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array arr1");
		int size1=scan.nextInt();
		System.out.println("Enter the size of the Array arr2");
		int size2=scan.nextInt();
		System.out.println("Enter the size of the Array arr3");
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
			}System.out.println();
		}
		cubeOfTheArrayElements(arr,arr.length);
	}
//		Method To find the cube of Array Elements
	public static void cubeOfTheArrayElements(int[][][] arr, int length) {
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]*arr[i][j][k]*arr[i][j][k]+" ");
				}
			}System.out.println();
		}System.out.println();
	}

}
