package com.re.wanderlust.core.exception;


/**
 * Represents a Exception class
 * used for <b>Re Wanderlust</b> project implementation.
 *
 * @version 1.0
 * @since 1.0
 */
public class REWException extends Exception {

    /**
     * Class Constructor.
     */
    public REWException() {
        super();
    }

    /**
     * Class Constructor.
     * @param message
     * @param cause
     */
    public REWException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Class Constructor.
     *
     * @param message
     */
    public REWException(final String message) {
        super(message);
    }

    /**
     * Class Constructor.
     *
     * @param cause
     */
    public REWException(final Throwable cause) {
        super(cause);
    }

}
