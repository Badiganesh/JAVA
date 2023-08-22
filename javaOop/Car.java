package javaOop;

public class Car {
	String color;
	String model;
	double price;
	
	void drive()
	{
		System.out.println("The car can be Drived at 180 km/hr");
	}
	
	void honk()
	{
		System.out.println("The car can make wovv voww");
	}

	public Car(String color, String model, double price) 
	{
//		this.color = color;
//		this.model = model;
//		this.price = price;
		color = color;
		model = model;
		price = price;
	}
	
}
