package org.halo.dynamic;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class JDKProxyTest {
    public static void main(String[] args) {
       Person obj = (Person) new JDKMeipo().getInstance(new Customer());
       obj.findObject();
    }
}
