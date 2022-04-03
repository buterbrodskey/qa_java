package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> expectedFoodList;

    public AnimalTest(String animalKind, List<String> expectedFoodList) {
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getAnimalKindsData() {
        return Arrays.asList(new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")}
        });
    }

    @Test
    public void getFoodTestDependAnimalKindTest() throws Exception {
        Animal animal = new Animal();
        List<String> actualFoodList = animal.getFood(animalKind);
        Assert.assertEquals(actualFoodList, expectedFoodList);
    }
}