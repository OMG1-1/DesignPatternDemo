package com.kzy._02abs_factory.color;

import com.kzy._02abs_factory.AbstractFactory;
import com.kzy._02abs_factory.color.entity.Blue;
import com.kzy._02abs_factory.color.entity.Green;
import com.kzy._02abs_factory.color.entity.Red;
import com.kzy._02abs_factory.shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}