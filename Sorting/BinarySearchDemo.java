package Sorting;

import java.util.Scanner;

public class BinarySearchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the Array Elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		BinarySearch BinarySearch = new BinarySearch();
		BinarySearch.binarysearch(arr);
	}

}
