package com.kn.D_Array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array creation and Declaration
		int arr[]=new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		sortArrayElemusingBubbleSort(arr);
	}
//		
	public static void sortArrayElemusingBubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
			if(count==0)
			{
				break;
			}
		}
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}
}
