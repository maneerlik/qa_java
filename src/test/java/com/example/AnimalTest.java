package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

/**
 * @author  smirnov sergey
 * @since   18.03.2023
 */
@RunWith(Parameterized.class)
public class AnimalTest {

    private final String animalKind;
    private final List<String> expectedFoodList;

    public AnimalTest(String animalKind, List<String> expectedFoodList) {
        this.animalKind = animalKind;
        this.expectedFoodList = expectedFoodList;
    }

    @Parameterized.Parameters(name = "{index}: squad: {0};  food: {1}")
    public static Object[][] parameters() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodCorrectAnimalKindIsEqual() {
        Assert.assertEquals(expectedFoodList, new Animal().getFood(animalKind));
    }

    @Test
    public void getFamilyCallResultCompareIsEqual() {
        Assert.assertEquals("Существует несколько семейств:" +
                " заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", new Animal().getFamily());
    }
}