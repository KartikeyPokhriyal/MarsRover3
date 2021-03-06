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

    @Test
    public void marsRoverShouldTraverseOnCommandString() {
        MarsRover marsRover = new MarsRover(new Location(1, 2, 'N'));

        assertEquals(new MarsRover(new Location(1, 2, 'S')), marsRover.traverse("MRRM"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void roverShouldNotCrossThePlateauCoordinates() {
        Plateau plateau = new Plateau(-1, 1);
    }

    @Test (expected = CommandNotApplicableException.class)
    public void shouldThrowExceptionWhenEnteredAnInvalidCommand() {
        MarsRover marsRover = new MarsRover(new Location(1, 2, 'N'));

        marsRover.traverse("MMHHHHgMM");
    }
}
