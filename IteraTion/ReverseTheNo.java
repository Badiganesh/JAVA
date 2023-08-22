package IteraTion;

import java.util.Scanner;

public class ReverseTheNo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = scan.nextInt();
		System.out.print("The Reverse of the no is = ");
		while(num>0)
		{
			int r = num%10;
			System.out.print(r);
			num = num/10;
					
		}
		for(int i=1;num>0;i++)
		{
			int r=num%10;
			System.out.print(r);
			num = num/10;
		}
	}

}
