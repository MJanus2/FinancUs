package parcel;

public class ParcelLockerService {
    private ParcelLockerCollection parcelLockerCollection = new ParcelLockerCollection();


    boolean addParcelLocker(int id, String name, String address, int capacity) {
        boolean isValid = ParcelLockerValidator.validator(id, name, address, capacity);
        if (isValid) {
            ParcelLocker parcelLocker = new ParcelLocker(id, name, address, capacity);
            parcelLockerCollection.addParcelLocker(parcelLocker);
        }
        return isValid;
    }

    public ParcelLocker[] getParcelLockers() {
        return parcelLockerCollection.getParcelLockers();
    }

    public void deleteParcelLocker(int id) {
        parcelLockerCollection.deleteParcelLocker(id);
    }
}
