package comatguigu.java;

import java.util.ArrayList;

/**
 * @author jsong.
 * @create 2021-02-08 9:14
 */
public class TemplatesTest {

    public static void main(String[] args) {

        /*System.out.println("hello");
        int num=1;
        System.out.println("num = " + num);*/

        String[]arr=new String[]{"json","json2","json3"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }


        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(11);
        objects.add(111);
        for (Object object : objects) {
            System.out.println(object);
        }


    }

}
