public class Parcel {
    private int heightInCm;
    private int weightInCm;
    private int depthInCm;

    public Parcel(int heightInCm, int weightInCm, int depthInCm) {
        this.heightInCm = heightInCm;
        this.weightInCm = weightInCm;
        this.depthInCm = depthInCm;
    }

    public static Parcel createParcel(int heightInCm, int weightInCm, int depthInCm) {
        return new Parcel(heightInCm, weightInCm, depthInCm);
    }

}
