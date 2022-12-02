import Aeroplane.PlaneType;
import Aeroplane.Plane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUSA320, 1000, 125000);
    }

    @Test
    public void planeHasPlaneType() {
        assertEquals(PlaneType.AIRBUSA320, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(1000, plane.getCapacity());
    }

    @Test
    public void planeHasWeight() {
        assertEquals(125000, plane.getWeight());
    }
}
