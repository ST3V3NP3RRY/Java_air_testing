package people;

import Flight.Flight;

import java.util.ArrayList;

public class Passenger extends Person{

    private int numberOfBags;

    private ArrayList<Flight> flights;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flights = new ArrayList<>();
    }

    public int countBags() {
        return numberOfBags;
    }

    public void addFlight(Flight flightToAdd) {
       this.flights.add(flightToAdd);
    }

    public int countFlights() {
        return this.flights.size();
    }
}
