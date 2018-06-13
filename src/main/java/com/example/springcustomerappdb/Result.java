package com.example.springcustomerappdb;

public class Result {
    private String code;
    private String message;

    public Result(String name, String code) {
        this.code = code;
        this.message = name + "  added!";
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
