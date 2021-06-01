package com.company;

public class RegularTicket extends  Ticket{
        private boolean isSpecialService;
        private String specialService[];
        public RegularTicket(boolean isSpecialService) {
            this.isSpecialService=isSpecialService;
        }

    public RegularTicket(int pnr, int seatNumber, String flightName, boolean isCancelled, String departure, String dateOfDeparture, String timeOfDeparture, String arrival, String dateOfArrival, String timeOfArrival, int durationOfJourney,
                  float ticketPrice,Flights flights,Passenger passenger,boolean isSpecialService, String[] specialService) {

        super(pnr, seatNumber, flightName, isCancelled, departure, dateOfDeparture, timeOfDeparture, arrival, dateOfArrival, timeOfArrival, durationOfJourney, ticketPrice, flights, passenger);
        this.isSpecialService = isSpecialService;
        this.specialService = specialService;
    }

    public String[] getSpecialService(){
            String str[]=new String[3];
            str[0]=specialService[0];
            str[1]=specialService[1];
            str[2]=specialService[2];
        return  str;
        }

    @Override
    public void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
