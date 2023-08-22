package com.kn.D_Array;

import java.util.Scanner;

public class HelloReversePrinting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		String []arr= new String[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the String type Array Element"+(i+1));
			arr[i]=scan.next();
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
	}

}
