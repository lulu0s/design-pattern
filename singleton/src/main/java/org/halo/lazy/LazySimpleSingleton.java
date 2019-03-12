package org.halo.lazy;

/**
 * 懒汉式单例
 * <p>在外部需要使用的时候才进行实例化</p>
 * <p>一定几率出现创建两个不同结果的情况，意味着该单例存在线程安全隐患</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;

    public static  LazySimpleSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}
