package people;

import Aeroplane.Plane;
import Flight.Flight;

import java.util.ArrayList;

public class FlightManager extends Person{

    private Plane plane;

    private Flight flight;

    public FlightManager(String name, Plane plane, Flight flight) {
        super(name);
        this.plane = plane;
        this.flight = flight;

    }

    public int calculateSingleBaggageWeight() {
        return ( plane.getWeight() / 2 ) / plane.getCapacity();
    }

    public int calculateTotalBaggageWeight() {
        // Get total of bags booked on each flight
        // multiply that by the baggage weight for a single passenger
        // Each flight has ArrayList of passengers, loop through the array and call countBags()
        // Return total bags on flight
        return flight.getTotalBags() * calculateSingleBaggageWeight();
    }

    public int calculateWeightRemaining() {
        return ( plane.getWeight() / 2 ) - calculateTotalBaggageWeight() ;
    }
}
