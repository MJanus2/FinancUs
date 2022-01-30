package parcel;

public class ParcelLockerCollection {
    private ParcelLocker[] parcelLockers = new ParcelLocker[10];

    public void addParcelLocker(ParcelLocker parcelLocker) {
        for (int i=0;i<parcelLockers.length;i++) {
            if (parcelLockers[i] == null) {
                parcelLockers[i] = parcelLocker;
                break;
            }
        }
    }

    public ParcelLocker[] getParcelLockers() {
        return parcelLockers;
    }
}
