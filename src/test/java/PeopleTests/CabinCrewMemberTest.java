package PeopleTests;

import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.CrewRank;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Jenny Smith", CrewRank.FLIGHT_ATTENDANT);
    }

    @Test
    public void crewMemberHasName() {
        assertEquals("Jenny Smith", cabinCrewMember.getName());
    }

    @Test
    public void crewMemberHasRank() {
        assertEquals(CrewRank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void crewMemberCanTalkToPassengers() {
        assertEquals("Fasten your seatbelts", cabinCrewMember.talk());
    }
}
