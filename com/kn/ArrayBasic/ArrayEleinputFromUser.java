package com.kn.ArrayBasic;

import java.util.Scanner;

public class ArrayEleinputFromUser {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the 5 Elements");
		int[] arr=new int[5];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}
		scan.close();
	}

}
