package javaOop;

public class TrainerMethod {
	int id;
	String name;
	String subject;
	
	void teach() {
		System.out.println("strated Teaching");
	}
	void takeAttandance() {
		
		System.out.println("taken Attandence");
	}
	
	void giveData( int a, String b, String c) {
		id = a;
		name =b;
		subject =c;
	}

}
