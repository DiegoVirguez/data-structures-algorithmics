package com.diego.practice.algoexpert.arrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervalTest {

    @Test
    public void insertInterval(){
        //Given
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] result = {{1,5},{6,9}};

        //when
        int[][] output = insert(intervals, newInterval);
        //then

        //assertArrayEquals(output, result);
    }

    public int [][] insert( int[][] intervals,  int[] newInterval){
        //identificar cuales se suporponen
        List<int[]> list = new ArrayList<>();
        for(int [] interval: intervals){

                if(interval[0] <=  newInterval[0] &&  interval[1] <=  newInterval[1]){
                    list.add(interval);
            } else if (interval[0] >  newInterval[0] &&  interval[1] <  newInterval[1]) {
                    list.add(interval);
                }
                else if (interval[0] <=  newInterval[0] &&  interval[1] <  newInterval[1]) {
                    list.add(interval);
                }
        }
        list.forEach((x) -> {
            System.out.println(Arrays.toString(x));
        });
        return new int[1][1];
    }

}
