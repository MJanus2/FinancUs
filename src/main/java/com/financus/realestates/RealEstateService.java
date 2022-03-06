package com.financus.realestates;

import java.util.ArrayList;


public class RealEstateService {
    ApartmentCollection apartmentCollection = new ApartmentCollection();
    HouseCollection houseCollection = new HouseCollection();

    private boolean isValid(int id, String city, String street, double area) {
        return RealEstateValidator.isIdValid(id) && RealEstateValidator.isCityValid(city)
                & RealEstateValidator.isStreetValid(street) && RealEstateValidator.isAreaValid(area);
    }


    public boolean addRealEstate(int id, String city, String street, double area,
                                 double gardenArea) {
        boolean isValid = isValid(id, city, street, area);
        if (isValid) {
            House house = new House(id, city, street, area,
                    gardenArea);
            houseCollection.addRealEstateToArrayList(house);
        }
        return isValid;
    }

    public boolean addRealEstate(int id, String city, String street, double area,
                                 int floor, boolean parking) {
        boolean isValid = isValid(id, city, street, area) && RealEstateValidator.isFloorValid(floor);
        if (isValid) {
            Apartment apartment = new Apartment(id, city, street, area,
                    floor, parking);
            apartmentCollection.addRealEstateToArrayList(apartment);
        }
        return isValid;
    }

    public ArrayList<Apartment> getRealEstate() {
        return apartmentCollection.getRealEstate();
    }


    public void deleteRealEstate(int id) {
        apartmentCollection.deleteRealEstate(id);
    }
}



