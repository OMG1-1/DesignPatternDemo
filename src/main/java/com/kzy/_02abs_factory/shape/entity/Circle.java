package com.kzy._02abs_factory.shape.entity;

import com.kzy._02abs_factory.shape.Shape;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}