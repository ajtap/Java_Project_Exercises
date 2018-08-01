//Imports ArrayLists and other utilities.
import java.util.*;

class Passenger {

    //Instance variables.
    ArrayList<Ticket> myTickets = new ArrayList<Ticket>();
    String firstName;
    String lastName;
    String address;
    String phone;

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
    static int counter = 0;
    int ticketNumber;
    double price;
    String myAirline;
    String myPassenger;
    String myFlight;

    void cancel() {
        //Cancels the ticket.
    }
}

class Airline {

    //Instance variables.
    ArrayList<Flight> flights = new ArrayList<Flight>();
    String name;

    void cancel(Ticket t) {
        //Cancels a ticket.
    }

    void issueRefund(Ticket t) {
        /*Issues a refund --- it just prints a message to the screen about which passenger has been credited
        how much money since in this simulation we will not keep track of bank balances for passengers or airlines.*/
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
    ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    static int counter = 0;
    int seats;
    int filledSeats;
    int flightLength;
    int flightNumber;
    String airline;
    String originAirport;
    String destination;
    //Unknown Types?
    tickets;
    date;
    departureTime;

    boolean matches(String d, double t, String from) {
        //Does the flight match date 'd', time 't' and originAirport 'from' to within a 4 hour departure window.
    }

    boolean hasSpace() {
        //Are there any empty spaces left?
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