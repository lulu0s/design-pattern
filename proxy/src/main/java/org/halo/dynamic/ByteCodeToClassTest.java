package org.halo.dynamic;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class ByteCodeToClassTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findObject();

            //通过反编译工具可以查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("F://halo_lu//预习//20190310//$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
