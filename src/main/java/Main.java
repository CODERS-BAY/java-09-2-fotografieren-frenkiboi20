import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int[] res = {1280, 1024, 1680, 1050, 1920, 1080};

        int[][] displayOne = new int[res[0]][res[1]];
        Camera cameraOne = new Camera("Nikon", new int[res[0]][res[1]], res[0], res[1], false, Color.RED);

        int[][] displayTwo = new int[res[2]][res[3]];
        Camera cameraTwo = new Camera("Minolta", new int[res[0]][res[1]], res[2], res[3], false, Color.GREEN);

        int[][] displayThree = new int[res[4]][res[5]];
        Camera cameraThree = new Camera("Canon", new int[res[0]][res[1]], res[4], res[5], false, Color.BLUE);

        System.out.println(cameraOne.toString());
        Lens lens = new Lens(80);
        cameraOne.changeLens(lens);
        System.out.println(cameraOne.toString());

    }

}
