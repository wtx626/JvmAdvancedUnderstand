package garbigecollector;

import static garbigecollector.JvmUtils._1MB;

/**
 * Created by wutianxiong on 2017/3/25.
 */
public class TestAllocation {

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 =new byte[2*JvmUtils._1MB];
        allocation2 =new byte[2*JvmUtils._1MB];
        allocation3 =new byte[2*JvmUtils._1MB];
        allocation4 =new byte[4*JvmUtils._1MB];
    }
}
