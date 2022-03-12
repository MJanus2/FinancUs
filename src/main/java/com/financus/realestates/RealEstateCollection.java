package com.financus.realestates;

import java.util.ArrayList;

interface RealEstateCollection<T> {

    void addRealEstateToArrayList(T realEstate);
    ArrayList<T> getRealEstate();
    void deleteRealEstate(int id);
}

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

public class HouseCollection implements RealEstateCollection<House> {
    ArrayList<House> houses = new ArrayList<>();

    @Override
    public void addRealEstateToArrayList(House house) {
        houses.add(house);
    }

    @Override
    public ArrayList<House> getRealEstate() {
        return houses;
    }

    @Override
    public void deleteRealEstate(int id) {
        houses.removeIf(apartment -> apartment.getId() == id);
    }
}