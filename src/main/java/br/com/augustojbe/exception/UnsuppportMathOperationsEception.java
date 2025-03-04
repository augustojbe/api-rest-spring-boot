package br.com.augustojbe.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuppportMathOperationsEception extends RuntimeException {
    public UnsuppportMathOperationsEception(String message) {
        super(message);
    }
}
