package br.com.srm.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.srm.dto.DetailErro;
import br.com.srm.exception.SRMTestException;

@ControllerAdvice
public class DataExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = {SRMTestException.class } )
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public DetailErro<SRMTestException> handleDataNotFoundException (
                    final SRMTestException e,
                    final HttpServletRequest request) {
        return new DetailErro<>(e, HttpStatus.NOT_FOUND);
    }
}