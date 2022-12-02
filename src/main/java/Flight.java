import Aeroplane.Plane;
import people.CabinCrewMember;
import people.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrewMember> cabinCrewMembers;

    private ArrayList<Passenger> passengers;

    private Plane plane;

    private String flightNumber;

    private String destination;

    private String departure;

    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public void addCrewMembers(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public int countCrewMembere() {
        return this.cabinCrewMembers.size();
    }
    public int countPassengers() {
        return this.passengers.size();
    }

    public void addMultiplePassengers(ArrayList<Passenger> multiplePassengers) {
        for (Passenger addedPassenger : multiplePassengers) {
            addPassenger(addedPassenger);
        }
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - this.countPassengers();
    }

    public int empty() {
        this.passengers.clear();
        return this.passengers.size();
    }
    //This needs refactored to be void
    public int checkInPassenger(Passenger passenger) {
        if (this.passengers.size() < plane.getCapacity()) {
            this.passengers.add(passenger);
        } return this.passengers.size();
    }
}
