class Accommodation { // A blueprint for different types of places to stay

    private int id; // Stores the accommodation’s ID number
    private String name; // Name of the accommodation
    private String location; // City or area where it's located
    private double price; // How much it costs
    private boolean booked; // Shows whether the place is booked or not

    public Accommodation(int id, String name, String location, double price) { // Constructor to create an object
        this.id = id; // Assigns the given id to this object
        this.name = name; // Assigns the given name
        this.location = location; // Assigns the given location
        this.price = price; // Assigns the price
        this.booked = false; // Default: not booked yet
    }

    public String getName() { return name; } // Method to return the name
    public boolean isBooked() { return booked; } // Method to check if it's booked
    public void setBooked(boolean booked) { this.booked = booked; } // Method to change booking status

    public String toString() { // Returns a readable text version of the object
        return name + " (" + location + ") - " + (booked ? "Booked" : "Available"); // Shows if booked or not
    }
}
