package org.halo.seriable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化破坏单例
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class SeriableSingletonTest {
    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton)ois.readObject();
            ois.close();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);
            //运行结果：反序列化后的对象和手动创建的对象是不一致的，实例化了两
            //次，违背了单例的设计初衷。
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
