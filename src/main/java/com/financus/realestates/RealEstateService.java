package com.financus.realestates;

import java.util.ArrayList;

interface RealEstateService<T> {
    boolean addRealEstate(int id, String city, String street, double area,
                          int floor, boolean parking);
    ArrayList<T> getRealEstate();
    void deleteRealEstate(int id);

    ApartmentCollection apartmentCollection = new ApartmentCollection();

   class ApartmentService implements RealEstateService<Apartment> {
        @Override
        public boolean addRealEstate(int id, String city, String street, double area,
                                     int floor, boolean parking) {
            boolean isValid = true;
            if (isValid) {
                Apartment apartment = new Apartment(id, city, street, area,
                        floor, parking);
                apartmentCollection.addRealEstateToArrayList(apartment);
            }
            return isValid;
        }

        @Override
        public ArrayList<Apartment> getRealEstate() {
            return apartmentCollection.getRealEstate();
        }

        @Override
        public void deleteRealEstate(int id) {
            apartmentCollection.deleteRealEstate(id);
        }
    }


}
