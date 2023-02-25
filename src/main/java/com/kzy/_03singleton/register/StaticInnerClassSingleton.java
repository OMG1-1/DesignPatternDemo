package com.kzy._03singleton.register;

/**
 * CREATE BY 寇帅帅 ON 2023.02.23 21:41 星期四
 * DESC: 这种方式能达到双检锁方式一样的功效，但实现更简单。
 * <p>
 * 如果实例化 instance 很消耗资源，所以想让它延迟加载；
 * 另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保 Singleton 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的
 * 这个时候，这种方式相比饿汉式的方式就显得很合理。
 */
public class StaticInnerClassSingleton {
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton STATIC_INNER_CLASS_SINGLETON = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton() {

    }

    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.STATIC_INNER_CLASS_SINGLETON;
    }
}
