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
public class LionTest {

    // spy для проверки методов класса Lion
    private final Feline feline = Mockito.spy(Feline.class);

    private String sex;
    private boolean hasMane;

    /**
     * конструктор
     *
     * @param sex пол.
     */
    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "{index}: sex: {0};  hasMane: {1}")
    public static Object[][] parameters() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void getKittensCallGetKittensIsCalled() {
        new Lion(sex, feline).getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getKittensCountOneCompareIsEqual() {
        Assert.assertEquals(1, new Lion(sex, feline).getKittens());
    }

    @Test
    public void getFoodCallGetFoodIsCalled() {
        new Lion(sex, feline).getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getFoodCompareResultIsEqual() {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), new Lion(sex, feline).getFood());
    }

    @Test
    public void hasManeCompareResultIsEqual() {
        Assert.assertEquals(hasMane, new Lion(sex, feline).doesHaveMane());
    }
}