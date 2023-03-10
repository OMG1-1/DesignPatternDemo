package com.kzy._02abs_factory;

import com.kzy._02abs_factory.color.Color;
import com.kzy._02abs_factory.shape.Shape;

public abstract class AbstractFactory {
   public abstract Color getColor(String color);
   public abstract Shape getShape(String shape);
}