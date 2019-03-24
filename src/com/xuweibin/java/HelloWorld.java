package com.xuweibin.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author xuweibin
 * @date 2019/3/20 - 20:58
 */
public class HelloWorld {
    public static void main(String[] args){

        //region Description
        System.out.println("hello world");

        System.out.println("hello world");
        Date date = new Date();
        ArrayList<Integer> list1 = new ArrayList<>();
        //endregion
        list1.add(1);
//        method1111();

    }

    public static void method1111(){

        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
        System.out.println();
    }
}
