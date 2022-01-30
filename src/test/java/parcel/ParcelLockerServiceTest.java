package parcel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ParcelLockerServiceTest {

    @Test
    void given_valid_input_when_adding_via_service_then_parcel_locker_should_be_added_to_collection() {
        ParcelLockerService parcelLockerService = new ParcelLockerService();
        int id = 2;
        String name = "WAW";
        String address = "Warszawa,Posag,02-495";
        int capacity = 20;

        boolean result = parcelLockerService.addParcelLocker(id, name, address, capacity);

        Assertions.assertTrue(result);
        ParcelLocker parcelLocker = getById(parcelLockerService, id);
        Assertions.assertNotNull(parcelLocker);
        Assertions.assertEquals(name, parcelLocker.getName());
        Assertions.assertEquals(address, parcelLocker.getAddress());
        Assertions.assertEquals(capacity, parcelLocker.getCapacity());
    }
    @Test
    void given_existing_parcel_locker_id_when_removing_parcel_locker_then_parcel_should_be_removed_from_collection() {
        ParcelLockerService parcelLockerService = new ParcelLockerService();
        ParcelLockerCollection parcelLockerCollection = new ParcelLockerCollection();
        parcelLockerCollection.addParcelLocker(new ParcelLocker(1, "Test", "Akacjowa,Szczecin,70-000", 20));
        parcelLockerService.setParcelLockerCollection(parcelLockerCollection);

        parcelLockerService.deleteParcelLocker(1);

        ParcelLocker parcelLocker = getById(parcelLockerService,1);
        Assertions.assertNull(parcelLocker);
    }

    private ParcelLocker getById(ParcelLockerService parcelLockerService, int id) {
        for (ParcelLocker parcelLocker : parcelLockerService.getParcelLockers()) {
            if (parcelLocker != null && parcelLocker.getId() == id) {
                return parcelLocker;
            }
        }
        return null;
    }
}
