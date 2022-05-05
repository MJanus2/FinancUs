package com.financus.realestates;

import java.util.Date;

public class RealEstatePeriods {
    Date date;
    String city;
    double price;

    public RealEstatePeriods(Date date, String city, double price) {
        this.date = date;
        this.city = city;
        this.price = price;
    }
}
