package com.company;





public class Main {

    public static  void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

    public static void main(String[] args) {


        Flights flights= new Flights(123,"AirIndia",12,11,true);
        Passenger passenger= new Passenger(true,"ac","pune","mh","cvd",1234,"a@c.com");
        String services[]={"food","water","snacks"};
        String locations[]={"pune","mumbai","Hyderabad","delhi","kolkata"};
        RegularTicket regularTicket= new RegularTicket(12343,2,"an",false,"pune","12/12/12","12:12","mumbai","12/12/12","13:12",2,123.4f,flights,passenger,true,services);
        TouristTicket touristTicket= new TouristTicket(13456,3,"kingFisher",false,"mumbai","3/3/14","11:11","pune","12/12/21","12:12",2,432.4f,flights,passenger,"pune",locations);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);


    }
}
