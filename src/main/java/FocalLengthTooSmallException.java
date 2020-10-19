public class FocalLengthTooSmallException extends Throwable {

    public FocalLengthTooSmallException() {
        System.out.println("Brennweite des Objektivs zu klein [MIN = 10mm]");
    }
}
