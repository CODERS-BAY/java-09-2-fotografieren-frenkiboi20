import java.awt.*;

public class Camera {

    private String brand;
    private long megaPixels;
    private int[][] display;
    private boolean isGreyScaled;
    private Color color;
    private Lens lens;
    public static int cameraCount;

    public Camera(String brand, int[][] display, int xSize, int ySize, boolean isGreyScaled, Color color, Lens lens) {
        this.brand = brand;
        this.display = display;
        megaPixels = xSize * ySize;
        this.isGreyScaled = isGreyScaled;
        this.color = color;
        this.lens = lens;
        cameraCount++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(long megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int[][] getDisplay() {
        return display;
    }

    public void setDisplay(int[][] display) {
        this.display = display;
    }

    public boolean isGreyScaled() {
        return isGreyScaled;
    }

    public void setGreyScaled(boolean greyScaled) {
        isGreyScaled = greyScaled;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void changeLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels + "MP" +
                ", isGreyScaled=" + isGreyScaled +
                ", color=" + color +
                ", lens=" + lens.getFocalLen() + "mm" +
                '}';
    }

    public Lens getLens() {
        return lens;
    }
}
