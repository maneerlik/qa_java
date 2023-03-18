package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.List;

/**
 * @author  smirnov sergey
 * @since   18.03.2023
 */
@RunWith(Parameterized.class)
public class AnimalTest {

    // spy для проверки методов класса Animal
    private Animal animal = Mockito.spy(Animal.class);

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
    public void getFoodTest() {
        Assert.assertEquals(expectedFoodList, animal.getFood(animalKind));
    }

    @Test
    public void getFamily() {
        Assert.assertEquals("Существует несколько семейств:" +
                " заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}