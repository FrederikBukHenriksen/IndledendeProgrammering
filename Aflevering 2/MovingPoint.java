import java.lang.Math;

public class MovingPoint {

    // Declaring class specific vairables.
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

    // Constructor without arguments.
    public MovingPoint(double x, double y, double direction, double speed) {
        this.x = x;
        this.y = y;

        this.direction = direction;
        checkDirection();

        this.speed = speed;
        checkSpeed();
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
        double maxSpeed = 20;
        double minSpeed = 0;

        if (speed > maxSpeed)
            speed = maxSpeed;
        if (speed < minSpeed)
            speed = minSpeed;
    }

    public void move(double duration) {
        x += Math.cos(Math.toRadians(direction)) * speed * duration;
        y += Math.sin(Math.toRadians(direction)) * speed * duration;
    }

    public void turnBy(double angle) {
        direction += angle;
        checkDirection();
    }

    public void accelerateBy(double change) {
        speed += change;
        checkSpeed();
    }

    public String toString() {
        return ("[" + x + ";" + y + "] " + direction + " " + speed);
    }

}