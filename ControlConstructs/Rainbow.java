package ControlConstructs;

import java.util.Scanner;

public class Rainbow {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Char to check VIBGYOR");
		char c = scan.next().toLowerCase().charAt(0);
		scan.close();
		if (c=='v')
		{
			System.out.println(" voilate");
		}
		else if(c=='i') {
			System.out.println(" Indigio");
		}
		else if(c=='b') {
			System.out.println(" Blue");
		}
		else if(c=='g') {
			System.out.println(" Green");
		}
		else if(c=='y') {
			System.out.println(" yellow");
		}
		else if(c=='o') {
			System.out.println(" orage");
		}
		else if(c=='r') {
			System.out.println(" Red");
		}
		
		else
		{
			System.out.println(" Not a VIBGYOR");
		}
	}
}
