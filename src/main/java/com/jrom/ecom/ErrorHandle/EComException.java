package com.jrom.ecom.ErrorHandle;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EComException extends Exception {

    HttpStatus httpStatus;

    public EComException(HttpStatus httpStatus, Throwable cause)
    {
        super(cause);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
