package Multhitreds;

public class Trainticket {

	
	int avaibletickets=10;
	 synchronized void ticketbooking(String name,int seat) {
		System.out.println(name+"bookingstated");
	
	 if(avaibletickets>=seat) {
		 System.out.println("ok letss goo"); 
	 try {
		 Thread.sleep(2000);
	 }catch(InterruptedException e) {
		 System.out.println(e);
	 } 
	 avaibletickets = avaibletickets - seat;
	 System.out.println(name+seat+"bookeddddd");
	System.out.println(name+"booking success");
	System.out.println(avaibletickets+"remaimng tickets");
	 }else {
		 System.out.println(name+"sorry ticketslevvv");
		 System.out.println(avaibletickets+"vunnayi");
	 }{
	
	 }}}