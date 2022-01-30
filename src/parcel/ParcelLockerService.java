package parcel;

public class ParcelLockerService {
    private ParcelLockerCollection parcelLockerCollection = new ParcelLockerCollection();

    public void addParcelLocker(int id, String name, String address, int capacity) {
        //idealne miejsce na walidację danych
        ParcelLocker parcelLocker = new ParcelLocker(id, name, address, capacity);
        parcelLockerCollection.addParcelLocker(parcelLocker);
    }

    public ParcelLocker[] getParcelLockers() {
        return parcelLockerCollection.getParcelLockers();
    }
}
