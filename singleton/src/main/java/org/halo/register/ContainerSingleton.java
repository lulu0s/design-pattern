package org.halo.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器缓存
 * <p>容器式写法适用于创建实例非常多的情况，便于管理。但是，是非线程安全的。</p>
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
    public static Object getBean(String className){
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    ioc.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }
}
