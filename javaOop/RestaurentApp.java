package javaOop;

public class RestaurentApp {
	
	public static void main(String[] args)
	{
		Restaurent R1 = new Restaurent("Rameshwaram","Bengaluru",26,60);
		System.out.println(" The name of the Restaurent = "+R1.name);
		System.out.println(" The location of the Restaurent is = "+R1.location);
		System.out.println(" The no of  verities of the dish in  Restaurent are = "+R1.verity);
		System.out.println(" The min cost of the dish in this Restaurent is = "+R1.cost);
	}

}
