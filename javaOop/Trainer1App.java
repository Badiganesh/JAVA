package javaOop;

public class Trainer1App {

	public static void main(String[] args)
	{
		Trainer1 t1 = new Trainer1();
		t1.id = 1234;
		t1.name = "arun";
		t1.subject = "java";
		
	//	t1.giveData(1234,"Arun","java");
		
		System.out.println(t1.id+","+ t1.name +","+ t1.subject);
		t1.teach();
		t1.takeattandance();
		
		Trainer1 t2 = new Trainer1();
		t2.id = 4321;
		t2.name = "Sandesh";
		t2.subject = "Testing";
		
		System.out.println(t2.id+","+ t2.name +","+ t2.subject);
		t2.teach();
		t2.takeattandance();
	}
}
