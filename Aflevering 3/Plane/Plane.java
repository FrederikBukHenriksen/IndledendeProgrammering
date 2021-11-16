package Plane;

public class Plane {

    // defualt ID value
    private static final int DEFAULT_ID = 0;

    // Define manyfacturer and type as protected string.
    protected String manufacturer, type;

    // id
    int id;

    /**
     * @param manufacturer
     * @param type
     * @param id
     */

    // Constructor
    public Plane(String manufacturer, String type) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.id = DEFAULT_ID;
    }

    // Set ID method.
    public void setId(int id) {
        this.id = id;
    }

    // toString method:
    public String toString() {
        // din kode
        return "Plane" + id + " " + manufacturer + " " + type;
    }
    // denne metode skal sammenligne id nr på to objekter af flyver.

    public boolean equals(Plane plane) {
        if (this.id == plane.id) {
            return true;
        } else {
            return false;
        }
    }

    // get ID method.
    public int getId() {
        return id;
    }

}
