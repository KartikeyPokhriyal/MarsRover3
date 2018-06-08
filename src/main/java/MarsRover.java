import java.util.Objects;

public class MarsRover {
private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public MarsRover traverse(String commands) throws CommandNotApplicableException {
        char[] command = commands.toCharArray();

        for(char value: command) {
            if (value == 'L' || value == 'R') {
                location = location.getChangedDirection(value);
            }
            else if(value == 'M'){
               location = location.getChangedCoordinates();
            }
            else {
                throw new CommandNotApplicableException("You've entered a wrong command");
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

