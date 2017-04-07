/**
 * Created by wutianxiong on 2017/3/11.
 */

public class HeapTest {
    public static void main(String[] args) {
        //堆内存测试
//        List<OomObj> list=new ArrayList<>();
//        while (true){
//            list.add(new OomObj());
//        }
        //方法区内存测试
//        String str1="jsj";//直接放常量池
//        System.out.println(str1.intern()==str1);//intern返回在常量池中的应用
//        String str2="jsj";
//        System.out.println(str2.intern()==str2);
        //在我们调用String.intern的时候其实就是先去这个StringTable里查找是否存在一个同名的项，
        //如果存在就直接返回对应的第一个对象，否则就往这个table里插入一项，指向这个String对象，
        //那么再下次通过intern再来访问同名的String对象的时候，就会返回上次插入的这一项指向的String对象
        String str3=new StringBuilder("JISUAN").append("ok").toString();
        System.out.println(str3.intern()==str3);

        String str5=new StringBuilder("JISUAN").append("ok").toString();
        System.out.println(str5.intern()== str5);

        String str6=new StringBuilder("JISUAN").append("ok").toString();
        System.out.println(str6.intern()== str3);

        String str4=new StringBuilder("jkl").append("swift").toString();
        System.out.println(str4.intern()==str4);

        String s3 = new String("1") + new String("1");

        String s4 = "11";
        s3.intern();
        System.out.println( s3== s4);
//        String s = new String("1");
//        String s2 = "1";
//        s.intern();
//        System.out.println(s == s2);
//
//        String s3 = new String("1") + new String("1");
//        String s4 = "11";
//        s3.intern();
//        System.out.println(s3 == s4);
    }
}
