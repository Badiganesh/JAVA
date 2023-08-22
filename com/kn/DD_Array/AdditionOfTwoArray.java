package com.kn.DD_Array;

import java.util.Scanner;

public class AdditionOfTwoArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total no of Room:");
		int rollno= scan.nextInt();
		System.out.println("Enter the total No of Student :");
		int noofname = scan.nextInt();
//		Array Declaration and Creation
		String [] []arr= new String[rollno][noofname];
//		Array initialization 
		for(int i=0;i<rollno;i++){
			System.out.println("Enter the Data of Students from Room no : "+(i+1));
			for(int j=0;j<noofname;j++){
				System.out.println("Enter the name of the student :"+(j+1));
				arr[i][j] = scan.next();
			}
		}
//		Array traversing
		for(int i=0;i<arr.length;i++){
			System.out.println("The Room no of the Student"+(i+1));
			for(int j=0;j<arr[i].length;j++){
				System.out.println("The name of the Student "+arr[i][j]+" is From the Room no"+(i+1));
			}
		}
	}

}
