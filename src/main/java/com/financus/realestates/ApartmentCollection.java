package com.financus.realestates;

public class ApartmentCollection implements RealEstateCollection{
    private Apartment[] apartments = new Apartment[10];


    public void addRealEstate(Apartment apartment) {
        for (int i = 0; i < apartments.length; i++) {
            if (apartments[i] == null) {
                apartments[i] = apartment;
                break;
            }
        }
    }
    @Override
    public Apartment[] getRealEstate() {
        return apartments;
    }
    @Override
    public void deleteRealEstate(int id) {
        for(int i = 0; i < apartments.length; i++) {
            if (apartments[i] != null && apartments[i].getId() == id){
                apartments[i] = null;
            }
        }
    }
}