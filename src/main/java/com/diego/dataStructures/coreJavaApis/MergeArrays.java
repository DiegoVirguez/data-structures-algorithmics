package com.diego.dataStructures.coreJavaApis;

/*
 * [0,3,4,31] - [4,6,30]
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeArrays {


    public static void merge(){
    int[] a = {0, 3, 4, 31};
    int[] b = {4, 6, 30};

    List<Integer> c = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            c.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
        }

        System.out.println(c);
        Collections.sort(c);
        System.out.println(c);

    }

    public static void main(String[] args) {
        merge();
    }

}
