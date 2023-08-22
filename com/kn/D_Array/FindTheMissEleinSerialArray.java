package com.kn.D_Array;

import java.util.Scanner;

public class FindTheMissEleinSerialArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array Elements");
		int size = scan.nextInt();
//		Array creation and Declaration
		int arr[] = new int[size];
//		Array initialization
		System.out.println("Enter the Array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		toFindtheMisingElemofArray(arr);
	}

	public static void toFindtheMisingElemofArray(int[] arr) {
		int expsum=0,sum=0;
		expsum=(arr.length+1)*(arr.length+1+1)/2;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("The missing element is "+(expsum-sum));
	}

}
