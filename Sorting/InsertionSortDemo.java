package Sorting;

import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Creation and Declaration
		int arr[]=new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the Array Elements for Selection Sort ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		InsertionSort Insort = new InsertionSort();
		int brr[]=Insort.insort(arr);
		System.out.println("The sorted Elements in Selection Sort are");
		for(int i:brr)
		{
			System.out.print(i+" ");
		}
	}

}
