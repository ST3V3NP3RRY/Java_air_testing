package PeopleTests;

import Aeroplane.Plane;
import Aeroplane.PlaneType;
import org.junit.Before;
import org.junit.Test;
import people.FlightManager;
import people.Passenger;
import Flight.Flight;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

    Plane plane;

    Flight flight;

    LocalTime flightTime;

    @Before
    public void before() {

        flightTime = LocalTime.of(22, 45);

        plane = new Plane(PlaneType.AIRBUSA330, 150, 12000);
        flight = new Flight(plane, "NY567", "New York", "London Heathrow", flightTime);
        flightManager = new FlightManager("Wendy Craig", plane, flight);

        Passenger passenger1 = new Passenger("Debbie McClean", 2);
        Passenger passenger2 = new Passenger("Stewart McClean", 1);
        ArrayList<Passenger> flightPassengers =  new ArrayList<>();
        flightPassengers.add(passenger1);
        flightPassengers.add(passenger2);
        flight.addMultiplePassengers(flightPassengers);
    }

    @Test
    public void flightManagerHasName() {
        assertEquals("Wendy Craig", flightManager.getName());
    }

    @Test
    public void calculateBaggageWeightForEachPassenger() {
        assertEquals(40, flightManager.calculateSingleBaggageWeight());
    }

    @Test
    public void calculateTotalWeightOfAllPassengersBaggage() {
        assertEquals(120, flightManager.calculateTotalBaggageWeight());
    }

    @Test
    public void calculateBaggageWeightRemaining() {
        assertEquals(5880, flightManager.calculateWeightRemaining());
    }
}
