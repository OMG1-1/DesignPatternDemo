package com.kzy._02abs_factory.color.entity;

import com.kzy._02abs_factory.color.Color;

public class Red implements Color {
 
   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}