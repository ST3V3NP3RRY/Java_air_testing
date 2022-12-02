package PeopleTests;

import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

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
}
