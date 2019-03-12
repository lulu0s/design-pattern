package org.halo.deepclone;

/**
 * @author halo.lu , created at 2019-03-12
 * @version 1.0.0
 * @since jdk1.8
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();

        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆： "+ (qiTianDaSheng.jinguBang == clone.jinguBang));
        } catch (Exception e) {
            e.printStackTrace();
        }

        QiTianDaSheng daSheng = new QiTianDaSheng();
        QiTianDaSheng daShengSha = daSheng.shallowClone(daSheng);
        System.out.println("浅克隆： " + (daSheng.jinguBang == daShengSha.jinguBang));
    }
}
