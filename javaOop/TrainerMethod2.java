package javaOop;

public class TrainerMethod2 {
 int id;
 String name;
 String subject;
 
 void teach() {
	 System.out.println("Started Teaching");
 }
 void takenAttandance() {
	 System.out.println("taken Attandance");
 }
 void giveData() {
	 
 }
 void giveData(int a) {
	id = a; 
 }
 void giveData(int a,String b) {
	id = a;
	name = b;
 }
 void giveData(int a, String b, String c ) {
	 id = a ;
	 name = b;
	 subject = c;
 }
 
}
