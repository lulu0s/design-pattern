package org.halo.custom;


import java.lang.reflect.Method;

/**
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class CSProxy {
    public static final String ln = "\r\n";
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,CSInvocationHandler h){
        //1.动态生成源代码.java文件

        //2.Java文件输出磁盘

        //3.把生成的.java文件编译成.class文件

        //4.编译生成的.class文件加载到JVM中来

        //5.返回字节码重组以后的新的代理类
        return null;
    }

    private static String generateSrc(Class<?>[] interfaces){
        StringBuffer sb = new StringBuffer();
        sb.append("package org.halo.custom;"+ln);
        sb.append("import org.halo.dynamic.Person;"+ln);
        sb.append("import java.lang.reflect.Method;"+ln);
        sb.append("public class $Proxy1 implements "+interfaces[0].getName()+"{"+ln);
            sb.append("CSInvocationHandler h;"+ln);
        sb.append("}"+ln);
        return null;
    }
}
