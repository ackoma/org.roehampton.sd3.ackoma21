class User {

    private int id; // User ID
    private String name; // User name
    private Booking currentBooking; // Stores their booking (only one allowed in this system)

    public User(int id, String name) { // Constructor
        this.id = id;
        this.name = name;
    }

    public void book(Accommodation place) { // Method to attempt a booking

        if (place.isBooked()) { // Checks if already booked by someone else
            System.out.println("Sorry " + name + ", " + place.getName() + " is already booked.");
            return; // Stops booking
        }

        if (currentBooking != null && currentBooking.isActive()) { // Checks if this user already booked something
            System.out.println(name + " already has a booking. Cancel first.");
            return; // Stops booking attempt
        }

        currentBooking = new Booking(this, place); // Creates a new booking
        System.out.println(name + " booked " + place.getName()); // Confirmation message
    }

    public void cancel(Accommodation place) { // Method to cancel booking

        if (currentBooking != null && currentBooking.isActive()
                && currentBooking.getAccommodation().equals(place)) { // Checks if user has a valid booking for this place

            currentBooking.cancel(); // Cancels the booking
            currentBooking = null; // Removes the reference
        } else {
            System.out.println(name + " has no booking for " + place.getName()); // If they try canceling something they don't have
        }
    }
}
