package opentsdbtest;

import java.util.concurrent.TimeUnit;

/**
 * Created with foruse.
 * User: hzyuqi1
 * Date: 2016/11/21
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */

public class TestTwo {

    /*
    public static void main(String [] args){
        Long a = 1479729422L;
        Long b = a - a%3600;

        Long a1 = 0XFD0DCC03L & 0X0FFFFFFFL;
        Long a2 = 0XF0772403L & 0X0FFFFFFFL;
        Long a3 = 0XF19C1C03L & 0X0FFFFFFFL;
        System.out.printf("%X\n",b);
        System.out.println(b);
        System.out.println("a1 = " + ((a1 >> 6)/1000 + 1479726000) );
        System.out.println("a2 = " + ((a2 >> 6)/1000 + 1479726000));
        System.out.println("a3 = " + ((a3 >> 6)/1000 + 1479726000));

        byte data1 = -18 ;
        byte data2 = -116 ;
        int data3 = 0X9D ;
        System.out.printf("-18 = %X\n",data1);
        System.out.printf("-18 = %X\n",data2);
        System.out.printf("-18 = %X\n",data3);
        System.out.printf("%d\n",(int)data3);

        Long time = 0X57EE8C00L;
        System.out.println(time);
    }*/
    private static class One{
        public Long data = 0L;

        public One(Long data) {
            this.data = data;
        }

        public One() {
        }

        public Long getData() {
            return data;
        }

        public void setData(Long data) {
            this.data = data;
        }
    }

    public static void main(String [] args){

        Long a = 0L ;
        update(a);
        System.out.println(a);
        System.out.println(System.currentTimeMillis());
        try{
            //TimeUnit.SECONDS.sleep(1);
            //Thread.currentThread().sleep(1000);
            //Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis());

        One one = new One();
        update(one);
        System.out.println(one.getData());


    }
    private static void update(Long a){
        a = a + 1 ;
    }

    private static void update(One one){
        one.setData(2L);
    }
}
