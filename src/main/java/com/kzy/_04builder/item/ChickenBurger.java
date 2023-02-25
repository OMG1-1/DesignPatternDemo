package com.kzy._04builder.item;

import com.kzy._04builder.item.Burger;

public class ChickenBurger extends Burger {
 
   @Override
   public float price() {
      return 50.5f;
   }
 
   @Override
   public String name() {
      return "Chicken Burger";
   }
}