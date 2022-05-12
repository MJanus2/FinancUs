package com.financus.finance.realestates;

import java.util.ArrayList;

interface RealEstateCollection<T> {

    void addRealEstateToArrayList(T realEstate);
    ArrayList<T> getRealEstate();
    void deleteRealEstate(int id);
}

