package com.kn.Iteration_loops;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no to Check Prime or not = ");
		int num = scan.nextInt();

		boolean flag = isaPrime(num);
		if (flag) {
			System.out.println(num + " is a  prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}

	private static boolean isaPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			} 
		}
		return true;
	}

}
