package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeIfSexIsMan() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        assertTrue("У самца должна быть грива", lion.doesHaveMane());
    }

    @Test
    public void doesntHaveManeIfSexIsWomanTest() throws Exception {
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        assertFalse("У самки не должно быть гривы", lion.doesHaveMane());
    }

    @Test
    public void getFoodRandomCorrectInputDataTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }
}