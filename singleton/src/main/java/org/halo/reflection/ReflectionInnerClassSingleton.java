package org.halo.reflection;

import org.halo.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class ReflectionInnerClassSingleton {
    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            //通过反射拿到私有的构造方法
            Constructor c = clazz.getDeclaredConstructor(null);

            //强制访问
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();

            Object o2 = c.newInstance();

            System.out.println(o1 == o2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
