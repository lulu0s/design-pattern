package org.halo.lazy;

/**
 * 双重检查锁的单例
 * <p>阻塞并不是基于整个 LazySimpleSingleton 类的阻塞，而是在 getInstance()方法内部阻塞，只要逻辑不是太复杂，对于调用者而言感知不到。</p>
 * <p>但是，用到 synchronized 关键字，总归是要上锁，对程序性能还是存在一定影响的</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazy == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazy == null){
                    lazy = new LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置 lazy 指向刚分配的内存地址
                }
            }
        }
        return lazy;
    }
}
