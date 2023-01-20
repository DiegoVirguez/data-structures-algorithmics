package com.diego.practice.algoexpert.subsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateSubsequenceTest {

    @Test
    public void validate(){
        //Given
        int[] array = {5,1,22,25,6,-1,8,10};
        int [] sequence = {1,6,-1,10};
        //When
        boolean result = check(array , sequence);
        //Then
        assertEquals(true, check(array,sequence));
    }

    @Test
    public void validate2(){
        //Given
        int[] array = {1,2,3,4};
        int [] sequence = {1,3,4};
        //When
        boolean result = check(array , sequence);
        //Then
        assertEquals(true, check(array,sequence));
    }

    @Test
    public void validate3(){
        //Given
        int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
        int [] sequence = {22, 25, 6};
        //When
        boolean result = check(array , sequence);
        //Then
        assertEquals(true, check(array,sequence));
    }

    // O(n)  - time complexity where n is the lenght of the array
    //space o(1) -  we are not saveing nothing beigger solo unas cuantas variables
    private boolean check(int[] array, int[] sequence) {
        int cont = 0;
        for(int data : array){
            if (data == sequence[cont]){
                cont++;
            }
            if (cont==sequence.length)
                return true;
        }
        return false;
    }


}
