package ch04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wutianxiong on 2017/5/2.
 */
public class MonitoringTest {
    public static void fileHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num;i++){
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fileHeap(1000);
    }
}
