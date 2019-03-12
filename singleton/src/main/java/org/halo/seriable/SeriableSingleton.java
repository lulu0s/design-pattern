package org.halo.seriable;

import java.io.Serializable;

/**
 * <p>虽然，增加 readResolve()方法返回实例，解决了单例被破坏的问题</p>
 * <p>但是，实际上实例化了两次，只不过新创建的对象没有被返回而已</p>
 * <p>如果，创建对象的动作发生频率增大，就意味着内存分配开销也就随之增大</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
//反序列化时导致单例破坏
public class SeriableSingleton implements Serializable {
    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个 IO 流，写入到其他地方(可以是磁盘、网络 IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为 IO 流
    //通过 IO 流的读取，进而将读取的内容转换为 Java 对象
    //在转换过程中会重新创建对象 new






    public final static SeriableSingleton INSTANCE = new SeriableSingleton();

    private SeriableSingleton() {
    }

    public static SeriableSingleton getInstance(){
        return INSTANCE;
    }

    //增加readResolve，保证序列化的情况下也能够实现单例
    private Object readResolve(){
        return INSTANCE;
    }
}
