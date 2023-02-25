package com.kzy._02abs_factory.shape;

import com.kzy._02abs_factory.AbstractFactory;
import com.kzy._02abs_factory.color.Color;
import com.kzy._02abs_factory.shape.entity.Circle;
import com.kzy._02abs_factory.shape.entity.Rectangle;
import com.kzy._02abs_factory.shape.entity.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}