package day04;

public class PlaneMain {

    public static void main(String[] args) {

        Plane plane = new Plane(2);
        System.out.println(plane.addPassenger(new Passenger("John", "hkfgkdfj", 3)));
        System.out.println(plane.addPassenger(new Passenger("Jack", "hfghk", 6)));
        System.out.println(plane.addPassenger(new Passenger("Jane", "gdbnk", 2)));

        System.out.println(plane.numberOfPackages());
    }
}