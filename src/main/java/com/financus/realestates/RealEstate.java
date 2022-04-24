package com.financus.realestates;

import javax.persistence.*;

@MappedSuperclass
public abstract class RealEstate {
    @Id
    protected int id;
    protected String city;
    protected String street;
    protected double area;
    @Column(name = "monthly_cost")
    protected int monthlyCost;

    public RealEstate(int id, String city, String street, double area, int monthlyCost) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.area = area;
        this.monthlyCost = monthlyCost;
    }

    public int getId() {
        return id;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }
}

@Entity
@Table(name = "Apartments")
class Apartment extends RealEstate {
    private int floor;
    private boolean parking;

    public Apartment(int id, String city, String street, double area, int monthlyCost, int floor, boolean parking) {
        super(id, city, street, area, monthlyCost);
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

@Entity
@Table(name = "Houses")
class House extends RealEstate {

    private double gardenArea;

    public House(int id, String city, String street, double area, int monthlyCost, double gardenArea) {
        super(id, city, street, area, monthlyCost);
        this.gardenArea = gardenArea;
    }


    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", area=" + area +
                ", gardenArea=" + gardenArea +
                '}';
    }


}
