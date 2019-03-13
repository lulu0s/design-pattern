package org.halo.simple;

/**
 * 代理对象
 * @author halo.lu , created at 2019-03-13
 * @version 1.0.0
 * @since jdk1.8
 */
public class Proxy {
    private WiXiPost xiPost ;

    public Proxy(WiXiPost xiPost) {
        this.xiPost = xiPost;
    }
    public void postRequest(){
        System.out.println("组装APPID,SECERT");
        System.out.println("执行POST请求");
        this.xiPost.postRequest();
        System.out.println("执行结束");
    }
}
