package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

   Map<String, Integer> basketItems = new HashMap<>();
   private int basketLimit = 20;
   int basketTotal = 0;
    public void addBagel (String bagelName, int quantity){

        if(basketItems.containsKey(bagelName)){
            basketItems.put(bagelName, basketItems.get(bagelName)+quantity);
            basketTotal = basketItems.values().stream().reduce(0, Integer::sum);
        }else{
            basketItems.put(bagelName, quantity);
            basketTotal = basketItems.values().stream().reduce(0, Integer::sum);
        }
    }



}
