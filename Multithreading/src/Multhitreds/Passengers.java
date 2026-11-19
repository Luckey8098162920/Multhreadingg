package Multhitreds;

public class Passengers extends Thread{
	Trainticket train;
	String name;
	int seat;
	public Passengers(Trainticket train, String name, int seat) {
		super();
		this.train = train;
		this.name = name;
		this.seat = seat;
	}
	public void run() {
	train.ticketbooking(name, seat);
	}

}
