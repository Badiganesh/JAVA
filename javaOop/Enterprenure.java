package javaOop;

public class Enterprenure {
	int id;
	String employname;
	int ownerShipId;

	void acquire() {

		System.out.println("Acquiring the another organisation ");
	}

	void raisefund() {

		System.out.println("hurryyy .... raise the fund");

	}
	public Enterprenure(int id,String employname, int ownerShipId) {
		this.id = id;
		this.employname = employname;
		this.ownerShipId = ownerShipId;
	}
	
	
	public Enterprenure(int id,  int ownerShipId) {
		super();
		this.id = id;
		this.ownerShipId = ownerShipId;
	}

	public Enterprenure(int id) {
		this.id = id;
	}
	

	public Enterprenure(int id, String employname) {
	
		this.id = id;
		this.employname = employname;
	}

	public Enterprenure( String employname) {
		this.employname = employname;
	}

}
	
	



