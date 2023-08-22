package javaOop;

public class TrainerMethod1 {
	public static void main(String[] args) {
		
		TrainerMethod t1 = new TrainerMethod();
		t1 . giveData(1234,"ganu","java");
		System.out.println(t1.id+","+t1.name+","+t1.subject);
		t1.teach();
		t1.takeAttandance();

		TrainerMethod t2 = new TrainerMethod();
		t2 . giveData(8990,"goudu","python");
		System.out.println(t2.id+","+t2.name+","+t2.subject);
		t2.teach();
		t2.takeAttandance();
		
	}
}
