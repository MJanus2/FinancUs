public class ParcelLocker {
private String cityOfParcelLocker;
private String streetOfParcelLocker;
private int numberOfParcelLocker;

    public ParcelLocker(String cityOfParcelLocker, String streetOfParcelLocker,
                        int numberOfParcelLocker, Parcel... parcels) {
        this.cityOfParcelLocker = cityOfParcelLocker;
        this.streetOfParcelLocker = streetOfParcelLocker;
        this.numberOfParcelLocker = numberOfParcelLocker;
    }
    public ParcelLocker(String cityOfParcelLocker, String streetOfParcelLocker,
                        int numberOfParcelLocker) {
        this.cityOfParcelLocker = cityOfParcelLocker;
        this.streetOfParcelLocker = streetOfParcelLocker;
        this.numberOfParcelLocker = numberOfParcelLocker;
    }

    public static ParcelLocker createParcelLocker(String cityOfParcelLocker, String streetOfParcelLocker,
                             int numberOfParcelLocker){
        return new ParcelLocker(cityOfParcelLocker, streetOfParcelLocker, numberOfParcelLocker);
    }

    public String getCityOfParcelLocker() {
        return cityOfParcelLocker;
    }

    public String getStreetOfParcelLocker() {
        return streetOfParcelLocker;
    }

    public int getNumberOfParcelLocker() {
        return numberOfParcelLocker;
    }

    public void setCityOfParcelLocker(String cityOfParcelLocker) {
        this.cityOfParcelLocker = cityOfParcelLocker;
    }

    public void setStreetOfParcelLocker(String streetOfParcelLocker) {
        this.streetOfParcelLocker = streetOfParcelLocker;
    }

    public void setNumberOfParcelLocker(int numberOfParcelLocker) {
        this.numberOfParcelLocker = numberOfParcelLocker;
    }
}
