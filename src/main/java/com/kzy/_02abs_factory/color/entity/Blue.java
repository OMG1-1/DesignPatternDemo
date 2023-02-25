package com.kzy._02abs_factory.color.entity;

import com.kzy._02abs_factory.color.Color;

public class Blue implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}