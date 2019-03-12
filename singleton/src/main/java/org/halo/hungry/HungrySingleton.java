package org.halo.hungry;

/**
 * 类加载的时候就立即初始化，并且创建单例对象
 * <p>声明静态常量的实例变量，并初始化，显式私有无参构造方法，静态方法得到实例对象。</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class HungrySingleton {
    //先静态、后动态
    //先属性、后方法
    //先上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
