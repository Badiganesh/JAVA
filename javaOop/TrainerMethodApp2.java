package javaOop;

public class TrainerMethodApp2 {

	public static void main(String[] args) {
		
		TrainerMethod t1 = new TrainerMethod();
		t1.giveData(0, null, "java");
		System.out.println("Id = "+t1.id+", name = "+t1.name+", subject = "+t1.subject);
		
		System.out.println("---------------------------------------------");

		TrainerMethod t2 = new TrainerMethod();
		t1.giveData(6366,null , "c++");
		System.out.println("Id = "+t1.id+", name = "+t1.name+", subject = "+t1.subject);
		
		System.out.println("---------------------------------------------");
		
		TrainerMethod t3 = new TrainerMethod();
		t1.giveData(98665, "Sandesh", "Testing");
		System.out.println("Id = "+t1.id+", name = "+t1.name+", subject = "+t1.subject);
	}
}
