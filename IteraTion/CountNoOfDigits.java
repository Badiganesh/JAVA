package IteraTion;

import java.util.Scanner;

public class CountNoOfDigits{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the No = ");
		int num = scan.nextInt();
		int count = 0,r;
		while(num>0)
		{
			r = num%10;
			count++;
			num = num/10;
			
		}
		System.out.print("The count = " +count);
	}

}
