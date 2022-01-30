package parcel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParcelLockerValidatorTest {

    @Test
    void given_Id__10_Name__WAW_Address__Warszawa__Zlota__02495_Capacity__20_when_validate_then_validation_should_return_true() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertTrue(isValid);

    }
    @Test
    void given_Id__123456890_Name__WAW_Address__Warszawa__Zlota__02495_Capacity__20_when_validate_then_validation_should_return_false() {
        //given
        int id = 123456890;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);

    }

    @Test
    void given_Id__10_Name__12345678910_Address__Warszawa__Zlota__02495_Capacity__20_when_validate_then_validation_should_return_false() {
        //given
        int id = 10;
        String name = "12345678910";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);

    }

    @Test
    void given_Id__10_Name__WAW_Address__Warszawa__Posag_7_Panien__102495_Capacity__20_when_validate_then_validation_should_return_false() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Warszawa, Posag 7 Panien, 102-495";
        int capacity = 20;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);

    }

    @Test
    void given_Id__10_Name__WAW_Address__Warszawa__Zlota__02495_Capacity__1200_when_validate_then_validation_should_return_false() {
        //given
        int id = 10;
        String name = "WAW";
        String adress = "Warszawa,Zlota,02-495";
        int capacity = 1200;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);
    }
        @Test
        void given_Id__10_Name__WAW_Address_Capacity__1200_when_validate_then_validation_should_return_false() {
            //given
            int id = 10;
            String name = "WAW";
            String adress = "";
            int capacity = 20;

            //when
            boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

            //then
            Assertions.assertFalse(isValid);

    }

    @Test
    void testFalse() {
        //given
        int id = 1023;
        String name = "WAW352ASFASFASF";
        String adress = "Warszawa - Zlota - 02-495";
        int capacity = 2000;

        //when
        boolean isValid = ParcelLockerValidator.validator(id, name, adress, capacity);

        //then
        Assertions.assertFalse(isValid);

    }



}