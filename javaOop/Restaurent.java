package javaOop;

public class Restaurent {
	String name;
	String location;
	int verity;
	double cost;
	
	void taste()
	{
		System.out.println("The taste is too good ");
	}
	
	void rush()
	{
		System.out.println("The restaurent is too rush ");
	}

	public Restaurent(String name, String location, int verity, double cost) 
	{
		this.name = name;
		this.location = location;
		this.verity = verity;
		this.cost = cost;
	}
}
