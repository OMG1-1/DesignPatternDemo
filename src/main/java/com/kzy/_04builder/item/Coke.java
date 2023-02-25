package com.kzy._04builder.item;

import com.kzy._04builder.item.ColdDrink;

public class Coke extends ColdDrink {
 
   @Override
   public float price() {
      return 30.0f;
   }
 
   @Override
   public String name() {
      return "Coke";
   }
}