package org.halo.custom;

import java.lang.reflect.Method;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public interface CSInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
