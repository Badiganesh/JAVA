package ControlConstructs;

import java.util.Scanner;

public class Opertion 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first nor ");
		double a =scan.nextDouble(); 
		System.out.println("Enter a second nor ");
		double b =scan.nextDouble(); 
		System.out.println("Choose an operation + , - , * , /");
		char c = scan.next().charAt(0);
		System.out.println("The operator is "+c);
		scan.close();
		
		if (c == '+' )
		{
			System.out.println("The Addition of "+a+"+"+b + "="+(a+b));
		}
		else if (c == '-' )
		{
			System.out.println("The Substraction of "+a+"-"+b + "="+(a-b));
		}
		else if (c == '*' )
		{
			System.out.println("The Multiplication is " +a+"*"+b+ "="+( a*b) );
		}
		else if (c == '/' )
		{
			System.out.println("The Quotient is " +a+"/"+b+"="+ (a/b ));
		}
		else
		{
				System.out.println("------Invalid input------");
		}
	}
}