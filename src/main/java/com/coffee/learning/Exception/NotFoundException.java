package com.coffee.learning.Exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

public class NotFoundException  extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }
    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<Object> handleApiRequestException(
            NotFoundException e
    ){
        ApiException apiException = new ApiException(e.getMessage(),
                e,
                HttpStatus.NOT_FOUND ,
                ZonedDateTime.now());
        return new ResponseEntity<>(apiException , HttpStatus.NOT_FOUND);
    }
}
