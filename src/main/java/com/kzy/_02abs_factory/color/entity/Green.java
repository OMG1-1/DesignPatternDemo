package com.kzy._02abs_factory.color.entity;

import com.kzy._02abs_factory.color.Color;

public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}