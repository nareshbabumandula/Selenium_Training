package oops;

public abstract class Theater {
	
	// static variable
	public static int price = 100;
	
	// Non abstract method - Method with body or concrete java method
	public void onlineTicketBooking() {
		// Implementation of method body
		System.out.println("Online ticket booking facility is available..!");
	}
	
	// abstract method or body less method or method without body
	public abstract void Parking();
	
	public abstract void TicketBooking();
	
	public abstract void TicketTypes();
	
	public abstract void Cafeteria();
	
	public abstract void FireandSafety();
	
	// static method : A static method belongs to the class rather than the object of a class
	public static void SoundSystem() {
		System.out.println("Dolby digital sound system is available..!");
	}
	
	// When to use a static method?
	// If the code in the method is not dependent in instance creation and id not using any instance variable
	// If the code needs to be shared across all the instances
	// If the method need nto to be overridden (e.g. utlity methods)
	

	public static void main(String[] args) {
		
		// Theater th = new Theater(); // We cannot instantiate or create and object reference for an abstract class
		SoundSystem();
		System.out.println(price);
		
	}

}
