package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
        basket.addBagel("Poppy Seed");
        Assertions.assertEquals("Poppy Seed", basket.basket());
    }
}
