package com.kzy._31intercepting_filter;

public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}