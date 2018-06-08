import java.util.Objects;

public class Location {
    private int x_coordinates;
    private int y_coordinates;
    private char compassDirection;


    public Location(int x_coordinates, int y_coordinates, char compassDirection) {
        this.x_coordinates = x_coordinates;
        this.y_coordinates = y_coordinates;
        this.compassDirection = compassDirection;
    }

    public Location(char compassDirection) {
        this.compassDirection = compassDirection;
    }

    @Override
    public String toString() {
        return "Location{" +
                "x_coordinates=" + x_coordinates +
                ", y_coordinates=" + y_coordinates +
                ", compassDirection=" + compassDirection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return x_coordinates == location.x_coordinates &&
                y_coordinates == location.y_coordinates &&
                compassDirection == location.compassDirection;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x_coordinates, y_coordinates, compassDirection);
    }

    public static Location north() {
        return new Location('N');
    }

    public static Location east() {
        return new Location('E');
    }

    public static Location west() {
        return new Location('W');
    }

    public static Location south() {
        return new Location('S');
    }


    public Location turnByNinetyDegree(char command) {

        if(command == 'R') {
            if (compassDirection == 'N')
                return new Location(x_coordinates, y_coordinates,'E');
            if(compassDirection == 'S')
                return new Location(x_coordinates, y_coordinates, 'W');
            if(compassDirection == 'E')
                return new Location(x_coordinates, y_coordinates,'S');
            if(compassDirection == 'W')
                return new Location(x_coordinates, y_coordinates, 'N');
        }

        if(command == 'L') {
            if (compassDirection == 'N')
                return new Location(x_coordinates, y_coordinates, 'W');
            if(compassDirection == 'S')
                return new Location(x_coordinates, y_coordinates,'E');
            if(compassDirection == 'E')
                return new Location(x_coordinates, y_coordinates, 'N');
            if(compassDirection == 'W')
                return new Location(x_coordinates, y_coordinates, 'S');
        }

        return this;
    }

    public Location move() {
        if(compassDirection == 'N')
            return new Location(x_coordinates, y_coordinates + 1, compassDirection);

        if(compassDirection == 'S')
            return new Location(x_coordinates, y_coordinates - 1, compassDirection);

        if(compassDirection == 'E')
            return new Location(x_coordinates + 1, y_coordinates , compassDirection);

        if(compassDirection == 'W')
            return new Location(x_coordinates - 1, y_coordinates , compassDirection);

        else return this;

    }
}
