package Multhitreds;

public class Trainmain {

	public static void main (String args[]) {
		Trainticket t1=new Trainticket();
		Passengers p1=new Passengers(t1,"lucky",5);
		Passengers p2=new Passengers(t1,"tejj",2);
		Passengers p3=new Passengers(t1,"jaga",4);
		p1.start();
		p2.start();
		p3.start();
	}
}
