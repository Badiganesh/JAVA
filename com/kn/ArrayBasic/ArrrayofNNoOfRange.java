package com.kn.ArrayBasic;

import java.util.Scanner;

public class ArrrayofNNoOfRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of Array");
		int Range = scan.nextInt();
		
		int[] arr= new int[Range];
		System.out.println("Enter the Elements of Array in "+Range);
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
//		for( int x : arr) {
//			System.out.print(x+" ");
//		}
	}

}
