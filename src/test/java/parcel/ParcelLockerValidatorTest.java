package parcel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ParcelLockerValidatorTest {

    @Test
    void testSuccess() {
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

}