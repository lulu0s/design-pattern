package org.halo.deepclone;

import java.io.Serializable;

/**
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class JinguBang implements Serializable{
    public float h = 100;
    public float d = 10;

    public  void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /=2;
        this.h /=2;
    }
}
