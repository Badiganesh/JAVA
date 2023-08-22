package ControlConstructs;

import java.util.Scanner;

public class vowels {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Char to check");
		char c = scan.next().toLowerCase().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("The Char type is vowel ");
		}
		else
		{
			System.out.println("Consonent");
		}
	}
}
