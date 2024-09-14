package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {

    @Test
    public void getKittens() throws Exception {
        LionAlex lionAlex = new LionAlex(new Feline());

        assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void getFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(new Feline());

        assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() throws Exception {
        LionAlex lionAlex = new LionAlex(new Feline());

        assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}