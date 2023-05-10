package com.example.Jobs.model;

public enum JobType {
    IT("Information Technology"),
    HR("Human Resources"),
    SALES("Sales"),
    MARKETING("Marketing");

    private final String value;

    JobType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
