package IteraTion;

import java.util.Scanner;

public class BreakStatement {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the number = ");
		int no = scan.nextInt();
		System.out.print("Enter the Break number = ");
		int b = scan.nextInt(); 
		for(int i =1;i<=no;i++)
		 {
			 if(i%b==0)
			 {
				 break;
			 }
			 System.out.println(i+" Inside the loop");
		 }
		 System.out.println("Out side the loop");
		 scan.close();
	}

}
