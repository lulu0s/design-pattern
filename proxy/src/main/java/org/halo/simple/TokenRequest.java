package org.halo.simple;

/**
 * 被代理对象
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class TokenRequest implements WiXiPost {
    @Override
    public void postRequest() {
        System.out.println("获取token");
    }
}
