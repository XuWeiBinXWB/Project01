package com.xuweibin.java;

import java.util.ArrayList;

/**
 * @author xuweibin
 * @date 2019/3/20 - 23:22
 */
public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println();
        System.out.printf("");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num=1;
        int num1=1;
        int num3=2;
        System.out.println("num3 = " + num3);
        System.out.println(num1);
        Integer[] i = new Integer[]{1,2,3,4,5,6,7,8,9,0};
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
        for (Integer integer : i) {
            System.out.println(integer);
        }
        for (int j = 0; j < i.length; j++) {
            Integer integer = i[j];

        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Integer integer : list) {

        }
        for (int i1 = 0; i1 < list.size(); i1++) {

        }
        for (int i1 = list.size() - 1; i1 >= 0; i1--) {

        }
        if (list == null) {

        }



    }

    public static void meth(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list != null) {

        }
        if (list == null) {

        }
    }
    public static final int NUM = 2;
}
