package com.example.demo5.domain;

public class Greeting {
    private long id;
    private String conten;

    public Greeting() {
    }

    public Greeting(long id, String conten) {
        this.id = id;
        this.conten = conten;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }
}