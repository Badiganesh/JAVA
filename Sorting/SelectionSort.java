package Sorting;

public class SelectionSort {
	public SelectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			int index=i;
			int min=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
	}
}
