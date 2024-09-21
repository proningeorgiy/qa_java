package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);

        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}