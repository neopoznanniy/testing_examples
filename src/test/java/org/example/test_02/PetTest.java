package org.example.test_02;

import org.example.test_02.Pet;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void getType() {
        Pet randomPet = new Pet("dog", 5, true);
        assertEquals("dog", randomPet.getType());
    }

    @Test
    public void setType01() {
        Pet randomPet = new Pet("dog", 5, true);
        randomPet.setType("cat");
        assertEquals("dog", randomPet.getType());
    }

    @Test
    public void setType02() {
        Pet randomPet = new Pet("", 5, true);
        randomPet.setType("cat");
        assertEquals("cat", randomPet.getType());
    }

    @Test
    public void getWeight() {
        Pet randomPet = new Pet("dog", 5, true);
        assertEquals(5, randomPet.getWeight());
    }

    @Test
    public void setWeight() {
        Pet randomPet = new Pet("dog", 5, true);
        randomPet.setWeight(6);
        assertEquals(6, randomPet.getWeight());
    }

    @Test
    public void isPredator() {
        Pet randomPet = new Pet("dog", 5, true);
        assertTrue(randomPet.isPredator());
    }

    @Test
    public void setPredator() {
        Pet randomPet = new Pet("dog", 5, true);
        randomPet.setPredator(false);
        assertFalse(randomPet.isPredator());
    }
}