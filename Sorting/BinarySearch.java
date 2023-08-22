package Sorting;

import java.util.Scanner;

public class BinarySearch {

	public void binarysearch(int[] arr) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Element to find in the Array");
		int ele=scan.nextInt();
		int position=-1;
		int low=0;
		int high=arr.length;
		boolean isEleFound = false;
		
		while(low<=high)
		{
		int mid = (low+high)/2;
			if(ele==arr[mid])
			{
				position=mid+1;
				isEleFound=true;
				break;
			}
			else if(ele>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(isEleFound==false)
		{
			System.out.println("The Element is not Found in the Array");
		}
		else
			System.out.println("The Element is Found in the array at position : "+position);
	}

}
