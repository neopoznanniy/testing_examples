package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    Pet randomPet = new Pet("dog", 5, true);

    @Test
    public void getType() {
        assertEquals("dog", randomPet.getType());
    }

    @Test
    public void setType() {
        randomPet.setType("cat");
        assertEquals("cat", randomPet.getType());
    }

    @Test
    public void getWeight() {
        assertEquals(5, randomPet.getWeight());
    }

    @Test
    public void setWeight() {
        randomPet.setWeight(6);
        assertEquals(6, randomPet.getWeight());
    }

    @Test
    public void isPredator() {
        assertTrue(randomPet.isPredator());
    }

    @Test
    public void setPredator() {
        randomPet.setPredator(false);
        assertFalse(randomPet.isPredator());
    }
}