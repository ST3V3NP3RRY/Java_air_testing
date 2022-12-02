package PeopleTests;

import org.junit.Before;
import org.junit.Test;
import people.CrewRank;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("James Blake", CrewRank.PILOT, 8787);
    }

    @Test
    public void pilotHasName() {
        assertEquals("James Blake", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(CrewRank.PILOT, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNumber() {
        assertEquals(8787, pilot.getLicenseNum());
    }

    @Test
    public void pilotCanFlyPlane() {
        assertEquals("Ready for take-off", pilot.flyPlane());
    }

}
