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

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public double getArea() {
        return area;
    }


}
