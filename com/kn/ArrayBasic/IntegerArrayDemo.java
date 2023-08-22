package com.kn.ArrayBasic;

import java.util.Scanner;

public class IntegerArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Array Declaration 
		int []	arr;

	//Array creation	
		System.out.println("Enter the size of the array");
		arr =new int[scan.nextInt()];
		
//		Array Intitiallization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Integer Element for "+(i+1));
			arr[i]=scan.nextInt();
		}
//		Array traversing forward
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
//		Array traversing in bbackward
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	
		
	}

}
