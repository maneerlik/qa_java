package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author  smirnov sergey
 * @since   18.03.2023
 */
@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {

    @Test(expected = IllegalArgumentException.class)
    public void getFoodIncorrectAnimalKindThrowsException() {
        new Animal().getFood("Omnivore");
    }

}