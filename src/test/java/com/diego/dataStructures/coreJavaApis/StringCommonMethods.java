package com.diego.dataStructures.coreJavaApis;

import org.junit.jupiter.api.Test;

public class StringCommonMethods {

    //El index tambien empieza de ceros
    @Test
    public void methods(){
        String string = "animals";
        //length() - numero de caracteres en el string
        System.out.println(string.length());

        //charAt() - consultar que caracter esta en el indice especifico
        System.out.println(string.charAt(0));  // a
        System.out.println(string.charAt(6));  // s

        //indexOf() -  looks at the characters in the string and finds the first index that matches the desired value
        System.out.println(string.indexOf('a'));         // 0
        System.out.println(string.indexOf("al"));        // 4
        System.out.println(string.indexOf("a", 4));      // 4
        System.out.println(string.indexOf("al", 5)); // -1

        // subString : entre 0 y 1 es el primer string |a|n|i|m|a|l|s| (ultima posicion seria la 7)
        System.out.println(string.substring(3));                   // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4));                // m
        System.out.println(string.substring(3, 7));             // mals

        // lowerCase and UpperCase
        System.out.println(string.toUpperCase());  // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123

        //equals() and equalsIgnoreCase()
        System.out.println("abc".equals("ABC"));  // false
        System.out.println("ABC".equals("ABC"));  // true
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true

        //startsWith() and endsWith()
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        //replace()
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc    - usa char
        System.out.println("abcabc".replace("a", "A")); // AbcAbc   - usa string

        //contains()
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        //trim(), strip(), stripLeading(), and stripTrailing()
        System.out.println("abc".strip());                 // abc
        System.out.println("\t   a b c\n".strip());        // a b c

        String text = " abc\t ";
        System.out.println(text.trim().length());         // 3
        System.out.println(text.strip().length());        // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4
    }

}
