package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author  smirnov sergey
 * @since   18.03.2023
 */
@RunWith(MockitoJUnitRunner.class)
public class LionIncorrectInstanceExceptionTest {

    @Mock
    private Feline feline;

    @Test(expected = IllegalArgumentException.class)
    public void lionIncorrectInstance() {
        new Lion("Hermaphroditus", feline);
    }

}