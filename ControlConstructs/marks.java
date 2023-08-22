package ControlConstructs;

import java.util.Scanner;

public class marks {
	public static void main(String[] args)
	{
		System.out.println("Enter the Marks obtained = ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if ( a >= 90)
		{
			System.out.println(" A grade");
		}
		else if(a>=75 && a<90)
		{
			System.out.println(" B grade");
		}
		else if(a>=50 && a<75)
		{
			System.out.println(" C grade");
		}
		else if(a>=35 && a<50)
		{
			System.out.println(" D grade");
		}
		else 
		{
			System.out.println(" Better luck next time ");
		}
	}
}
