package com.kn.ArrayBasic;

public class CreationofArray {

	public static void main(String[] args) {

		//		Array Declaration
		int [] arr;

		//		Array creation
		arr= new int[5];
		
		//		Array Initialization		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//		Output of the array		
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
