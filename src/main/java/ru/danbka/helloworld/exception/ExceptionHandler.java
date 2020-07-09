package ru.danbka.helloworld.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/9/2020: 5:09 PM
 */
@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(UnknownUserException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public UnknownUserException unknownUserException(UnknownUserException e) {
        return e;
    }

}
