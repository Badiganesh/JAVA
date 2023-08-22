package com.kn.D_Array;

public class BubbleSort2Demo {

	public BubbleSort2Demo(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				int temp=0;
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}
			if(count==0)
			{
				break;
			}
		}
//		Array Traversing
//		System.out.println("The Sorted Array Elements are");
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
		
	}

}
