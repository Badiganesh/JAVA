package Sorting;

import java.util.Scanner;

public class SelctionSortDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
//		Array Creation an Declaration
		int arr[]=new int[scan.nextInt()];
//		Array initialization
		System.out.println("Enter the Array Elements for SelctionSort");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		 SelectionSort Selection = new SelectionSort(arr);
//		 Array Traversing
		 System.out.println("The sorted Array Elements in SelectionSort are");
		 for(int i:arr)
		 {
			 System.out.print(i+" ");
		 }
	}

}
