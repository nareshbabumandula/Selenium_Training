package oops;

public class PVR extends Theater{

	public static void main(String[] args) {
		PVR p = new PVR();
		p.Parking();
		p.TicketBooking();
		p.Cafeteria();
		p.FireandSafety();
		p.onlineTicketBooking();
		SoundSystem();
		System.out.println(price);
	}

	@Override
	public void Parking() {
		System.out.println("Parking facility is available with a capacity to park 500 bikes and 100 cars");
		
	}

	@Override
	public void TicketBooking() {
		System.out.println("Ticket bokking facility over the counter is available");
	}

	@Override
	public void TicketTypes() {
		System.out.println("Ticket types as Balcony, Regular, Deluxe types are available");
		
	}

	@Override
	public void Cafeteria() {
		System.out.println("Cafeteria is availble");
		
	}

	@Override
	public void FireandSafety() {
		System.out.println("Fire and safety precautions have been taken care with emergency exit and fire distinguisher");
		
	}

}
