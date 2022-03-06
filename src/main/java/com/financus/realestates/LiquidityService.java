package com.financus.realestates;

import java.util.ArrayList;

public class LiquidityService {
    HouseCollection houseCollection = new HouseCollection();
    ApartmentCollection apartmentCollection = new ApartmentCollection();
    ArrayList<RealEstate> realEstatesList = new ArrayList<>();

    private ArrayList<RealEstate> createListOfRealEstates(){
        realEstatesList.addAll(houseCollection.getRealEstate());
        realEstatesList.addAll(apartmentCollection.getRealEstate());
        return realEstatesList;
    }
}
