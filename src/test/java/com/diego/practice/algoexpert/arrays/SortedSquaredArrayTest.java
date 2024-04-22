package com.diego.practice.algoexpert.arrays;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortedSquaredArrayTest {

     String test = new String();

    @Test
    public void sortedSquaredArray() {
        //Give
        int[] sortedSquaredArray = {1, 2, 3, 5, 6, 8, 9};
        int[] output = {1, 4, 9, 25, 36, 64, 81};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    @Test
    public void sortedSquaredArray2() {
        //Give
        int[] sortedSquaredArray = {1};
        int[] output = {1};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    @Test
    public void sortedSquaredArray3() {
        //Give
        int[] sortedSquaredArray = {-1, -1, 2, 3, 3, 3, 4};
        int[] output = {1,1,4,9,9,9,16};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    @Test
    public void sortedSquaredArray4() {
        //Give
        int[] sortedSquaredArray = {-3,-2,-1};
        int[] output = {1,4,9};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    @Test
    public void sortedSquaredArray5() {
        //Give
        int[] sortedSquaredArray = {0,0,0};
        int[] output = {0,0,0};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    @Test
    public void sortedSquaredArray6() {
        //Give
        int[] sortedSquaredArray = {-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        int[] output = {0,0,1,1,1,4,4,9,169,361,400,2500};
        //When
        int[] result = processArray(sortedSquaredArray);
        //test
        assertArrayEquals (output, result);
    }

    // time complexity: o(n)
    // space complexity: O(n)
    private int[] processArray(int[] sortedSquaredArray) {
        int[] result = new int[sortedSquaredArray.length];
       // Map<String, String> map = new TreeMap<>();
        for (int i = 0; i <sortedSquaredArray.length ; i++) {
                result[i] = sortedSquaredArray[i]*sortedSquaredArray[i];
        }
     //   Arrays.sort(result);

        return result;
    }
    // possible soluction
    // adding cheking si es menor o mayor


}
