package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class BasketTest {
    @Test
    public void testAddBagel(){
        Basket basket = new Basket();
         basket.addBagel("Poppy Seed", 5);
         basket.addBagel("Cinnamon",  12);
         basket.addBagel("Honey",  4);
         basket.addBagel("Cheese",  5);
         basket.addBagel("Garlic",  6);
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("Poppy Seed", 5);
        expectedMap.put("Cinnamon",  12);
        expectedMap.put("Honey",  4);
        expectedMap.put("Cheese",  5);
        expectedMap.put("Garlic",  6);
        Assertions.assertEquals(expectedMap, basket.basketItems);
    }
    @Test
    public void testExceededBasketLimit(){
        Basket basket = new Basket();
        basket.setBasketLimit(3);
        Assertions.assertEquals(basket.exceededBasketLimit(basket.getBasketLimit(), 5), true);
        basket.setBasketLimit(10);
        Assertions.assertEquals(basket.exceededBasketLimit(basket.getBasketLimit(), 7), false);


    }
}
