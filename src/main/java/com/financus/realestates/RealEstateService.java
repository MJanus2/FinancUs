package com.financus.realestates;

public class RealEstateService {

    ApartmentCollection apartmentCollection = new ApartmentCollection();

    boolean addRealEstate(int id, String city, String street, double area,
                          int floor, boolean parking) {
      boolean isValid = true;
        if (isValid) {
            Apartment apartment = new Apartment(id, city, street, area,
            floor, parking);
            apartmentCollection.addRealEstate(apartment);
        }
        return isValid;
    }

    public Apartment[] getRealEstate() {
        return apartmentCollection.getRealEstate();
    }

    public void deleteRealEstate(int id) {
        apartmentCollection.deleteRealEstate(id);
    }

    void setRealEstateCollection(ApartmentCollection apartmentCollection) {
        this.apartmentCollection = apartmentCollection;
    }
}
