public class Plateau {
    private Location location;

    public Plateau(int plateau_y_coordinate, int plateau_x_coordinate) throws IllegalArgumentException {
        if (plateau_x_coordinate < 0 || plateau_y_coordinate < 0|| plateau_x_coordinate > 5 || plateau_y_coordinate > 5)
            throw new IllegalArgumentException();
        this.location = new Location(plateau_x_coordinate, plateau_y_coordinate);
    }
}
