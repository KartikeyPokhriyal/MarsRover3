public class Player {
    public static void main(String[] args) {
        MarsRover marsRover = new MarsRover(new Location(1,2 , 'S'));

        System.out.println(marsRover.traverse("MM"));
    }
}
