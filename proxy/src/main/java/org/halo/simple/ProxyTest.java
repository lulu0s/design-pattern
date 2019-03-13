package org.halo.simple;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new TokenRequest());
        proxy.postRequest();
    }
}
