package Plane;

import java.util.List;
import java.util.ArrayList;

// Add the plane to the list, and assings new ID
// If a plane is about to land with the same ID...then it should not be added.
// Check if ID already exsits in Array IF not: Add plane with previous ID

public class Airport {
    ArrayList<Plane> list = new ArrayList<Plane>();

    private int planeCount = 0;

    // constructor with an array of objects.

    public void land(Plane plane) {

        if (CheckList(this.list, plane.getId())) {
            // System.out.println("Plane already in aiport"); // return nothing if it is in
            // the aiport.
        } else {
            // change ID to previous + 1, and store plane in list of objects.
            this.planeCount++;
            plane.setId(planeCount);
            this.list.add(plane);
        }
    }

    public boolean CheckList(ArrayList<Plane> list, int id) { // checks if id is // already in the list.
        for (int i = 0; i < list.size(); i++) {
            Plane temp = this.list.get(i);
            if (temp.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void start(int id) {
        // remove plane from list.
        for (int i = 0; i < list.size(); i++) {
            Plane temp = this.list.get(i);
            if (temp.getId() == id) {
                this.list.remove(i);
            }
        }
    }

    public String toString() { // prints all planes in the airport.
        for (int i = 0; i < this.list.size(); i++) {
            Object temp = this.list.get(i);
            System.out.println(temp.toString());
        }
        return "";
    }
}
