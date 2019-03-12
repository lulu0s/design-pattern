package org.halo.simple;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class PrototypeTest {
    public static void main(String[] args) {
        //创建一个具体的需要克隆的对象
        ConcretePrototypeA concretePrototypeA = new ConcretePrototypeA();
        //填充属性，方便测试
        concretePrototypeA.setName("原型模式");
        concretePrototypeA.setAge(3);
        List hobbies = new ArrayList<String>();
        concretePrototypeA.setHobbies(hobbies);
        System.out.println(concretePrototypeA);

        //创建client对象，准备开始克隆
        Client client = new Client(concretePrototypeA);
        ConcretePrototypeA clone = (ConcretePrototypeA) client.startClone(concretePrototypeA);
        System.out.println(clone);



        System.out.println("克隆对象中的引用类型地址值：" + clone.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + concretePrototypeA.getHobbies());
        System.out.println("对象地址比较："+(clone.getHobbies() == concretePrototypeA.getHobbies()));

//        org.halo.simple.ConcretePrototypeA@4554617c
//        org.halo.simple.ConcretePrototypeA@74a14482
//        克隆对象中的引用类型地址值：[]
//        原对象中的引用类型地址值：[]
//        对象地址比较：true

        //hobbies的引用地址是相同的，意味着复制的不是值，而是引用地址。=====>>>浅克隆

    }
}
