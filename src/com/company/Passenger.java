package com.company;

public class Passenger {
    private boolean isRegistered;

         private static int idCounter=0;


    private  static  class Contact{
        private String name;
        private int phoneNumber;
        private String email;

        public Contact(String name, int phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
    }

    private Contact contact;

    private static  class Address{
        String street,city,state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
    private Address address;

    Passenger(){}

    public Passenger( boolean isRegistered,String street,String city,String state,String name,int phoneNumber,String email) {
        this.address=new Address(street,city,state);
        this.contact= new Contact(name, phoneNumber, email);
        idCounter= ++idCounter;
        this.isRegistered = isRegistered;


    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    Boolean isPassengerRegistered(){
        return this.isRegistered;
    }

    public Boolean getPassenger(){
        return this.isRegistered;
    }
    public int getPassengerCount(){
        return  idCounter;
    }


}

