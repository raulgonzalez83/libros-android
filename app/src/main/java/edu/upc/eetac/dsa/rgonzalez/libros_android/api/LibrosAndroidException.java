package edu.upc.eetac.dsa.rgonzalez.libros_android.api;

public class LibrosAndroidException extends Exception {
    private static final long serialVersionUID = 8825044442990461259L;

    public LibrosAndroidException() {
    }

    public LibrosAndroidException(String detailMessage) {
        super(detailMessage);
    }

}
