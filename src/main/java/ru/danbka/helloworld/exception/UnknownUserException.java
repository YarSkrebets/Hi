package ru.danbka.helloworld.exception;

/**
 * Created by: Yaroslav Skrebets <sonic@c7x.dev>
 * Date: 7/9/2020: 5:09 PM
 */
public class UnknownUserException extends IllegalStateException {
    public UnknownUserException(String s) {
        super(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
