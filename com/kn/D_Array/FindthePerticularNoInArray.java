package com.kn.D_Array;

import java.util.Scanner;

public class FindthePerticularNoInArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Declaration and Creation
		int[] arr= new int[scan.nextInt()];
//		Array	initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Elements of Array Index "+(i+1));
			arr[i] = scan.nextInt();
		}		
		System.out.println("Enter a no to find");
		int num = scan.nextInt();
		
		findTheNoinArray(num,arr);
		toFindthePERticularIndex(arr);
	}

//		Method for Finding particular index
	public static void toFindthePERticularIndex(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the index no to find Element = ");
		int index = scan.nextInt();
		System.out.println(arr[index]+" Is the Element which is present in Array index "+arr[2]);
		
	}

//		method to find the no present or not in array
	public static void findTheNoinArray(int num, int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				System.out.println("The Array Element "+ num+" is present in array "+arr[i]);
			}
//			else
//				System.out.println("The no is not present");
		}
	}

}
