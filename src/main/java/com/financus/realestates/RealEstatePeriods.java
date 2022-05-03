package com.financus.realestates;

import java.util.Date;

public class RealEstatePeriods {
    Date date;
    String city;
    int price;

    public RealEstatePeriods(Date date, String city, int price) {
        this.date = date;
        this.city = city;
        this.price = price;
    }
}
