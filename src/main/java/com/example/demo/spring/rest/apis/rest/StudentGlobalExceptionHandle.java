package com.example.demo.spring.rest.apis.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentGlobalExceptionHandle {

    // It handles regular case of student not found exception
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatusCode(HttpStatus.NOT_FOUND.value());
        error.setErrormessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);

    }

    // It handles all generic cases when passed wrong data
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception ex){
        StudentErrorResponse error = new StudentErrorResponse();

        error.setStatusCode(HttpStatus.BAD_REQUEST.value());
        error.setErrormessage(ex.getMessage());
        error.setTimestamp(System.currentTimeMillis());

        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);

    }

}
