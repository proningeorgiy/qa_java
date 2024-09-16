package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean hasMane;

    Feline feline = Mockito.mock(Feline.class);

    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }


    @Parameterized.Parameters
    public static Object[][] FAQs() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();

        Mockito.verify(feline).getKittens();
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);

        assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();

        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void notMaleFemaleException() throws Exception {

        Exception thrown = assertThrows(Exception.class, () -> new Lion("Транс", feline));

        assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
    }
}