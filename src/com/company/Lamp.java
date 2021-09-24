package com.company;

public class Lamp {

    private boolean slukket;
    private String status;
    private String name;

    //konstruktør
    public Lamp(String name) {
        this.name = name;
    }

    public Lamp() {
        this.slukket = true;
    }

    public void trykPåKontakt() {
        if (slukket == true) {
            slukket = false;
        } else {
            slukket = true;
        }

    }

    public boolean isSlukket() {
        return slukket;
    }

    public String toString() {
        if (slukket == true) {
            status = "On";

        } else status = "Off";

        return name + " is " + status;
    }

    public boolean getStatus(){
        return this.slukket;
    }

    public String getLampName(){
        return name;
    }

}




