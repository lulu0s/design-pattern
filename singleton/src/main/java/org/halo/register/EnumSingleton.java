package org.halo.register;

/**
 * 枚举式单例
 * @author halo.lu , created at 2019-03-11
 * @version 1.0.0
 * @since jdk1.8
 */
public enum  EnumSingleton {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
