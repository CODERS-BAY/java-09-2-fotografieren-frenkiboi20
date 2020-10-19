import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CameraTest {

    @Test
    public void testSetCorrectCameraLens() throws FocalLengthTooSmallException, FocalLengthTooBigException {

        Lens lens = new Lens(100);
        assertEquals(lens.getFocalLen(), 100);

    }

    @Test
    public void testChangeCameraLens() throws FocalLengthTooSmallException, FocalLengthTooBigException {
        Lens miniLens = new Lens(100);

        Camera camera = new Camera("Kodak", new int[1920][1080], 1920, 1080, false, new Color(100, 100, 100), miniLens);
        assertEquals(camera.getLens().getFocalLen(), 100);

        Lens maxiLens = new Lens(500);
        camera.changeLens(maxiLens);
        assertEquals(camera.getLens().getFocalLen(), 500);

    }

    @Test
    public void testAmountOfLenses() throws FocalLengthTooSmallException, FocalLengthTooBigException {

        Camera cam1 = new Camera("Kodak", new int[1920][1080], 1920, 1080, false, new Color(100, 100, 100), new Lens(250));
        Camera cam2 = new Camera("Minolta", new int[1920][1080], 1920, 1080, false, new Color(100, 100, 100), new Lens(100));
        Camera cam3 = new Camera("NoMark", new int[1920][1080], 1920, 1080, false, new Color(100, 100, 100), new Lens(150));

        assertEquals(Camera.cameraCount, 3);
    }

    @Test
    public void testFocalLengthTooBigException() {

        assertThrows(FocalLengthTooBigException.class, () -> new Lens((1200)));
    }

    @Test
    public void testFocalLengthTooSmallException() {

        assertThrows(FocalLengthTooSmallException.class, () -> new Lens((5)));
    }


}
