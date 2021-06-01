package com.company;

public class TouristTicket extends Ticket{
    private String address;
    private String[] touristLocations;

    public TouristTicket(int pnr, int seatNumber, String flightName, boolean isCancelled, String departure, String dateOfDeparture, String timeOfDeparture, String arrival, String dateOfArrival, String timeOfArrival, int durationOfJourney,
                         float ticketPrice,Flights flights,Passenger passenger,String address, String[] touristLocations) {
        super(pnr, seatNumber, flightName, isCancelled, departure, dateOfDeparture, timeOfDeparture, arrival, dateOfArrival, timeOfArrival, durationOfJourney, ticketPrice, flights, passenger);
        this.address=address;
        this.touristLocations=touristLocations;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getTouristLocations() {
        String str[]= new String[5];
        str[0]=touristLocations[0];
        str[1]=touristLocations[1];
        str[2]=touristLocations[2];
        return str;
    }

    public void setTouristLocations(String[] touristLocations) {
        this.touristLocations = touristLocations;
    }

    @Override
    public void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}