package com.financus.realestates;

import java.util.ArrayList;

public class LiquidityAlgorithms {
    HouseCollection houseCollection = new HouseCollection();
    ApartmentCollection apartmentCollection = new ApartmentCollection();
    ArrayList<RealEstate> realEstatesList = new ArrayList<>();

    private ArrayList<RealEstate> createListOfRealEstates(){
        realEstatesList.addAll(houseCollection.getRealEstate());
        realEstatesList.addAll(apartmentCollection.getRealEstate());
        return realEstatesList;
    }

    public float getCurrentFinancialLiquidityRatio(){
        float currentFinancialLiquidityRatio = (pensje - koszty życia) + akcje / wysokość rat przez dwanaście miesięcy;
    }


}
