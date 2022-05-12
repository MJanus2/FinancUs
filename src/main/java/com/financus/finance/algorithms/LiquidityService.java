package com.financus.finance.algorithms;

import com.financus.finance.realestates.*;

import java.util.ArrayList;

public class LiquidityService {
    HouseCollection houseCollection = new HouseCollection();
    ApartmentCollection apartmentCollection = new ApartmentCollection();
    PersonCollection personCollection = new PersonCollection();
    ArrayList<RealEstate> realEstatesList = new ArrayList<>();


    private ArrayList<RealEstate> createListOfRealEstates(){
        realEstatesList.addAll(houseCollection.getRealEstate());
        realEstatesList.addAll(apartmentCollection.getRealEstate());
        return realEstatesList;
    }

    private int getMonthlyRealEstatesServicingCost(){
        int monthlyCost = 0;
        for (RealEstate realEstate : createListOfRealEstates()){
            monthlyCost += realEstate.getMonthlyCost();
        }
        return monthlyCost;
    }

    public float getAnnualRealEstatesServicingCost(){
        return getMonthlyRealEstatesServicingCost() * 12;
    }

    public float getAmountOfAllLivingCosts() {
        float amountOfAllLivingCosts = 0;
        for (Person person : personCollection.getPerson()) {
            amountOfAllLivingCosts += person.getMonthlyLivingCosts();
        }
        return amountOfAllLivingCosts;
    }

    public float getAmountOfAllSalaries() {
        int amountOfAllSalaries = 0;
        for (Person person : personCollection.getPerson()) {
            amountOfAllSalaries += person.getMonthlySalary();
        }
        return amountOfAllSalaries;
    }

}
