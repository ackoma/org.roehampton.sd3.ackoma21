class Booking {

    private static int nextID = 1; // Creates a shared counter for unique booking IDs
    private int id; // Stores this booking's unique ID
    private User user; // Who made the booking
    private Accommodation accommodation; // What was booked
    private boolean active; // True if booking is still valid

    public Booking(User user, Accommodation accommodation) { // Constructor
        this.id = nextID++; // Assigns a new ID and increments the counter
        this.user = user; // Sets the user
        this.accommodation = accommodation; // Saves the accommodation
        this.active = true; // Marks booking as active
        accommodation.setBooked(true); // Marks the accommodation as booked
    }

    public Accommodation getAccommodation() { return accommodation; } // Returns accommodation
    public boolean isActive() { return active; } // Returns booking status

    public void cancel() { // Cancels the booking
        active = false; // Marks inactive
        accommodation.setBooked(false); // Makes accommodation available again
        System.out.println("Booking #" + id + " cancelled."); // Prints cancel message
    }
}
