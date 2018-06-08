import java.util.Objects;

public class MarsRover {
private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public MarsRover traverse(String commands) {
        char[] command = commands.toCharArray();

        for(char value: command) {
            if (value == 'L' || value == 'R') {
                location = location.turnByNinetyDegree(value);
            }
            else if(value == 'M'){
               location = location.move();
            }
        }
            return new MarsRover(location);
        }

    @Override
    public String toString() {
        return "MarsRover{" +
                "location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarsRover)) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(location, marsRover.location);
    }

    @Override
    public int hashCode() {

        return Objects.hash(location);
    }
}

