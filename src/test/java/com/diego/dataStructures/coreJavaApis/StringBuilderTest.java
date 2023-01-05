package com.diego.dataStructures.coreJavaApis;

import org.junit.jupiter.api.Test;

public class StringBuilderTest {

    // cuando remplazo un string este se vuelve candidato a el garbage collection porque un stirng es inmutable
    // es ineficiente por eso es mejor usar string builder ( StringBuilder is not immutable.)
    @Test
    public void stringBuilderCommon() {

        StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);

        //charAt(), indexOf(), length(), and substring()
        //append()
        //insert() - adiiconal tiene un index
        //delete() and deleteCharAt()

        //replace()
        StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);

        //toString()



    }

}
