//Imports ArrayLists, Scanner, and other utilities.
import java.util.*;

class Passenger {

    //Instance variables.
    ArrayList<Ticket> myTickets = new ArrayList<Ticket>(); //Contains each ticket that the user books.
    //The below variables are user-input, and are the info of the user's passenger.
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    Scanner input = new Scanner(System.in);
    Passenger user = new Passenger(firstName, lastName);

    //Constructor for class "Passenger".
    public Passenger(String f, String l) {
        //Not entirely sure if this works.
        System.out.print("Enter your first and last name please: ");
        firstName = input.next();
        lastName = input.next();

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters and setters for each instance variable in this class. (No setters for variables that won't change).
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    void cancel(Ticket t) {
        //Cancel's the passenger's ticket 't'.
    }

    ArrayList<Flight> findFlights(Airline a, String date, double time, String from) {
        //Finds all flights for an airline on a particular date within 4 hours of a particular departure
        //from a particular city.
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
    private static int counter; //Keeps track of the # of tickets the user booked, and gives each ticket a unique number.
    //The below variables contain info about each ticket that is booked.
    private int ticketNumber; //Unique ticket #
    private double price; //Ticket price
    private String myAirline; //The airline the ticket was issued from.
    private String myPassenger; //The name of the ticket owner.
    private String myFlight; //The name of the flight the ticket books.

    //Constructor for class "Ticket".
    public Ticket() {

    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters & Setters for each instance variable in this class. (No setters for variables that won't change).
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int a) {
        counter = a;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getMyAirline() {
        return myAirline;
    }

    public String getMyPassenger() {
        return myPassenger;
    }

    public String getMyFlight() {
        return myFlight;
    }

    void cancel() {
        //Cancels the ticket.
    }
}

class Airline {

    //Instance variables.
    ArrayList<Flight> flights = new ArrayList<Flight>(); //Contains each flight within the airline.
    private String name; //Contains the airline name.

    //Constructor for class "Airline".
    public Airline(String n) {
        name = n;
    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters & setters for each instance variable in this class. (No setters for variables that won't change).
    public String getName() {
        return name;
    }

    void cancel(Ticket t) {
        //Cancels a ticket.
    }

    void issueRefund(Ticket t) {
        //Issues a refund --- it just prints a message to the screen about which passenger has been credited
        //how much money since in this simulation we will not keep track of bank balances for passengers or airlines.
        System.out.println(t.getMyAirline() + " has been issued $" + t.getPrice() + " as a refund for a canceled ticket.");
    }

    ArrayList<Flight> findFlights(String date, double time, String origin) {
        //Finds all flights for a 4 hour departure window.
    }

    Ticket book(Passenger p, Flight f) {
        //Books a passenger on a flight.
        for (int i = 0; i <= 10000; i++) {

        }
    }

    double cost(Flight f) {
        //Gives the cost of a ticket for a particular flight. Devise your own sensible pricing policy so that
        //tickets get more expensive as a flight fills up.
        System.out.println(f.tickets);
        f.getCost();
    }

    void createFlight(double time, int numSeats, String from, String to) {
        //Creates a new flight for the Airline and makes sure that this flight operates everyday.
        flights.add(new Flight(time, numSeats, from, to));
        Flight.setCounter(Flight.getCounter() + 1);
    }
}

class Flight {

    //Instance variables.
    ArrayList<Ticket> tickets = new ArrayList<Ticket>(); //Contains a list of the available tickets.
    private static int counter; //Keeps track of the # of flights, and gives each flight a unique number.
    private int seats; //The # of seats on each flight.
    private int filledSeats; //The # of filled seats on each flight.
    private int flightNumber; //Unique flight number.
    private String flightLength; //The approximate time the flight will last.
    private String airline; //Name of the airline.
    private String originAirport; //Current location of the flight.
    private String destination;
    private String date; //Date of the flight's departure.
    private double departureTime;

    //Constructor for class "Flight".
    public Flight(double ti, int nu, String fr, String to) {
        setDepartureTime(ti);
        setSeats(nu);
        setOriginAirport(fr);
        setDestination(to);
    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters & setters for each instance variable in this class. (No setters for variables that won't change).
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int a) {
        counter = a;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int a) {
        seats = a;
    }

    public int getFilledSeats() {
        return filledSeats;
    }

    public void setFilledSeats(int a) {
        filledSeats = a;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getFlightLength() {
        return flightLength;
    }

    public String getAirline() {
        return airline;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String a) {
        originAirport = a;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String a) {
        destination = a;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String a) {
        date = a;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(double a) {
        departureTime = a;
    }

    boolean matches(String d, double t, String from) {
        //Does the flight match date 'd', time 't' and originAirport 'from' to within a 4 hour departure window.
    }

    boolean hasSpace() {
        //Are there any empty spaces left?
        if (getFilledSeats() < getSeats()) {
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
