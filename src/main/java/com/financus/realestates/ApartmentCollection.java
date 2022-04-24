package com.financus.realestates;

import java.util.ArrayList;

public class ApartmentCollection implements RealEstateCollection<Apartment> {
    ArrayList<Apartment> apartments = new ArrayList<>();

    @Override
    public void addRealEstateToArrayList(Apartment apartment) {
        apartments.add(apartment);
    }

    @Override
    public ArrayList<Apartment> getRealEstate() {
        return apartments;
    }

    @Override
    public void deleteRealEstate(int id) {
        apartments.removeIf(apartment -> apartment.getId() == id);
    }
}
