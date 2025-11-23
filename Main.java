public class Main { // This defines a class named Main, where the program will start.

    public static void main(String[] args) { // This is the main method. Every Java program starts here.

        // Create accommodations (objects based on different types)
        Accommodation flat = new Flat(1, "Flat", "London", 280.0, true); // Creates a Flat object
        Accommodation hotel = new Hotel(2, "Hotel", "Bournemouth", 80.0, 4); // Creates a Hotel object
        Accommodation villa = new Villa(3, "Villa", "Scotland", 350.0, true); // Creates a Villa object

        // Create users (people who will book accommodations)
        User Elisabeth = new User(1, "Elisabeth"); // Creates a User object named Elisabeth
        User Aaron = new User(2, "Aaron"); // Creates a User object named Aaron
        User Kobe = new User(3, "Kobe"); // Creates a User object named Kobe

        // Booking attempts
        Elisabeth.book(flat); // Elisabeth tries to book the flat
        Aaron.book(flat); // Aaron tries but fails because Elisabeth already booked it
        Kobe.book(villa); // Kobe successfully books the villa

        System.out.println("\nBooking Status"); // Prints a blank line and "Booking Status"
        System.out.println(flat);  // Displays current state of the flat
        System.out.println(hotel); // Displays hotel status
        System.out.println(villa); // Displays villa status

        // Elisabeth cancels her booking
        System.out.println("\nElisabeth cancels"); // Notifies the user what is happening
        Elisabeth.cancel(flat); // Elisabeth cancels her booking

        // Aaron tries again
        System.out.println("\nAaron books again."); // Message for clarity
        Aaron.book(flat); // Now the flat is available so Aaron can book it

        System.out.println("\n Updated Booking"); // Display updated status
        System.out.println(flat);
        System.out.println(hotel);
        System.out.println(villa);
    }
}
