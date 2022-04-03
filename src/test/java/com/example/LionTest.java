package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeIfSexIsMan() throws Exception {
        String sex = "Самец";
        boolean expectedManeStatus = true;
        Lion lion = new Lion(sex, feline);
        boolean actualManeStatus = lion.doesHaveMane();
        assertEquals(expectedManeStatus, actualManeStatus);
    }

    @Test
    public void doesntHaveManeIfSexIsWomanTest() throws Exception {
        String sex = "Самка";
        boolean expectedManeStatus = false;
        Lion lion = new Lion(sex, feline);
        boolean actualManeStatus = lion.doesHaveMane();
        assertEquals(expectedManeStatus, actualManeStatus);
    }

    @Test
    public void getFoodRandomCorrectInputDataTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
}