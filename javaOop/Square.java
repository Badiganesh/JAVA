package javaOop;
import java.util.Scanner;
public class Square {
	public static void main(String[] args)
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a nor for Square = ");
		int a = scan.nextInt();
		int square = a*a;
		System.out.println("The squre of the nor is " + square);
	}

}
