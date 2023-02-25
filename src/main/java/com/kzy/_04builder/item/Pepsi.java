package com.kzy._04builder.item;

import com.kzy._04builder.item.ColdDrink;

public class Pepsi extends ColdDrink {
 
   @Override
   public float price() {
      return 35.0f;
   }
 
   @Override
   public String name() {
      return "Pepsi";
   }
}