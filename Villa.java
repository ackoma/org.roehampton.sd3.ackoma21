class Villa extends Accommodation { // Villa also inherits from Accommodation

    private boolean pool; // True if villa has a pool

    public Villa(int id, String name, String location, double price, boolean pool) { // Constructor
        super(id, name, location, price); // Calls parent constructor
        this.pool = pool; // Sets pool option
    }

    public String toString() { // Custom text display
        return "Villa → " + super.toString() + " | Pool: " + (pool ? "Yes" : "No");
    }
}
