package com.example.demo.spring.rest.apis.rest;


public class StudentErrorResponse {
    private int statusCode;
    private String errormessage;
    private long timestamp;

    public StudentErrorResponse(){

    }

    public StudentErrorResponse(int statusCode, String errormessage, long timestamp) {
        this.statusCode = statusCode;
        this.errormessage = errormessage;
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
