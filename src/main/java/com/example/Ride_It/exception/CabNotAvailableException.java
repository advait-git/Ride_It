package com.example.Ride_It.exception;

public class CabNotAvailableException extends RuntimeException{
    public CabNotAvailableException(String message){
        super(message);
    }

}
