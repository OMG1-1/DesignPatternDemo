package com.kzy._02abs_factory.shape.entity;

import com.kzy._02abs_factory.shape.Shape;

public class Square implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}