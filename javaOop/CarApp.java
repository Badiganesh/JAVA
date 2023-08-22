package javaOop;

public class CarApp {

	public static void main(String[] args) {
		
		Car c1 = new Car("Black","Seltose",1600000);
		System.out.println(c1.color+ " , "+c1.model+ " , "+c1.price);
		Car c2 = new Car("Red","i10",1200000);
		System.out.println(c2.color+ " , "+c2.model+" , "+c2.price);
		
		c1.drive();
		c1.honk();

	}

}
