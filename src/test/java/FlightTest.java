import Aeroplane.Plane;
import Aeroplane.PlaneType;
import Flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.CrewRank;
import people.Passenger;



import java.time.LocalTime;
import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    CabinCrewMember cabinCrewMember;

    Passenger passenger;

    Plane plane;

    LocalTime flightTime;

    @Before
    public void before() {
        flightTime = LocalTime.of(22, 45);
        plane = new Plane(PlaneType.AIRBUSA330, 150, 12000);
        flight = new Flight(plane, "NY567", "New York", "London Heathrow", flightTime);

        Passenger passenger1 = new Passenger("Debbie McClean", 2);
        Passenger passenger2 = new Passenger("Stewart McClean", 1);
        Passenger passenger3 = new Passenger("Hamish Scott", 2);
        Passenger passenger4 = new Passenger("Keith Davies", 1);
        Passenger passenger5 = new Passenger("Mary Shaw", 3);


        ArrayList<Passenger> flightPassengers =  new ArrayList<>();
        flightPassengers.add(passenger1);
        flightPassengers.add(passenger2);
        flightPassengers.add(passenger3);
        flightPassengers.add(passenger4);
        flightPassengers.add(passenger5);

        flight.addMultiplePassengers(flightPassengers);
    }

    @Test
    public void flightHasPlane() {
        flightTime = LocalTime.of(22, 45);
        Plane newPlane = new Plane(PlaneType.AIRBUSA330, 150, 12000);
        Flight flight1 = new Flight(newPlane, "EZY456", "Edinburgh", "Amsterdam", flightTime );
        assertEquals(newPlane, flight1.getPlane());
    }

    @Test
    public void flightHasFlightNumber() {
        assertEquals("NY567", flight.getFlightNumber());
    }
    //Change flight destination to correct error
    @Test
    public void flightHasDestination() {
        assertEquals("New York", flight.getDestination());
    }

    @Test
    public void flightHasDepartureAirport() {
        assertEquals("London Heathrow", flight.getDeparture());
    }

    @Test
    public void flightHasDepartureTime() {
        assertEquals(flightTime, flight.getDepartureTime());
    }

    @Test
    public void addCabinCrewToFlight() {
        cabinCrewMember = new CabinCrewMember("Melanie Slade", CrewRank.PILOT);
        flight.addCrewMembers(cabinCrewMember);
        assertEquals(1, flight.countCrewMembers());
    }

    @Test
    public void removeAllPassengers() {
        assertEquals(0, flight.empty());
    }

    @Test
    public void passengersStartAt0() {
        flight.empty();
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void addPassengerToFlight() {
        Passenger passenger6 = new Passenger("Hamish Scott", 2);
        flight.addPassenger(passenger6);
        passenger6.addFlight(flight);
        assertEquals(1, passenger6.countFlights());
        assertEquals(6, flight.countPassengers());
    }

    @Test
    public void addMultiplePassengersToFlight() {
        //Passengers
        Passenger passenger1 = new Passenger("Debbie McClean", 2);
        Passenger passenger2 = new Passenger("Stewart McClean", 1);
        Passenger passenger3 = new Passenger("Hamish Scott", 2);
        Passenger passenger4 = new Passenger("Mary Shaw", 3);

        ArrayList<Passenger> flightPassengers =  new ArrayList<>();
        flightPassengers.add(passenger1);
        flightPassengers.add(passenger2);
        flightPassengers.add(passenger3);
        flightPassengers.add(passenger4);

        flight.addMultiplePassengers(flightPassengers);
        assertEquals(9, flight.countPassengers());
    }

    @Test
    public void countNumberOfSeatsAvailable() {
        assertEquals(145, flight.getAvailableSeats());
    }

    @Test
    public void addPassengerIfSeatsAvailable() {
        flightTime = LocalTime.of(22, 45);
        Plane smallPlane = new Plane(PlaneType.PA31NAVAJO, 6, 4000);
        flight = new Flight(smallPlane, "BE678", "Belfast", "Edinburgh", flightTime);

        //Initial Passenger setup
        Passenger passenger1 = new Passenger("Debbie McClean", 2);
        Passenger passenger2 = new Passenger("Stewart McClean", 1);
        Passenger passenger3 = new Passenger("Hamish Scott", 2);
        Passenger passenger4 = new Passenger("Mary Shaw", 3);

        ArrayList<Passenger> flightPassengers =  new ArrayList<>();
        flightPassengers.add(passenger1);
        flightPassengers.add(passenger2);
        flightPassengers.add(passenger3);
        flightPassengers.add(passenger4);

        flight.addMultiplePassengers(flightPassengers);

        Passenger passenger5 = new Passenger("Jimmy Love", 1);
        assertEquals("Passenger added to flight", flight.checkInPassenger(passenger5));
        assertEquals(5, flight.countPassengers());
    }

    @Test
    public void addPassengerIfSeatsAvailable_noCapacity() {
        flightTime = LocalTime.of(22, 45);
        Plane smallPlane = new Plane(PlaneType.PA31NAVAJO, 3, 4000);
        flight = new Flight(smallPlane, "BE678", "Belfast", "Edinburgh", flightTime);

        //Initial Passenger setup
        Passenger passenger1 = new Passenger("Debbie McClean", 2);
        Passenger passenger2 = new Passenger("Stewart McClean", 1);
        Passenger passenger3 = new Passenger("Hamish Scott", 2);

        ArrayList<Passenger> flightPassengers =  new ArrayList<>();
        flightPassengers.add(passenger1);
        flightPassengers.add(passenger2);
        flightPassengers.add(passenger3);
        flight.addMultiplePassengers(flightPassengers);

        Passenger passenger5 = new Passenger("Jimmy Love", 1);
        assertEquals("Sorry this flight is full", flight.checkInPassenger(passenger5));
        assertEquals(3, flight.countPassengers());
    }

    @Test
    public void getTotalBagsForFlight() {
        assertEquals(9, flight.getTotalBags());
    }
 }
