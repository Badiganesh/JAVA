package ControlConstructs;

import java.util.Scanner;

public class Ptr {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the The value of principle ");
		double p = scan.nextDouble();
		System.out.println("Enter the The value of time ");
		double T = scan.nextDouble();
		System.out.println("Enter the The value of rate ");
		double R = scan.nextDouble();
		System.out.println("The PTR value is"+Ptrcal(p,T,R));
		scan.close();
	}

	private static double Ptrcal(double p, double T, double R) {
		return (p*T*R)/100;
	}

}
