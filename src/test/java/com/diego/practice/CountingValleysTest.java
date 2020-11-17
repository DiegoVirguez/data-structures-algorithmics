package com.diego.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingValleysTest {

    CountingValleys cv = new CountingValleys();

    @Test
    public void countingValleysTest(){
        int steps=8;
        String array="UDDDUDUU" ;
        assertEquals(1, cv.countingValleys(8,array));
    }

    @Test
    public void countingTwoValleysTest(){
        int steps=8;
        String array="UDDDUDUUUUDDDU" ;
        assertEquals(2, cv.countingValleys(14,array));
    }
}
