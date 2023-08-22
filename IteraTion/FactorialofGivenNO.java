package IteraTion;

import java.util.Scanner;

public class FactorialofGivenNO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of factorial to find ");
		int num = scan.nextInt();
		int fact = 1;
		for(int i=num; i>=1;i--)
		{
			fact = fact*i;
		}
		System.out.println("The factorial of the no "+num+" is = "+fact);
	}

}
