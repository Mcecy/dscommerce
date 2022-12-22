package com.mcecy.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException {

    public ResourceNotFoundException(String msg) {
        super(msg);
    }
}
