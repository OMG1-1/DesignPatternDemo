package com.kzy._03singleton.dcl;

/**
 * CREATE BY 寇帅帅 ON 2023.02.23 21:37 星期四
 * DESC: 采用双锁机制，安全且在多线程下能保持高性能
 */
public class DCLSingleton {
    private volatile static DCLSingleton singleton;
    private DCLSingleton(){

    }
    public static DCLSingleton getSingleton(){
        if (singleton == null) {
            synchronized (DCLSingleton.class){
                if (singleton == null){
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
