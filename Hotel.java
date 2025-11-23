class Hotel extends Accommodation { // Hotel inherits Accommodation

    private int stars; // Hotels have star ratings

    public Hotel(int id, String name, String location, double price, int stars) { // Constructor
        super(id, name, location, price); // Calls parent constructor
        this.stars = stars; // Stores number of stars
    }

    public String toString() { // Custom text display
        return "Hotel → " + super.toString() + " | Stars: " + stars;
    }
}