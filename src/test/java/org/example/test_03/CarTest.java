package org.example.test_03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тестируем изменения в ArrayList
 */
class CarTest {

    Car car;

    @BeforeEach
    public void createCar(){
        car = new Car("Marco Polo");
    }

    @Test
    void getOwner() {
        assertEquals("Marco Polo", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Jules Verne");
        assertEquals("Jules Verne", car.getOwner());
        assertArrayEquals(new String[]{"Marco Polo", "Jules Verne"}, car.getOwners().toArray());
    }

    @Test
    void getOwners() {
        car.setOwner("Jules Verne");
        car.setOwner("Vasco da Gama");
        assertArrayEquals(new String[]{"Marco Polo", "Jules Verne", "Vasco da Gama"}, car.getOwners().toArray());
    }
}