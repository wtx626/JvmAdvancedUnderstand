package ch07;

/**
 * Created by wutianxiong on 2017/5/5.
 */
public class ConstClass {
    static {
        System.out.println("constclass init");
    }

    public static final String HELLOWORLD="hello world";
}
