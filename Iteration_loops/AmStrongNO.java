package com.kn.Iteration_loops;

import java.util.Scanner;

public class AmStrongNO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a no to check Amstrong or not");
		int n = scan.nextInt();
		int r=0 , sum=0, temp=n;
		while(n>0)
		{
			r = n%10;
			r = r*r*r;
			sum +=r;
			n /=10;
		}
		if(sum==temp) {
			System.out.println(temp+" Is a Amstrong no");
		}
		else
			System.out.println(temp+ " IS not a Amstrong no");
		scan.close();
	}

}
