package com.financus.realestates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateValidatorTest {

    @Test
    void providedYesShouldReturnFalse() {
        //given
        String test = "Yes";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertFalse(isValid);
    }
    @Test
    void providedString1ShouldReturnTrue() {
        //given
        String test = "1";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedYesShouldReturnTrue() {
        //given
        String test = "Yes";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertFalse(isValid);
    }
    @Test
    void providedUpperYShouldReturnTrue() {
        //given
        String test = "Y";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedUpperNShouldReturnTrue() {
        //given
        String test = "N";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedLowerYShouldReturnTrue() {
        //given
        String test = "y";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedLowerNShouldReturnTrue() {
        //given
        String test = "n";

        //when
        boolean isValid = RealEstateValidator.isParkingValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void provided2ShouldReturnTrue() {
        //given
        int test = 2;

        //when
        boolean isValid = RealEstateValidator.isAreaValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void provided122ShouldReturnTrue() {
        //given
        int test = 122;

        //when
        boolean isValid = RealEstateValidator.isAreaValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void provided1_5ShouldReturnTrue() {
        //given
        double test = 1.5;

        //when
        boolean isValid = RealEstateValidator.isAreaValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void provided10000_5ShouldReturnFalse() {
        //given
        double test = 10000.5;

        //when
        boolean isValid = RealEstateValidator.isAreaValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void provided0ShouldReturnFalse() {
        //given
        double test = 0;

        //when
        boolean isValid = RealEstateValidator.isAreaValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void provided1ShouldReturnTrue() {
        //given
        int test = 1;

        //when
        boolean isValid = RealEstateValidator.isIdValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void provided120ShouldReturnTrue() {
        //given
        int test = 120;

        //when
        boolean isValid = RealEstateValidator.isIdValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedShouldReturnTrue() {
        //given
        int test = 1000;

        //when
        boolean isValid = RealEstateValidator.isIdValid(test);

        //then
        assertFalse(isValid);
    }
    @Test
    void provided0ShouldReturnTrue() {
        //given
        int test = 0;

        //when
        boolean isValid = RealEstateValidator.isIdValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCorrectDataShouldReturnTrue() {
        //given
        String test = "Warszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedCorrectDataWithSpaceBetweenWordsShouldReturnTrue() {
        //given
        String test = "Nowy Zdrój";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertTrue(isValid);
    }

    @Test
    void providedCityWithLowerCaseShouldReturnFalse() {
        String test = "warszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCityWithSpaceSecondWordWithLowerCaseShouldReturnFalse() {
        String test = "Nowy zdrój";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCityWithNumberShouldReturnFalse() {
        String test = "W4rszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCityWithNumberAndLowerCaseShouldReturnFalse() {
        String test = "w4rszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCityWithSpaceAtTheBeginningShouldReturnFalse() {
        String test = " Warszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedCityWithSpaceAtTheEndShouldReturnFalse() {
        String test = "Warszawa ";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedWithoutLetterShouldReturnFalse() {
        String test = "";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }

    @Test
    void providedWithNumberAtTheBeginningShouldReturnFalse() {
        String test = "4Warszawa";

        //when
        boolean isValid = RealEstateValidator.isCityValid(test);

        //then
        assertFalse(isValid);
    }


}