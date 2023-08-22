package ControlConstructs;

import java.util.Scanner;

public class Cube 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the nor to perform cube = ");
		int a = scan.nextInt();
		System.out.println("The cube value for the " +a +" no is = "+cubeof(a));
		scan.close();
		
	}
	
	public static double cubeof(int a)
	{
//		double cube = Math.pow(a, 3);
		double cube = a*a*a;
		return cube;
	}

}
