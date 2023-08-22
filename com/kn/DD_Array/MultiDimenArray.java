package com.kn.DD_Array;

import java.util.Scanner;

public class MultiDimenArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array Declaration
		int arr[][];
		
		System.out.println("Enter the Number of Students ");
		int size1=scan.nextInt();
		System.out.println("Enter the Number of Subject ");
		int size2=scan.nextInt();
//		Array Creation
		arr = new int[size1][size2];
//		Array Initialization
		for(int i=0;i<size1;i++)
		{
			System.out.println("Enter the Student "+(i+1)+" Data :");
			for(int j=0;j<size2;j++)
			{
				System.out.println("Enter the subject "+(j+1)+" Marks = ");
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("********************");
//		Array Traversing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Student "+(i+1)+" Data :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Subject "+(j+1)+" marks = "+arr[i][j]);
			}
		}
	}

}
