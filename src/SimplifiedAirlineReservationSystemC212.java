//Imports ArrayLists, Scanner, and other utilities.
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.*;

class Passenger {

    //Instance variables.
    private ArrayList<Ticket> myTickets = new ArrayList<Ticket>(); //Contains each ticket that the passenger books.
    //The below variables are the info of each passenger.
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private Scanner user_input = new Scanner(System.in);

    //Constructor for class "Passenger".
    public Passenger() {


    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters and setters for each instance variable in this class. (No setters for variables that won't change).
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String a) {
        firstName = a;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String a) {
        lastName = a;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    void cancel(Ticket t) {
        //Cancel's the passenger's ticket 't'.
        System.out.println("which ticket");
        user_input.next();
        if (String.valueOf(user_input) == Integer.toString(t.getTicketNumber())) {
            myTickets.remove(1);
        }
    }

    ArrayList<Flight> findFlights(Airline a, String date, double time, String from) {
        //Finds all flights for an airline on a particular date within 4 hours of a particular departure
        //from a particular city.
        ArrayList<Flight> valid = new ArrayList<Flight>();
        for (int i = 0; i <= a.flights.size(); i++) {
            if (a.flights.get(i).getDate() == date) {
                if (a.flights.get(i).getDepartureTime() == time) {
                    if (a.flights.get(i).getOriginAirport() == from) {
                        valid.add(a.flights.get(i));
                    }
                }
            }
        }
        return valid;
    }

    void bookFlight(Flight f) {
        //Books a ticket for a particular flight (for the passenger).
        System.out.print("Type the number of the flight you wish to book.");
        user_input.next();
        for (int i = 0; i <= f.getTickets().size(); i++) {
            if (holdsTicket(f.getTickets().get(i))) {
                System.out.println("You already booked a ticket for this flight.");
            } else {
                myTickets.add(new Ticket(
                        f.getAirline(),
                        getFirstName() + " " + getLastName(),
                        f.getOriginAirport() + " to " + f.getDestination(),
                        f.getCost()));
                System.out.println("Successfully Booked Ticket.");
            }
            // Not sure why this needs a return statement. (Originally returns type Ticket)
        }
    }

    boolean holdsTicket(Ticket t) {
        //Reports where the passenger holds a particular ticket.
        return myTickets.contains(t);
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
    public Ticket(String ai, String pa, String fl, double pr) {
        setMyAirline(ai);
        setMyPassenger(pa);
        setMyFlight(fl);
        setPrice(pr);
        setCounter(getCounter() + 1);
        setTicketNumber(getCounter());
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

    public void setTicketNumber(int a) {
        ticketNumber = a;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double a) {
        price = a;
    }

    public String getMyAirline() {
        return myAirline;
    }

    public void setMyAirline(String a) {
        myAirline = a;
    }

    public String getMyPassenger() {
        return myPassenger;
    }

    public void setMyPassenger(String a) {
        myPassenger = a;
    }

    public String getMyFlight() {
        return myFlight;
    }

    public void setMyFlight(String a) {
        myFlight = a;
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
         setName(n);
    }

    //Overrides toString() method for testing.
    public String toString() {

    }

    //Getters & setters for each instance variable in this class. (No setters for variables that won't change).
    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    void cancel(Ticket t) {
        //Remove a cancelled ticket from the flight.
        // Not sure why this is here, when the cancel() function in Flights can be used.
    }

    void issueRefund(Ticket t) {
        //Issues a refund --- it just prints a message to the screen about which passenger has been credited
        //how much money since in this simulation we will not keep track of bank balances for passengers or airlines.
        System.out.println(t.getMyAirline() + " has been issued $" + t.getPrice() + " as a refund for a canceled ticket.");
    }

    ArrayList<Flight> findFlights(String date, double time, String origin) {
    }

    Ticket book(Passenger p, Flight f) {
        //Books a passenger on a flight.
        p.setFirstName("");
        p.setLastName("");
        Ticket.setCounter(Ticket.getCounter() + 1);
        f.setFilledSeats(f.getFilledSeats() + 1);
    }

    double cost(Flight f) {
        //Gives the cost of a ticket for a particular flight. Devise your own sensible pricing policy so that
        //tickets get more expensive as a flight fills up.
        int start_cost = 100;
        return start_cost + start_cost * (f.getFilledSeats());
    }

    void createFlight(double time, int numSeats, String from, String to) {
        //Creates a new flight for the Airline and makes sure that this flight operates everyday.
        flights.add(new Flight(time, numSeats, from, to));
        Flight.setCounter(Flight.getCounter() + 1);
    }
}

class Flight {

    //Instance variables.
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>(); //Contains a list of the available tickets.
    private static int counter; //Keeps track of the # of flights, and gives each flight a unique number.
    private int seats; //The # of seats on each flight.
    private int filledSeats; //The # of filled seats on each flight.
    private int flightNumber; //Unique flight number.
    private String flightLength; //The approximate time the flight will last.
    private String airline; //Name of the airline.
    private String originAirport; //Current location of the flight.
    private String destination; //End location of the flight.
    private String date; //Date of the flight's departure.
    private double departureTime; //Time of day the flight departs.

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

    public void setAirline(Airline a) {
        airline = a.getName();
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

    public ArrayList<Ticket> getTickets() { return tickets; }

    boolean matches(String d, double t, String from) {
        //Does the flight match date 'd', time 't' and originAirport 'from' to within a 4 hour departure window?
    }

    boolean hasSpace() {
        //Are there any empty spaces left?
        return (getFilledSeats() < getSeats());
    }

    void addTicket(Ticket t) {
        //Add a newly issued ticket to the flight.
        getTickets().add(t);
        // Might need revision.
    }

    boolean holdsTicket(Ticket ticket) {
        return (ticket.getMyFlight() != null);
    }

    void remove(Ticket ticket) {
        //Remove a cancelled ticket from the flight.
        for (int i = 0; i <= tickets.size(); i++) {
            if (ticket.getTicketNumber() == getTickets().get(i).getTicketNumber()) {
                getTickets().remove(i);
            }
        }
    }

    double getCost() {
        //Use the flight's airline's method to generate the cost of the next ticket for this flight.
    }
}

class Main {
    public static void main(String[] args) {

    }

}
