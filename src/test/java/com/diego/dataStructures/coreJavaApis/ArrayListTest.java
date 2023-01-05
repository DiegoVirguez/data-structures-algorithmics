package com.diego.dataStructures.coreJavaApis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

    @Test
    public void testArrayList() {

        //using var to create the ArrayList
        var strings = new ArrayList<String>();
        strings.add("a");
        for (String s: strings) {  }

        // tambien usar toString para poder imprimirlo facilmente y ver su resultado

        //add()
        //remove()
        //set() - changes one of the elements of the ArrayList without changing the size.
        //isEmpty() and size()
        //clear() - discard all the elements
        //contains() -  checks whether a certain value is in the ArrayList
        //equals() - compare two lists to see whether they contain the same elements in the same order

        //USING VARARGS TO CREATE A LIST
        // importante, esto crea una matriz de tamano fijo. Si necesito cambiar crear una con el constructor
        List<String> list1 = Arrays.asList("one", "two");
        List<String> list2 = List.of("one", "two");

        //Sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); // [5, 81, 99]

    }
}
