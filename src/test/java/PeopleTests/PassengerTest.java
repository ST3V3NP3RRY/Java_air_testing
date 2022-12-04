package PeopleTests;

import Aeroplane.Plane;
import Aeroplane.PlaneType;
import Flight.Flight;
import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    LocalTime flightTime;

    @Before
    public void before() {
        passenger = new Passenger("Craig David", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Craig David", passenger.getName());
    }

    @Test
    public void passengerHasNumberOfBags() {
        assertEquals(2, passenger.countBags());
    }

    @Test
    public void canAddFlightToPassenger() {
        flightTime = LocalTime.of(22, 45);
        Plane plane = new Plane(PlaneType.BOEING757, 150, 12500);
        Flight newFlight = new Flight(plane, "EZY657", "Los Angeles", "London Heathrow", flightTime);
        passenger.addFlight(newFlight);
        assertEquals(1, passenger.countFlights());
    }


}
