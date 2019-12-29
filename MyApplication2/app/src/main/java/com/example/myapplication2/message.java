package com.example.myapplication2;

public class message {
    private String name;
    private String details;

    public message(String name,String details)
    {
        this.name=name;
        this.details=details;
    }

    public String getName()
    {
        return name;
    }

    public String getDetails() {
        return details;
    }
}
