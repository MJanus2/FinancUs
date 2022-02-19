package com.financus.realestates;

public class Apartment extends RealEstate {

    private final int floor;
    private boolean parking;

    public Apartment(int id, String city, String street, double area,
                     int floor, boolean parking) {
        super(id, city, street, area);
        this.floor = floor;
        this.parking = parking;

    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floor=" + floor +
                ", parking=" + parking +
                ", id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", area=" + area +
                '}';
    }

    public boolean isParking() {
        return parking;
    }

    public int getFloor() {
        return floor;
    }

    public int getId() {
        return id;
    }
}

