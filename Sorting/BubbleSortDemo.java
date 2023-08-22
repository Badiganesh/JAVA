package Sorting;

import java.util.Scanner;

public class BubbleSortDemo {

	public static void main(String[] args, Object Teacher) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Creation And declaration
		int arr[]=new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the array Elements for BubbleSort");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		BubbleSort bubbleSort= new BubbleSort();
		int brr[]= bubbleSort.BubbleSort(arr);

//		Array Traversing
		System.out.println("The Sorted elements in BubbleSort Method are");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
}
