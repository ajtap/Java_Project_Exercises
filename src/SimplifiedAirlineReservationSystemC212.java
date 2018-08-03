//Imports ArrayLists, Scanner, and other utilities.
import java.util.*;

class Passenger {

    //Instance variables.
    ArrayList<Ticket> myTickets = new ArrayList<Ticket>(); //Contains each ticket that the user books.
    //The below variables are user-input, and are the info of the user's passenger.
    String firstName;
    String lastName;
    String address;
    String phone;

    //Constructor for class "Passenger".
    public Passenger() {

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    void cancel(Ticket t) {
        //Cancel's the passenger's ticket 't'.
    }

    ArrayList<Flight> findFlights(Airline a, String date, double time, String from) {
        /*Finds all flights for an airline on a particular date within 4 hours of a particular departure
        from a particular city.*/
    }

    Ticket bookFlight(Flight f) {
        //Books a ticket for a particular flight (for the passenger).
    }

    boolean holdsTicket(Ticket t) {
        //Reports where the passenger holds a particular ticket.
    }
}

class Ticket {

    //Instance variables.
    static int counter = 0; //Keeps track of the # of tickets the user booked, and gives each ticket a unique number.
    //The below variables contain info about each ticket that is booked.
    int ticketNumber; //Unique ticket #
    double price; //Ticket price
    String myAirline; //The airline the ticket was issued from.
    String myPassenger; //The name of the ticket owner (user).
    String myFlight; //The name of the flight the ticket books.

    //Constructor for class "Ticket".
    public Ticket() {

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    void cancel() {
        //Cancels the ticket.
        if ()
    }
}

class Airline {

    //Instance variables.
    ArrayList<Flight> flights = new ArrayList<Flight>(); //Contains each flight within the airline.
    String name; //Contains the airline name.

    //Constructor for class "Airline".
    public Airline() {

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    void cancel(Ticket t) {
        //Cancels a ticket.
    }

    void issueRefund(Ticket t) {
        /*Issues a refund --- it just prints a message to the screen about which passenger has been credited
        how much money since in this simulation we will not keep track of bank balances for passengers or airlines.*/
        System.out.println(t.myPassenger + " has been issued $" + t.price + " as a refund for a canceled ticket.");
    }

    ArrayList<Flight> findFlights(String date, double time, String origin) {
        //Finds all flights for a 4 hour departure window.
    }

    Ticket book(Passenger p, Flight f) {
        //Books a passenger on a flight.
    }

    double cost(Flight f) {
        /*Gives the cost of a ticket for  particular flight. Devise your own sensible pricing policy so that
        tickets get more expensive as a flight fills up.*/
    }

    void createFlight(double time, int numSeats, String from, String to) {
        //Creates a new flight for the Airline and makes sure that this flight operates everyday.
    }
}

class Flight {

    //Instance variables.
    ArrayList<Ticket> tickets = new ArrayList<Ticket>(); //Contains a list of the available tickets.
    static int counter = 0; //Keeps track of the # of flights, and gives each flight a unique number.
    int seats; //The # of seats on each flight.
    int filledSeats = 0; //The # of filled seats on each flight.
    int flightLength; //The approximate time the flight will last.
    int flightNumber; //Unique flight number.
    String airline; //Name of the airline.
    String originAirport; //Current location of the flight.
    String destination;
    String date; //Date of the flight's departure.
    String departureTime;

    //Constructor for class "Flight".
    public Flight() {

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    boolean matches(String d, double t, String from) {
        //Does the flight match date 'd', time 't' and originAirport 'from' to within a 4 hour departure window.
    }

    boolean hasSpace() {
        //Are there any empty spaces left?
        if (seats > 0) {
            return true;
        } else {
            return false;
        }
    }

    void addTicket(Ticket t) {
        //Add a newly issued ticket to the flight.
    }

    boolean holdsTicket(Ticket ticket) {
        //Does the flight already hold a particular ticket?
    }

    void remove(Ticket ticket) {
        //Remove a cancelled ticket from the flight.
    }

    double getCost() {
        //Use the flight's airline's method to generate the cost of the next ticket for this flight.
    }
}

class Main {
    public static void main(String[] args) {

    }

}