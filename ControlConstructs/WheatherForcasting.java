package ControlConstructs;

import java.util.Scanner;

public class WheatherForcasting {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the the temperature value in Fahrenheit = ");
		double F = scan.nextDouble();
		System.out.println("The tempearture in Celsius = "+Fahrenate(F));
		scan.close();
	}

	public static float Fahrenate(double F)
	{
		return (float) (((F -32)*5)/9);
	}
}
