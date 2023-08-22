package ControlConstructs;
import java.util.Scanner;
public class Arithmeticoperation
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose an operation - , * , / , %");
		char op = scan.next().charAt(0);
		
		if(op=='-'||op=='*'||op=='/'||op=='%')
		{
		System.out.println("Enter a Firts no = ");
		int a = scan.nextInt();
		System.out.println("Enter a Second no = ");
		int b = scan.nextInt();
		scan.close();
		
		switch(op)
		{
		case '-':
			System.out.println("The result "+a+"-"+b+" = "+substracNumber(a, b));
			break;
		case '*':
			System.out.println("The result "+a+"*"+b+" = "+multiplicationNumber(a,b));
			break;
		case '/':
			System.out.println("The result "+a+"/"+b+" = "+divisiomNumber(a,b));
			break;
		case '%':
			System.out.println("The result "+a+"%"+b+" = "+findReminderNumber(a,b));
		}
		}
		else
			System.out.println("invalid Input");
	}

	public static int substracNumber(int a, int b)
	{
		int diff = a-b;
		return diff;
	}
	
	public static int multiplicationNumber(int a, int b)
	{
		int mult = a*b;
		return mult;
	}
	
	public static double divisiomNumber(int a, int b)
	{
		double div = a/b;
		return div;
	}
	
	public static int findReminderNumber(int a, int b)
	{
		int rem = a%b;
		return rem;
	}
}

