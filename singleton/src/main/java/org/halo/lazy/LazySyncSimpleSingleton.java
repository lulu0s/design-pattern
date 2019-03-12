package org.halo.lazy;

/**
 * 懒汉式简单单例实现线程安全
 * <p>用synchronized 加锁，在线程数量比较多情况下，如果 CPU 分配压力上升，会导致大批量线程出现阻塞，从而导致程序运行性能大幅下降<</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazySyncSimpleSingleton {
    private LazySyncSimpleSingleton() {
    }
    private static LazySyncSimpleSingleton lazy = null;
    public synchronized static LazySyncSimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySyncSimpleSingleton();
        }
        return lazy;
    }

}
