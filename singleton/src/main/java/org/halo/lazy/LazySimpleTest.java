package org.halo.lazy;

/**
 * 懒汉式简单单例实现测试
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazySimpleTest {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new LazySimpleExectorThread());
//        Thread t2 = new Thread(new LazySimpleExectorThread());
//        t1.start();
//        t2.start();
//        System.out.println("END");
//
//
        LazyInnerClassSingleton lazy = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazy1 = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton lazy2 = LazyInnerClassSingleton.getInstance();
        System.out.println("lazy : "+lazy);
        System.out.println("lazy1 : "+lazy1);
        System.out.println("lazy2 : "+lazy2);
    }
}
