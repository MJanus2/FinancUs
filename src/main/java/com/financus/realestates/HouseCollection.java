package com.financus.realestates;

import java.util.ArrayList;

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
