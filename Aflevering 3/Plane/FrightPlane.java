package Plane;

public class FrightPlane extends Plane {
    private int payload;

    public Frightplane(String manufacturer, String type, int payload) {
        super(manufacturer, type); 
        this.payload = payload; 
    }

}
