package IteraTion;

import java.util.Scanner;

public class PalinDromOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number to Check Palindrom or Not = ");
		int n =scan.nextInt();
		int temp =n,sum =0,count=0;
		while(n>0)
		{
			int r = n%10;
			sum = sum*10+r;
			count++;
			n =n/10;
		}
		System.out.println("The Count of the Digit is = "+count);
		if(sum ==temp)
		{
			System.out.println(sum+" = is a Palindrom Number of "+temp);
		}
		else
		{
			System.out.println(sum+" = is not a Palindrom Number of "+temp);
		}
	}

}
