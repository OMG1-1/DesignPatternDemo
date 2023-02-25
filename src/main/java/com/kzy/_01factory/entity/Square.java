package com.kzy._01factory.entity;

import com.kzy._01factory.Shape;

/**
 * CREATE BY 寇帅帅 ON 2023.02.23 18:56 星期四
 * DESC:
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
