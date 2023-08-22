package ControlConstructs;

import java.util.Scanner;

public class methOperation 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 1st Number = ");
		double a =scan.nextDouble();
		System.out.println("Enter a 2nd Number = ");
		double b =scan.nextDouble();
		System.out.println("Choose an operation among + , - , * , / ");
		char c = scan.next().charAt(0);
		double ans = 0;
		double result = operation(a,b,c,ans);
		System.out.println("The answer is = "+result);
		scan.close();
	}
	
	static double operation(double a, double b,char c, double ans) 
	{
		if(c == '+')
		{
			ans = (a+b);
//			System.out.println("The operation of "+a+c+b+" = "+(a+b));			
		}
		else if(c == '-')
		{
			ans = (a-b);
//			System.out.println("The operation of "+a+c+b+" = "+(a-b));	
		}
		else if(c == '*')
		{
			ans = (a*b);
//			System.out.println("The operation of "+a+c+b+" = "+(a*b));	
		}
		else if(c == '/')
		{
			ans = (a/b);
//			System.out.println("The operation of "+a+c+b+" = "+(a/b));	
		}
		else 
		{
			System.out.println("Invalid operator");
		}
		return ans ;
	}
	

}
