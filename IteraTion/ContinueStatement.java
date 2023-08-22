package IteraTion;

import java.util.Scanner;

public class ContinueStatement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				continue;
			}
			System.out.println(i+" Inside the Loop");
		}
		scan.close();
	}

}
