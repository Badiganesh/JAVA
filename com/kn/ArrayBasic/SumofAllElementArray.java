package com.kn.ArrayBasic;

import java.util.Scanner;

public class SumofAllElementArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Declaration & creation
		int[] arr=new int[scan.nextInt()];
		int sum=0;
//		Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element of array"+(i+1));
			arr[i]=scan.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}

}
