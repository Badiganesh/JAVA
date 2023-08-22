package IteraTion;

import java.util.Scanner;

public class ForLoopDemo {
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter i value");
		int j =0 ;
		for(int i=1 ; i<=5 ; i++)
		{
			System.out.println(i);
			System.out.println("j = "+(j));
			System.out.println("--------");
			j++;
		}
	}
}
