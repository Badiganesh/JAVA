package ControlConstructs;

import java.util.Scanner;

public class concatination {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Firts name = ");
		String FN = scan.next();
		System.out.println("Enter a Middle name = ");
		String MN = scan.next();
		System.out.println("Enter a Second name = ");
		String LN = scan.next();
		String conc = Concatination(FN,MN , LN);
//		System.out.println(FN+" "+LN);
		System.out.println(conc);
		
		
	}
	static String Concatination(String FN ,String MN, String LN)
	{
		String conc = FN+ " " + MN +" " + LN;
		return conc;
		
	}
	

}
