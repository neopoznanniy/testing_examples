package org.example.test_03;

import java.util.ArrayList;

public class Car {

    private String owner;
    private ArrayList<String> owners;


    public Car(String owner) {
        this.owner = owner;
        this.owners = new ArrayList<>();
        owners.add(owner);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        owners.add(owner);
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}
