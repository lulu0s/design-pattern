package org.halo.lazy;

/**
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class LazySimpleExectorThread implements Runnable{
    public void run() {
        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" : "+simpleSingleton);
    }
}
