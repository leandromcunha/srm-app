package br.com.srm.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable{

    private static final long serialVersionUID = 6618118417860513049L;

    public ResponseDTO( final String message ){
        this.message = message;
    }

    private String message;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
