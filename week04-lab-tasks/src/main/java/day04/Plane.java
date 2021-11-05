package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity;
    private List<Passenger> passengerList = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.size() < maxCapacity) {
            passengerList.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int packages = 0;
        for (Passenger p: passengerList) {
            packages += p.getNumberOfPackages();
        }
        return packages;
    }
}