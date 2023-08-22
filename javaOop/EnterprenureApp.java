package javaOop;

public class EnterprenureApp {
	public static void main(String[] args) {
		Enterprenure e2 = new Enterprenure(7788);
		System.out.println(" ID = "+e2.id+" Employ name = "+e2.employname+" Ownership id ="+e2.ownerShipId);
		
		Enterprenure e1 = new Enterprenure(123,"ganu",7282);
		System.out.println(" ID = "+e1.id+" Employ name = "+e1.employname+" Ownership id ="+e1.ownerShipId);
		
		Enterprenure e3 = new Enterprenure(839,"santu");
		System.out.println(" ID = "+e3.id+" Employ name ="+e3.employname+" Ownership id ="+e3.ownerShipId);
		
		Enterprenure e4 = new Enterprenure(839,7282);
		System.out.println(" ID = "+e4.id+" Employ name ="+e4.employname+" Ownership id ="+e4.ownerShipId);
		
		
		
	}
	
}
