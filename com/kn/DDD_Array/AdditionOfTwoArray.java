package com.kn.DDD_Array;

import java.util.Scanner;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array ");
		int size1 = scan.nextInt();
		System.out.println("Enter the size of the Array 1 index");
		int ind1 = scan.nextInt();
		System.out.println("Enter the size of the Array 1 indexs index");
		int ind2 = scan.nextInt();
		int arr[][][] = new int[size1][ind1][ind2];
		int brr[][][] = new int[arr.length][ind1][ind2];
		int crr[][][] = new int[arr.length][ind1][ind2];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the arr Array elements " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the arr Array" + (i + 1) + " index elements of " + j);
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = scan.nextInt();
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the brr Array elements " + (i + 1));
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter the brr Array" + (i + 1) + " index elements of " + j);
				for (int k = 0; k < arr[i][j].length; k++) {
					brr[i][j][k] = scan.nextInt();
				}
			}
		}
		additionOfTwoArray(arr.length,arr,brr,ind1,ind2,crr);
	}

	public static void additionOfTwoArray(int length, int[][][] arr, int[][][] brr, int ind1, int ind2, int[][][] crr) {
		for(int i=0;i<arr.length;i++)
		{System.out.println("The Array Elements of Array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{	System.out.println("The Array Elements of Array"+(i+1)+" index"+(j+1));
				for(int k=0;k<arr[i][j].length;k++)
				{
					crr[i][j][k]=arr[i][j][k]+brr[i][j][k];
					System.out.print(crr[i][j][k]+" ");
				}System.out.println();
			}System.out.println();
		}
	}

}
