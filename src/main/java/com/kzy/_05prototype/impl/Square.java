package com.kzy._05prototype.impl;

import com.kzy._05prototype.Shape;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}