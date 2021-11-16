package Plane;

public class FreightPlane extends Plane {
    private int payload;

    // Constructor
    public FreightPlane(String manufacturer, String type, int payload) {
        super(manufacturer, type);
        this.payload = payload;
    }

    // toString Method.
    public String toString() {
        return super.toString() + " payload:" + payload;
    }

}
