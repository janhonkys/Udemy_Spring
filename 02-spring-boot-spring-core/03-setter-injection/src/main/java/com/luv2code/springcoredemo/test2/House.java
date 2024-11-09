package com.luv2code.springcoredemo.test2;

public class House {

    private String address;

    private Roof roof;

    public House(String address, Roof roof) {
        this.address = address;
        this.roof = roof;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }
}
