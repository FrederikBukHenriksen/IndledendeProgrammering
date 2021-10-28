import java.lang.Math;

public class MovingPoint {

    // Declaring class fields.
    private double x;
    private double y;
    private double direction;
    private double speed;

    // Constructor without arguments, but with default values.
    public MovingPoint() {
        x = 0;
        y = 0;

        direction = 90;

        speed = 0;
    }

    // Constructor with arguments.
    public MovingPoint(double x, double y, double direction, double speed) {
        this.x = x;
        this.y = y;

        this.direction = direction;
        checkDirection(); // Check if the direction is within the defined degrees

        this.speed = speed;
        checkSpeed(); // Check if speed is within min and max values.
    }

    // Set the direction within [0;360[ degrees.
    private void checkDirection() {
        if (direction / 360 >= 1) // If 360 degrees or above.
            direction -= 360 * Math.floor(direction / 360); // Calculate the number of 360 degrees roll-back
        if (direction < 0) // If below 0 degrees.
            direction += 360 * Math.ceil(direction / -360); // Calculate the number of 360 degrees roll-up
    }

    // Set the speed within the max and min.
    private void checkSpeed() {

        // Define minimum and maximum speed
        double maxSpeed = 20;
        double minSpeed = 0;

        // Change if it exceeds max speed
        if (speed > maxSpeed)
            speed = maxSpeed;

        // Change if it falls below min speed
        if (speed < minSpeed)
            speed = minSpeed;
    }

    // Calculate the change for each coordinate when moving
    public void move(double duration) {

        // Coordinates are converted from degrees to radians for the functions to work
        x += Math.cos(Math.toRadians(direction)) * speed * duration; // Cosine value of direction * speed * duration
        y += Math.sin(Math.toRadians(direction)) * speed * duration; // Sinus value of direction * speed * duration
    }

    // Change the angle
    public void turnBy(double angle) {

        direction += angle; // Add change in angle to existing direction
        checkDirection(); // Check if the direction is within the defined degrees
    }

    // Change the speed
    public void accelerateBy(double change) {
        speed += change; // Add change in speed to existing speed
        checkSpeed(); // Check if speed is within min and max values.
    }

    // Change the default printing of an object
    public String toString() {
        return ("[" + x + ";" + y + "] " + direction + " " + speed);
    }

}