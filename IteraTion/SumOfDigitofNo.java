package IteraTion;

import java.util.Scanner;

public class SumOfDigitofNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = scan.nextInt();
		int sum =0;
		
		while(num>0)
		{
			int r = num%10;
			sum = sum+r;
			num =  num/10;
		}
		System.out.print("The sum of the num = "+sum);
	}

}
