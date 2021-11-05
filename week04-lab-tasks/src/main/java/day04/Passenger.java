package day04;

public class Passenger {

    private String name;
    private String ticketNumber;
    private int numberOfPackages;

    public Passenger(String name, String ticketNumber, int numberOfPackages) {
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.numberOfPackages = numberOfPackages;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }
}