package com.kn.if_else;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the marks = ");
		int marks = scan.nextInt();
		
		if(marks>50) {
			System.out.println("pass");
		}
		else
			System.out.println("Fail");
	}

}
