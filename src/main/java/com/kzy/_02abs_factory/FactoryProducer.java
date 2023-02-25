package com.kzy._02abs_factory;

import com.kzy._02abs_factory.color.ColorFactory;
import com.kzy._02abs_factory.shape.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}