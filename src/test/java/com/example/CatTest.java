package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

/**
 * @author  smirnov sergey
 * @since   18.03.2023
 */
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getSound() {
        Assert.assertEquals("Мяу", new Cat(feline).getSound());
    }

    @Test
    public void getFoodMethodWork() {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Мыши", "Птицы", "Мясо"));
        Assert.assertEquals(List.of("Мыши", "Птицы", "Мясо"), new Cat(feline).getFood());
    }

}