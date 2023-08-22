package com.kn.D_Array;

import java.util.Scanner;

public class Divby5EleminArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the elements");
		int[] arr= new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Array elements "+(i+1));
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+" ");
			}
		}System.out.println(" Are the Array elements which are div by 5");
	}

}
