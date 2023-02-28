package com.kzy._20observer;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}