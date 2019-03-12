package org.halo.lazy;

/**
 * 静态内部类方式的单例
 * <p>兼顾饿汉式的内存浪费，也兼顾synchronized 性能问题</p>
 *
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazyInnerClassSingleton {
    //默认使用LazyInnerClassSingleton的时候，会先初始化内部类
    //如果没有使用的话，内部类是不加载的
    private LazyInnerClassSingleton() {
        if(LazyHolder.LAZY != null){
            throw new RuntimeException("不予许创建多个实例");
        }
    }

    //默认不加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    //没一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerClassSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }

}
