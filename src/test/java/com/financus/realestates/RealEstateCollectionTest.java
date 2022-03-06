package com.financus.realestates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class RealEstateCollectionTest {


    ApartmentCollection apartmentCollection = new ApartmentCollection();
    HouseCollection houseCollection = new HouseCollection();

    @Test
    void providedCorrectDataToCreateApartmentShouldReturnNotNull(){
        //given
        int id = 1;
        String city = "Warszawa";
        String street = "Złota";
        double area = 59.5;
        int monthlyCost = 1000;
        int floor = 6;
        boolean parking = true;
        Apartment apartment = new Apartment(id, city, street, area, monthlyCost, floor, parking);

        //when
        apartmentCollection.addRealEstateToArrayList(apartment);

        //then
        assertNotNull(apartmentCollection.getRealEstate().get(0));
    }

    @Test
    void createdApartmentAndThenDeletedFromArrayShouldReturnNull(){
        //given
        int id = 1;
        String city = "Warszawa";
        String street = "Złota";
        double area = 59.5;
        int monthlyCost = 1000;
        int floor = 6;
        boolean parking = true;
        Apartment apartment = new Apartment(id, city, street, area, monthlyCost, floor, parking);
        apartmentCollection.addRealEstateToArrayList(apartment);

        //when
        apartmentCollection.deleteRealEstate(1);

        //then
        assertEquals(0, apartmentCollection.getRealEstate().size());
    }

    @Test
    void providedCorrectDataToCreateHouseShouldReturnNotNull(){
        //given
        int id = 1;
        String city = "Warszawa";
        String street = "Złota";
        int monthlyCost = 1000;
        double area = 59.5;
        double gardenArea = 100;
        House house = new House(id, city, street, area, monthlyCost, gardenArea);

        //when
        houseCollection.addRealEstateToArrayList(house);

        //then
        assertNotNull(houseCollection.getRealEstate().get(0));
    }

    @Test
    void createdHouseAndThenDeletedFromArrayShouldReturnNull(){
        //given
        int id = 1;
        String city = "Warszawa";
        String street = "Złota";
        int monthlyCost = 1000;
        double area = 59.5;
        double gardenArea = 100;
        House house = new House(id, city, street, area, monthlyCost, gardenArea);
        houseCollection.addRealEstateToArrayList(house);

        //when
        houseCollection.deleteRealEstate(1);

        //then
        assertEquals(0, houseCollection.getRealEstate().size());
    }

}