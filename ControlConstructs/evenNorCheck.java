package ControlConstructs;

import java.util.Scanner;

public class evenNorCheck {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check even or not ");
		int a = scan.nextInt();
		scan.close();
		
		if(a % 2 == 0)
			System.out.println(+a+" = Is the Even number");
		
		else 
			System.out.println(+a+" = Is the odd number ");
	}

}
