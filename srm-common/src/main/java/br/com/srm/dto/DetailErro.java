package br.com.srm.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetailErro<E extends RuntimeException> implements Serializable {
    private static final long serialVersionUID = 1431042535883378110L;
    private Integer status;
    private E exception;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date timestamp;

    private String messageErro;

    public DetailErro(final E e, final HttpStatus status) {
        this.setException(e);
        this.setMessageErro(e.getMessage());
        this.setStatus(status.value());
        this.setTimestamp(new Date());
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(final Integer i) {
        this.status = i;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(final Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessageErro() {
        return this.messageErro;
    }

    public void setMessageErro(final String messageErro) {
        this.messageErro = messageErro;
    }

    public E getException() {
        return this.exception;
    }

    public void setException(final E exception) {
        this.exception = exception;
    }
}