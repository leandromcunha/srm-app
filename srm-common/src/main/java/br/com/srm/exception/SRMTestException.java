package br.com.srm.exception;

public class SRMTestException extends RuntimeException {

    private static final long serialVersionUID = 4276869371158911736L;

    public SRMTestException(final String message) {
        super(message);
    }

    public SRMTestException(final String message, final Throwable e) {
        super(message, e);
    }

}
