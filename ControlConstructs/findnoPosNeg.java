package ControlConstructs;
import java.util.Scanner;
public class findnoPosNeg {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int a = scan.nextInt();
		scan.close();
		 
		if (a>0) 
		 {
			 System.out.println("The nor is positive ");
		 }
		 
		else if(a==0) 
		 {
			 System.out.println("The nor is Zero ");
		 }
		 
		else 
		 {
			 System.out.println("The nor is negative ");
		 }
	}
}
