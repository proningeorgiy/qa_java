package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();

        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getFood();

        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void notMaleFemaleException() throws Exception {

        Exception thrown = assertThrows(Exception.class, () -> new Lion("Транс", feline));

        assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
    }
}