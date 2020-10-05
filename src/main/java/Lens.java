public class Lens {

    private int focalLen;
    private int maxFocalLen = 100;
    private int minFocalLen = 10;
    public static int lenCount;

    public Lens(int focalLen) {
        setFocalLen(focalLen);
        lenCount++;
    }

    public void setFocalLen(int focalLen) {
        if (focalLen > maxFocalLen) {
            System.out.println("Brennweite des Objektivs zu gross [MAX = 100mm]");
        } else if (focalLen < minFocalLen) {
            System.out.println("Brennweite des Objektivs zu klein [MIN = 10mm]");
        } else {
            this.focalLen = focalLen;
        }
    }

    public int getFocalLen() {
        return focalLen;
    }

    public int getMaxFocalLen() {
        return maxFocalLen;
    }

    public void setMaxFocalLen(int maxFocalLen) {
        this.maxFocalLen = maxFocalLen;
    }

    public int getMinFocalLen() {
        return minFocalLen;
    }

    public void setMinFocalLen(int minFocalLen) {
        this.minFocalLen = minFocalLen;
    }

    @Override
    public String toString() {
        return "Lens{" +
                "focalLen=" + focalLen +
                ", maxFocalLen=" + maxFocalLen +
                ", minFocalLen=" + minFocalLen +
                '}';
    }
}
