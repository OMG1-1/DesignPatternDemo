package com.kzy._03singleton.enumWay;

public enum Singleton {
    INSTANCE;

    public void whateverMethod() {
        System.out.println("sb");
    }
}
class Test{
    public static void main(String[] args) {
        Singleton.INSTANCE.whateverMethod();
    }
}