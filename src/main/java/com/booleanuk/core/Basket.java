package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {

   Map<String, Integer> basketItems = new HashMap<>();
   private int basketLimit = 20;

    public void addBagel (String bagelName, int quantity){
        if(basketItems.containsKey(bagelName)){
            basketItems.put(bagelName, basketItems.get(bagelName)+quantity);
        }else{
            basketItems.put(bagelName, quantity);
        }

    }



}
