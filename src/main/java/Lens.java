public class Lens {

    private int focalLen;
    private int maxFocalLen = 1000;
    private int minFocalLen = 10;
    public static int lensCount;

    public Lens(int focalLen) throws FocalLengthTooSmallException, FocalLengthTooBigException {
        setFocalLen(focalLen);
        lensCount++;
    }

    public void setFocalLen(int focalLen) throws FocalLengthTooBigException, FocalLengthTooSmallException {
        if (focalLen > maxFocalLen) {
            throw new FocalLengthTooBigException();
        } else if (focalLen < minFocalLen) {
            throw new FocalLengthTooSmallException();
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
