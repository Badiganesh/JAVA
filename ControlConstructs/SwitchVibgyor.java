package ControlConstructs;

import java.util.Scanner;

public class SwitchVibgyor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Alphabet = ");
		char clr = scan.next().charAt(0);
//		char clr = scan.next().toLowerCase().charAt(0);
		scan.close();
		
		switch(clr)
		{
		case 'v':
		case 'V':
			System.out.println("Voilate color");
			break;
			
		case 'i':
		case 'I':
			System.out.println("Indigo color");
			break;
		
		case 'b':
		case 'B':
			System.out.println("Blue color");
			break;
		
		case 'g':
		case 'G':
			System.out.println("Green color");
			break;
		
		case 'y':
		case 'Y':
			System.out.println("Yellow color");
			break;
		
		case 'o':
		case 'O':
			System.out.println("Orange color");
			break;
		
		case 'r':
		case 'R':
			System.out.println("Red color");
			break;
			
			default:
				System.out.println("Entered a invalid input ");
			
		}
		System.out.println("-----> The End <------");
				
	}

}
