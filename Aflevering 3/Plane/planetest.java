package Plane;

public class planetest {
    public static void main(String[] args) {
        PassengerPlane p2 = new PassengerPlane("Boing", "737", 241);
        p2.setId(2);
        FreightPlane p3 = new FreightPlane("Antonov", "124", 110);
        p3.setId(3);
        FreightPlane p1 = new FreightPlane("Boing", "747F", 112);
        p1.setId(1);
        PassengerPlane p4 = new PassengerPlane("Airbus", "321", 192);
        p4.setId(4);
        PassengerPlane p5 = new PassengerPlane("Airbus", "380", 853);
        p5.setId(5);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        Airport cph = new Airport();

        cph.land(p1);
        cph.land(p2);

        cph.toStrings();

        cph.start(1);
        cph.land(p4);

        cph.toStrings();

    }

}
