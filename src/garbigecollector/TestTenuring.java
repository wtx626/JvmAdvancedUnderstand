package garbigecollector;

/**
 * Created by wutianxiong on 2017/3/29.
 */
public class TestTenuring {
    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[JvmUtils._1MB/4];
        allocation2=new byte[JvmUtils._1MB/4];
        allocation3=new byte[4*JvmUtils._1MB];
        allocation4=new byte[4*JvmUtils._1MB];
        allocation4=null;
        allocation4=new byte[4*JvmUtils._1MB];
    }
}
