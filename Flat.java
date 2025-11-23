class Flat extends Accommodation { // Flat inherits from Accommodation

    private boolean kitchen; // Extra feature: does it have a kitchen?

    public Flat(int id, String name, String location, double price, boolean kitchen) { // Constructor
        super(id, name, location, price); // Calls the parent class constructor
        this.kitchen = kitchen; // Sets kitchen availability
    }

    public String toString() { // Overrides parent's display method
        return "Flat → " + super.toString() + " | Kitchen: " + (kitchen ? "Yes" : "No");
    }
}
