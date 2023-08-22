package com.kn.ArrayBasic;

public class swapingOfArrayVal {

	public static void main(String[] args) {
		int arr[]= new int[3];
		arr[0]=1;
		arr[1]=3;
		arr[2]=2;
		int n=arr[2];
		System.out.println("Before swapping");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After swapping");
		if(arr[1]>arr[2])
		{
			arr[2]=arr[1];
			arr[1]=n;
			
			for(int i=0;i<=arr.length-1;i++){
				System.out.print(arr[i]+" ");
			}
		}
	}

}
