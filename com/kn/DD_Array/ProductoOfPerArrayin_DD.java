package com.kn.DD_Array;

import java.util.Scanner;

public class ProductoOfPerArrayin_DD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the 1st Array :");
		int size1=scan.nextInt();
		System.out.println("Enter the Size of the 2nd Array");
		int size2=scan.nextInt();
		int arr[][] =new  int[size1][size2];
//		Array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element for Array "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the Array"+(i+1)+" Element of "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		int pro=1;
//		Array traversing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("The element of array"+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("The Elements are "+arr[i][j]);
				pro*=arr[i][j];
			}
			System.out.println("The product of the Array : "+pro);
		}
	}

}
