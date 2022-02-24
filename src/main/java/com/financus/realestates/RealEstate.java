package com.financus.realestates;

public abstract class RealEstate {

protected int id;
protected String city;
protected String street;
protected double area;

    public RealEstate(int id, String city, String street, double area) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.area = area;
    }

    public int getId() {
        return id;
    }

    }
class Apartment extends RealEstate {
    int floor;
    boolean parking;
    public Apartment(int id, String city, String street, double area, int floor, boolean parking) {
        super(id, city, street, area);
        this.floor = floor;
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                ", parking=" + parking +
                '}';
    }
}

