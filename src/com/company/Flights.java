package com.company;

public class Flights {
    private int flightNumber;
    private String airline;
    private int capacity;
    private int noOfSeatBooked;
    private boolean isAvailable;

    //default constructor
    Flights(){

    }
    //Parameterized constructor
    public Flights(int flightNumber, String airline, int capacity, int noOfSeatBooked, boolean isAvailable) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.noOfSeatBooked = noOfSeatBooked;
        this.isAvailable = isAvailable;
    }

    //getters and setters


    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfSeatBooked() {
        return noOfSeatBooked;
    }

    public void setNoOfSeatBooked(int noOfSeatBooked) {
        this.noOfSeatBooked = noOfSeatBooked;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}
