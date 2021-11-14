package Plane;

public class PassengerPlane extends Plane {
    private int numberOfSeats;

    public PassengerPlane(String manufacturer, String type, int numberOfSeats) {
        super(manufacturer, type);
        this.numberOfSeats = numberOfSeats;
    }

    public String toString() {
        return super.toString() + " seats:" + numberOfSeats;
    }

}
