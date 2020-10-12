import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CameraTest {

    @Test
    public void testSetCorrectCameraLens() {

        Lens lens = new Lens(100);
        assertEquals(lens.getFocalLen(), 100);

    }

    @Test
    public void testChangeCameraLens() {
        Lens miniLens = new Lens(100);

        Camera camera = new Camera("Kodak", new int[1920][1080], 1920, 1080, false, new Color(100,100,100), miniLens);
        assertEquals(camera.getLens().getFocalLen(), 100);

        Lens maxiLens = new Lens(500);
        camera.changeLens(maxiLens);
        assertEquals(camera.getLens().getFocalLen(), 500);

    }

    @Test
    public void testAmountOfLenses() {

        Camera cam1 = new Camera("Kodak", new int[1920][1080], 1920, 1080, false, new Color(100,100,100), new Lens(250));
        Camera cam2 = new Camera("Minolta", new int[1920][1080], 1920, 1080, false, new Color(100,100,100), new Lens(100));
        Camera cam3 = new Camera("NoMark", new int[1920][1080], 1920, 1080, false, new Color(100,100,100), new Lens(150));

        assertEquals(Camera.cameraCount, 3);
    }

}
