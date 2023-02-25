package com.kzy._04builder;

import com.kzy._04builder.item.ChickenBurger;
import com.kzy._04builder.item.Coke;
import com.kzy._04builder.item.Pepsi;
import com.kzy._04builder.item.VegBurger;

public class MealBuilder {
 
   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   
 
   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}