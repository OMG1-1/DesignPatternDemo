package com.kzy._01factory.entity;

import com.kzy._01factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}