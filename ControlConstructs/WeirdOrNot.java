package ControlConstructs;

import java.util.Scanner;

public class WeirdOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		int n = scan.nextInt();

		if (n % 2 == 0) {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird but in  rage of 2 to 5");
			} else if (n >= 6 && n <= 20) {
				System.out.println("weird");
			} else if (n > 20) {
				System.out.println("Not Weird but more than 20");
			}
		} else {
			System.out.println("wired");
		}
		scan.close();
	}

}
