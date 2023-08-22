package com.kn.Iteration_loops;

import java.util.Scanner;

public class AddLastTwoNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the no");
		int num = scan.nextInt();
		int FirstNo=0 ,SecondNo=1;
		System.out.print(FirstNo+" "+SecondNo+" ");
		for(int i=3;i<=num;i++)
		{
			int nextNo = FirstNo+SecondNo;
			System.out.print(nextNo+" ");
			FirstNo=SecondNo;
			SecondNo=nextNo;
		}
	}

	
}
