package org.example;

public class Pet {
    private String type;
    private int weight;
    private boolean predator;

    public Pet(String type, int weight, boolean predator) {
        this.type = type;
        this.weight = weight;
        this.predator = predator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }
}
