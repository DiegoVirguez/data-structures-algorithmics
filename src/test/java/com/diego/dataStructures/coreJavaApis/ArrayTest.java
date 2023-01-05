package com.diego.dataStructures.coreJavaApis;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayTest {

    @Test
    public void loopArray(){
        int[] numbers2 = {42, 55, 99};
        String [] mamals = {"monkey", "chimp", "donkey"};

       for(String data : mamals){
           System.out.println(data);
       }

       //sorting
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + ' ');

        //otra forma de aprender el array
        System.out.println( Arrays .toString(strings));

        // searching (binary search - el array debe estar ordenado)
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        // compare() - comparing the arrays - which is “smaller.”
        /*
        - A negative number means the first array is smaller than the second.
        - A zero means the arrays are equal.
        - A positive number means the first array is larger than the second.
        */
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

        //mismatch()
        System.out.println(Arrays.mismatch(new int[] {1}, new int[] {1}));
        System.out.println(Arrays.mismatch(new String[] {"a"},
                new String[] {"A"}));
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[] {1}));


    }
}
