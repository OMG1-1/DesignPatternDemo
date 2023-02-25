package com.kzy._03singleton.lazy;

/**
 * CREATE BY 寇帅帅 ON 2023.02.23 21:28 星期四
 * DESC:
 */
public class LazySafeSingleton {
    private static LazySafeSingleton instance;

    private LazySafeSingleton() {

    }

    public static synchronized LazySafeSingleton getInstance() {
        if (instance == null) {
            instance = new LazySafeSingleton();
        }
        return instance;
    }

}
