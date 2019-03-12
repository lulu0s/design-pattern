package org.halo.hungry;

/**
 * 懒汉式静态块单例
 * <p>声明静态常量的实例变量，静态代码块初始化，显式私有无参构造函数，静态方法得到实例对象</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class HungryStaticSingleton {
    private static  final HungryStaticSingleton staticSingleton ;

    static {
        staticSingleton = new HungryStaticSingleton();
    }

    private HungryStaticSingleton() {

    }

    public static HungryStaticSingleton getInstance(){
        return staticSingleton;
    }
}
