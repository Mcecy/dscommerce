package com.mcecy.dscommerce.dto;

public class CustomError {

    private String timestamp;
    private Integer status;
    private String error;
    private String path;

    public CustomError(String timestamp, Integer status, String error, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
        this.path = path;
    }
}
