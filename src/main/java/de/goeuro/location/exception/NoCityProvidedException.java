package de.goeuro.location.exception;

/**
 * The NoCityProvidedException class
 *
 * @author noushad
 *
 */
public class NoCityProvidedException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -6686739889757882180L;

    public NoCityProvidedException(String message, Throwable t) {
        super(message, t);
    }

    /**
     * @param string
     */
    public NoCityProvidedException(String string) {
        super(string);
    }

}
