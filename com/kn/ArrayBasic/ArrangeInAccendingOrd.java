package com.kn.ArrayBasic;

import java.util.Scanner;

public class ArrangeInAccendingOrd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of Array");
		int length = scan.nextInt();
		int[] arr = new int[length];
		
		System.out.println("Enter the array Elements of length"+length);
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		AccendingOrder(arr[length],arr['i']);
	}

	private static void AccendingOrder(int length, int i) {
		
	}

}
