public class FocalLengthTooBigException extends Throwable {

    public FocalLengthTooBigException() {
        System.out.println("Brennweite des Objektivs zu gross [MAX = 100mm]");
    }
}
