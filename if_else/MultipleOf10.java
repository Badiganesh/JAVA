package com.kn.if_else;

import java.util.Scanner;

public class MultipleOf10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int num = scan.nextInt();
		
		if(num%10==0)
		{
			System.out.println(num+" The no is Multiple of 10");
		}
		else
			System.out.println(num+" The no is Not a Multiple of 10");
			
	}

}
