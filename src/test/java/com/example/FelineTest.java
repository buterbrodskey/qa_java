package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittensNum;

    public FelineTest(int kittensNum) {
        this.kittensNum = kittensNum;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Collection<Object> getKittensNumData() {
        return Arrays.asList(new Object[]{
                1, 2, 3, 4, 5
        });
    }

    @Test
    public void eatMeatIfPredatorEatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Список еды некорректный для Feline", expected, actual);
    }

    @Test
    public void getFamilyKittensTest() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Неверное семейство для Feline", expected, actual);
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Неверное количество котят", expected, actual);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensNum);
        assertEquals("Неверное количество котят", kittensNum, actual);
    }
}