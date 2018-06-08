import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void marsRoverShouldChangeDirections() {
        MarsRover marsRover = new MarsRover(new Location(1, 2, 'N'));

        assertEquals(new MarsRover(new Location(1, 2, 'E')), marsRover.traverse("R"));
    }

    @Test
    public void marsRoverShouldChangeCoordinates() {
        MarsRover marsRover = new MarsRover(new Location(1, 2, 'N'));

        assertEquals(new MarsRover(new Location(1, 3, 'N')), marsRover.traverse("M"));
    }
}
